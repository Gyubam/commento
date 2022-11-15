package com.devfun.settingweb_boot.service;
 
import java.util.ArrayList;
import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDateAvgDto;
import com.devfun.settingweb_boot.dto.StatisticDateDto;
import com.devfun.settingweb_boot.dto.StatisticDateExceptHolidayDto;
import com.devfun.settingweb_boot.dto.StatisticMonthDto;
import com.devfun.settingweb_boot.dto.StatisticMonthWithDeptDto;
import com.devfun.settingweb_boot.dto.StatisticYearDto;
 
public interface StatisticService {
    public StatisticYearDto yearloginNum (String year);
    
    public StatisticMonthDto monthloginNum (String month);
    
    public StatisticDateDto dateloginNum (String date);
    
    public StatisticDateAvgDto dateAvgloginNum();
    
    public StatisticDateExceptHolidayDto dateAllLoginExceptHoliday();
    
    public StatisticMonthWithDeptDto monthLoginNumWithDept(String dept, String month);
    
}