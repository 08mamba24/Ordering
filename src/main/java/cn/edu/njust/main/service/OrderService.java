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

    public boolean canReserve(int persons, Date reserve_date)
    {
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andIdIsNotNull().andDateEqualTo(reserve_date);
        List<Tableone> hasReserved=tableoneMapper.selectByExample(tableoneExample);
        if(hasReserved==null)return true;
        int count=0;
        for (Tableone item:hasReserved) {
            count+=item.getHeadCount();
        }
        if(persons+count<settingService.getSetting().getTableNumber()*settingService.getSetting().getPersonPerTable())
            return true;
        return false;
    }

    public boolean hasReserverdByPhone(String phone)
    {
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andPhoneNumberEqualTo(phone);
        List<Tableone> result=tableoneMapper.selectByExample(tableoneExample);
       if(result!=null&result.size()>0)return true;
       return false;
    }

    public void reserve(String phone,Date date,Integer headCount)
    {
        Tableone tableone=new Tableone();
        tableone.setDate(date);
        tableone.setHeadCount(headCount);
        tableone.setPhoneNumber(phone);
        tableone.setWantShare(0);
        tableoneMapper.insert(tableone);
    }

    public boolean cancel(String phone)
    {
        TableoneExample tableoneExample=new TableoneExample();
        tableoneExample.createCriteria().andPhoneNumberEqualTo(phone);
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
        long todaySeven=zero+19*60*60*1000;//今天19点00分00秒的毫秒数
        if(current<=todaySeven&&reserve-zero==24*60*60*1000) return true;
        if(current<=todaySeven&&reserve-zero==0) return true;
        if(current>todaySeven&&reserve-zero==24*60*60*1000) return true;
        if(current>todaySeven&&reserve-zero==2*24*60*60*1000) return true;

        return false;
    }
}
