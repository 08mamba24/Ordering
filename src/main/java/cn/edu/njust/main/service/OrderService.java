package cn.edu.njust.main.service;


import cn.edu.njust.main.mapper.TableoneMapper;

import cn.edu.njust.main.model.Tableone;
import cn.edu.njust.main.model.TableoneExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class OrderService {
    @Autowired
    private TableoneMapper tableoneMapper;
    @Autowired
     SettingService settingService;

    public boolean canReserve(int persons, Date reserve_date)//能否预订
    {
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andIdIsNotNull().andDateEqualTo(reserve_date);
        List<Tableone> hasReserved=tableoneMapper.selectByExample(tableoneExample);
        if(hasReserved==null)return true;
        if(hasReserved.size()==0)return true;
        int count=0;
        for (int i=0;i<hasReserved.size();i++) {
            count+=hasReserved.get(i).getHeadCount();
        }
        if(persons+count<=settingService.getSetting().getTableNumber()*settingService.getSetting().getPersonPerTable())
            return true;
        else return false;
    }

    public boolean hasReserverdInTwo(String phone,Date reserve_date)//两天内已经预订过
    {
        long current=new Date().getTime();//当前时间毫秒数
        Date yestday=new Date(current-24*60*60*1000);
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andPhoneNumberEqualTo(phone).andDateGreaterThan(yestday);
        List<Tableone> result=tableoneMapper.selectByExample(tableoneExample);
       if(result!=null&result.size()>0)return true;
       return false;
    }

    public void reserve(String phone,Date date,Integer headCount)//插入预订记录
    {
        Tableone tableone=new Tableone();
        tableone.setDate(date);
        tableone.setHeadCount(headCount);
        tableone.setPhoneNumber(phone);
        tableone.setWantShare(0);
        tableoneMapper.insert(tableone);
    }

    public boolean cancel(String phone)//取消预订接口
    {
        long current=new Date().getTime();//当前时间毫秒数
        long tonight=current+settingService.getSetting().getTodayLatestReserveTime()*60*60*100;
        long zero=current/(1000*3600*24)*(1000*3600*24)- TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        Date deadLine;
        if(current<=tonight) deadLine=new Date(zero);
        else deadLine=new Date(zero+24*60*60*1000);
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andPhoneNumberEqualTo(phone).andDateGreaterThan(deadLine);
        List<Tableone> result= tableoneMapper.selectByExample(tableoneExample);
        if(result!=null&&result.size()>0)
        {
            tableoneMapper.deleteByPrimaryKey(result.get(0).getId());
            return true;

        }
        else{
            return false;
        }
    }

    public boolean checkDate(Date nowDate,Date reserveDate){
        long current=nowDate.getTime();//当前时间毫秒数
        long reserve=reserveDate.getTime();//预订的时间的毫秒数
        long zero=current/(1000*3600*24)*(1000*3600*24)- TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        long todaySeven=zero+settingService.getSetting().getTodayLatestReserveTime()*60*60*1000;//今天19点00分00秒的毫秒数
        if(current<=todaySeven&&reserve-zero==24*60*60*1000) return true;
        if(current<=todaySeven&&reserve-zero==0) return true;
        if(current>todaySeven&&reserve-zero==24*60*60*1000) return true;
        if(current>todaySeven&&reserve-zero==settingService.getSetting().getReserveSpan()*24*60*60*1000) return true;

        return false;
    }//检查订单
}
