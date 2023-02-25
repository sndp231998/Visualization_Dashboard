package com.sandip.visualization.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.sandip.visualization.domin.*;
@Service
public interface Csvservice {

	
	List<Csvdata>getAllCsv();
	
	List<Csvdata>getCsvsendyear(Long endyear);
	
     List<Csvdata>getCsvstopic(String topic);
     List<Csvdata>getCsvssector(String sector);
     List<Csvdata>getCsvspestle(String pestle);
     List<Csvdata>getCsvssource(String source);
     List<Csvdata>getCsvsswot(String swot);
     List<Csvdata>getCsvscountry(String country);
     List<Csvdata>getCsvscity(String city);

	List<Csvdata> getCsvsByEndYearAndSector(Long endYear, String sector);
     
     
    
	
	}

