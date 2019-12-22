package cn.edu.njust.main.service;

import cn.edu.njust.main.mapper.SettingMapper;
import cn.edu.njust.main.model.Setting;
import cn.edu.njust.main.model.SettingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class SettingService {
    @Autowired
   private SettingMapper settingMapper;

    public Setting getSetting(){
        return settingMapper.selectByPrimaryKey(1);//插入id为1记录，方便调整基本参数
    }
}
