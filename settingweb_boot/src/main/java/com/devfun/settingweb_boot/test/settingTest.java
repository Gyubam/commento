package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.StatisticDateAvgDto;
import com.devfun.settingweb_boot.dto.StatisticDateDto;
import com.devfun.settingweb_boot.dto.StatisticDateExceptHolidayDto;
import com.devfun.settingweb_boot.dto.StatisticMonthDto;
import com.devfun.settingweb_boot.dto.StatisticMonthWithDeptDto;
import com.devfun.settingweb_boot.dto.StatisticYearDto;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/statistic-year")
    public StatisticYearDto sqlYearStatistic(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody 
    @RequestMapping("/statistic-month")
    public StatisticMonthDto sqlMonthStatistic(String month) throws Exception{ 
        
        return service.monthloginNum(month);
    }
    
    @ResponseBody 
    @RequestMapping("/statistic-date")
    public StatisticDateDto sqlDateStatistic(String date) throws Exception{ 
        
        return service.dateloginNum(date);
    }
    
    @ResponseBody 
    @RequestMapping("/statistic-date-avg")
    public StatisticDateAvgDto sqlDateAvgStatistic() throws Exception{ 
        
        return service.dateAvgloginNum();
    }
    
    @ResponseBody 
    @RequestMapping("/statistic-date-except-holiday")
    public StatisticDateExceptHolidayDto sqlDateStatisticExceptHoliday() throws Exception{ 
        
        return service.dateAllLoginExceptHoliday();
    }
    
    @ResponseBody 
    @RequestMapping("/statistic-month-with-dept")
    public StatisticMonthWithDeptDto sqlmonthStatisticWithDept(String dept, String month) throws Exception{ 
        
        return service.monthLoginNumWithDept(dept, month);
    }
    
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}