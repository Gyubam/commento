package com.devfun.settingweb_boot.dao;
import java.util.ArrayList;
import java.util.HashMap;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    
    public HashMap<String, Object> selectMonthLogin(String month);
    
    public HashMap<String, Object> selectDateLogin(String Date);
    
    public HashMap<String, Object> selectDateAvgLogin();
 
    public String[] selectAllDateLogin();
    
    public HashMap<String, Object> selectmonthLoginWithDept(String dept, String month);
    
}