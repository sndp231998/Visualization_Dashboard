////package com.sandip.visualization.service.impl;
////
////import java.util.List;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import com.sandip.visualization.service.*;
////import com.sandip.visualization.Repository.CsvRepository;
////import com.sandip.visualization.domin.*;
////
////@Service
////public class CsvServiceImpl implements Csvservice{
////
////
////	private  CsvRepository csvrepo;
////	
////	public CsvServiceImpl(CsvRepository csvrepo) {
////		this.csvrepo=csvrepo;
////	}
////
////  
////	@Override
////	public List<Csvdata> searchCsvs(String query) {
////		 List<Csvdata> csvss = CsvRepositsory.searchCsv(query);
////		return csvss;
////	}
////    List<Csvdata>csvs=csvrepo.searchCsvsSQL(query);
////	return csvs;
////}}
//
//
//
////
////package com.sandip.visualization.service.impl;
////
////import java.util.List;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import com.sandip.visualization.service.*;
////import com.sandip.visualization.Repository.CsvRepository;
////import com.sandip.visualization.domin.*;
////
////@Service
////public class CsvServiceImpl implements Csvservice{
////
////
////	private  CsvRepository csvrepo;
////	
////	public CsvServiceImpl(CsvRepository csvrepo) {
////		this.csvrepo=csvrepo;
////	}
////
////  
////	@Override
////	public List<Csvdata> searchCsvs(String query) {
////	    List<Csvdata> csvss = csvrepo.searchCsvsSQL(query);
////	    return csvss;
////	}
////
////}
//
//package com.sandip.visualization.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sandip.visualization.service.*;
//import com.sandip.visualization.Repository.CsvRepository;
//import com.sandip.visualization.domin.*;
//
//@Service
//public class CsvServiceImpl implements Csvservice{
//
//	private CsvRepository csvrepo;
//	
//	public CsvServiceImpl(CsvRepository csvrepo) {
//		this.csvrepo = csvrepo;
//	}
//
//	public List<Csvdata> searchCsvs(String query) {
//	    List<Csvdata> csvs = csvrepo.searchCsv(query);
//	    return csvs;
//	}
//
//
//}
//
//
