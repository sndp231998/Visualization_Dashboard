package com.sandip.visualization.controller;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.sandip.visualization.Repository.CsvRepository;
import com.sandip.visualization.domin.Csvdata;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class VisualizationController {
    
    @Autowired
    CsvRepository csvRepository;
    
    
 @GetMapping("/data")
 public List<Csvdata> getAllData() {
	 try {
     return csvRepository.findAll();
 }catch (Exception e) {
	  return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
	
 }
 }
 


@GetMapping("/data/{endyear}")
 public List<Csvdata> getDataByEndyear(@PathVariable int endyear) {
   try {
	 return csvRepository.findByEndyear(endyear);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }}
 
 @GetMapping("/data/{topic}")
 public List<Csvdata> getDataByTopic(@PathVariable String topic) {
   try {  return csvRepository.findByTopic(topic);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }
 }
 
 @GetMapping("/data/{sector}")
 public List<Csvdata> getDataBySector(@PathVariable String sector) {
   try {  return csvRepository.findBySector(sector);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }}
 
 @GetMapping("/data/{pest}")
 public List<Csvdata> getDataByPest(@PathVariable String pest) {
   try {  return csvRepository.findByPestle(pest);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }}
 
 @GetMapping("/data/{source}")
 public List<Csvdata> getDataBySource(@PathVariable String source) {
  try {   return csvRepository.findBySource(source);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }
 }
 
 @GetMapping("/data/{swot}")
 public List<Csvdata> getDataBySwot(@PathVariable String swot) {
    try { return csvRepository.findBySwot(swot);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }
 }
 
 @GetMapping("/data/{country}")
 public List<Csvdata> getDataByCountry(@PathVariable String country) {
    try { return csvRepository.findByCountry(country);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }}
 @GetMapping("/data/{city}")
 public List<Csvdata> getDataByCity(@PathVariable String city) {
   try {  return csvRepository.findByCity(city);
 }catch(Exception e) {
	 return handleException(e, HttpStatus.INTERNAL_SERVER_ERROR);
 }}
 
 
 
 
 private List<Csvdata> handleException(Exception e, HttpStatus status) {
	    //String errorMessage = "Error occurred while retrieving data from the database: " + e.getMessage();
	    // log the error message or take any other necessary actions
	    return new ArrayList<>();
	}
	


//    public ResponseEntity<List<Csvdata>> getAllData() {
//        try {
//            List<Csvdata> csvDataList = csvRepository.findAll();
//            
//            if (csvDataList.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            
//            return new ResponseEntity<>(csvDataList, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    
//    @GetMapping("/data/{id}")
//    public ResponseEntity<Csvdata> getDataById(@PathVariable("id") Long id) {
//        Optional<Csvdata> csvData = csvRepository.findById(id);
//        
//        if (csvData.isPresent()) {
//            return new ResponseEntity<>(csvData.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    
//    @GetMapping("/data/filter")
//    public ResponseEntity<List<Csvdata>> getDataByFilter(
//            @RequestParam(required = false) String endYear,
//            @RequestParam(required = false) String topic,
//            @RequestParam(required = false) String sector,
//            @RequestParam(required = false) String region,
//            @RequestParam(required = false) String pestle,
//            @RequestParam(required = false) String source,
//            @RequestParam(required = false) String swot,
//            @RequestParam(required = false) String country,
//            @RequestParam(required = false) String city) {
//        try {
//            List<Csvdata> csvDataList = csvRepository.findByFilters(
//                endYear, topic, sector, region, pestle, source, swot, country, city);
//            
//            if (csvDataList.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            
//            return new ResponseEntity<>(csvDataList, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
