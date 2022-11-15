package com.devfun.settingweb_boot.service;
 
 
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.StatisticDateAvgDto;
import com.devfun.settingweb_boot.dto.StatisticDateDto;
import com.devfun.settingweb_boot.dto.StatisticDateExceptHolidayDto;
import com.devfun.settingweb_boot.dto.StatisticMonthDto;
import com.devfun.settingweb_boot.dto.StatisticMonthWithDeptDto;
import com.devfun.settingweb_boot.dto.StatisticYearDto;
 
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    static String[] holiday = { "170101","170127","170128","170129","170130",
    		 "170301","170503","170505","170509","170606",
    		 "180101","180215","180216","180217","180301",
    		 "180505","180507","180522","180606","180613",
    		 "190101","190204","190205","190206","190301",
    		 "190505","190506","190512","190606","190815",
    		 "200101","200124","200125","200126","200127",
    		 "200301","200415","200430","200505","200606",
    		 "210101","210211","210212","210213","210301",
    		 "210505","210519","210606","210815","210816",
    		 "220101","220131","220201","220202","220301",
    		 "220309","220505","220508","220601","220606"};
    
    @Override
    public StatisticYearDto yearloginNum (String year) {

    	HashMap<String, Object> retVal = new HashMap<String,Object>();
        StatisticYearDto dto = new StatisticYearDto();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            dto.setTotCnt(Integer.parseInt(retVal.get("totCnt").toString()));
            dto.setYear(Integer.parseInt(year));
            dto.setIs_success(true);

            
        }catch(Exception e) {
            dto.setTotCnt(-999);
            dto.setYear(Integer.parseInt(year));
        	dto.setIs_success(false);
        }
        
        return dto;
    }

	@Override
	public StatisticMonthDto monthloginNum(String month) {

		HashMap<String, Object> retVal = new HashMap<String,Object>();
		StatisticMonthDto dto = new StatisticMonthDto();
		
		try {
            retVal = uMapper.selectMonthLogin(month);
            dto.setTotCnt(Integer.parseInt(retVal.get("totCnt").toString()));
            dto.setMonth(Integer.parseInt(month));
            dto.setIs_success(true);

            
        }catch(Exception e) {
            dto.setTotCnt(-999);
            dto.setMonth(Integer.parseInt(month));
        	dto.setIs_success(false);
        }
        
        return dto;
	}

	@Override
	public StatisticDateDto dateloginNum(String date) {

		HashMap<String, Object> retVal = new HashMap<String,Object>();
		StatisticDateDto dto = new StatisticDateDto();
		
		try {
            retVal = uMapper.selectDateLogin(date);
            dto.setTotCnt(Integer.parseInt(retVal.get("totCnt").toString()));
            dto.setDate(Integer.parseInt(date));
            dto.setIs_success(true);

            
        }catch(Exception e) {
            dto.setTotCnt(-999);
            dto.setDate(Integer.parseInt(date));
        	dto.setIs_success(false);
        }
        
        return dto;
	}

	@Override
	public StatisticDateAvgDto dateAvgloginNum() {
		
		HashMap<String, Object> retVal = new HashMap<String,Object>();
		StatisticDateAvgDto dto = new StatisticDateAvgDto();
		
		try {
            retVal = uMapper.selectDateAvgLogin();
            System.out.println(retVal.get("average"));
            dto.setAverage(retVal.get("average").toString()+ " 회");
            dto.setIs_success(true);

            
        }catch(Exception e) {
            dto.setAverage("-999");
        	dto.setIs_success(false);
        }
        
        return dto;
		
	}

	@Override
	public StatisticDateExceptHolidayDto dateAllLoginExceptHoliday() {
		String[] retVal = null;
		StatisticDateExceptHolidayDto dto = new StatisticDateExceptHolidayDto();
		
		int sum = 0;
		
		try {
			retVal = uMapper.selectAllDateLogin();
			// ex) 210606
            for(String day : retVal) {
            	String year = "20" + day.substring(0,2);
            	String month = day.substring(2,4);
            	String date = day.substring(4,6);

            	
            	LocalDate localDate = LocalDate.of(
            			Integer.parseInt(year), 
            			Integer.parseInt(month),
            			Integer.parseInt(date));
            	
            	// 해당 날짜의 요일
            	DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            	System.out.println(dayOfWeek);
            	
            	// 해당 날짜의 요일이 토요일, 일요일이 아닐 경우
            	if(dayOfWeek.equals("SATURDAY") || dayOfWeek.equals("SUNDAY")) {
            		continue;
            	}else {
            		// 공휴일 날짜 배열에 포함되지 않을 경우
            		if(!Arrays.asList(holiday).contains(day)) {
            			HashMap<String, Object> retVal2 = new HashMap<String,Object>();
            			retVal2 = uMapper.selectDateLogin(day);
            			sum = sum + Integer.parseInt(retVal2.get("totCnt").toString());
            			dto.setIs_success(true);
            			dto.setTotCnt(sum);
            		}else {
            			continue;
            		}
            	}
            }
        }catch(Exception e) {
        	
        	dto.setIs_success(false);
			dto.setTotCnt(-999);
        }
        
		return dto;
	}

	@Override
	public StatisticMonthWithDeptDto monthLoginNumWithDept(String dept, String month) {

		HashMap<String, Object> retVal = new HashMap<String,Object>();
		StatisticMonthWithDeptDto dto = new StatisticMonthWithDeptDto();
		
		try {
            retVal = uMapper.selectmonthLoginWithDept(dept, month);
            dto.setTotCnt(Integer.parseInt(retVal.get("totCnt").toString()));
            dto.setDept(dept);
            dto.setMonth(Integer.parseInt(month));
            dto.setIs_success(true);

            
        }catch(Exception e) {
            dto.setTotCnt(-999);
            dto.setDept("error");
            dto.setMonth(-999);
        	dto.setIs_success(false);
        }
        
        return dto;
	}

 
}