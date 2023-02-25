package com.sandip.visualization.controller;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sandip.visualization.domin.Csvdata;
import com.sandip.visualization.service.Csvservice;

@RestController
@RequestMapping("/api")
public class VisualizationController {
    
    @Autowired
    private Csvservice csvService;

    //----------All Data--------------------
    @GetMapping("/data")
    public List<Csvdata> getAllCsv() {
        return csvService.getAllCsv();
    }
 
    //------------Filter by Endyear--------------------
    @GetMapping("/endyear/{endyear}")
    public List<Csvdata> getCsvByEndYear(@PathVariable(value = "endyear") Long endYear) {
        return csvService.getCsvsendyear(endYear);
    }
 
    //-------------Filter By topic-------------------
    @GetMapping("/topic/{topic}")
    public List<Csvdata> getCsvBytopic(@PathVariable(value = "topic") String topic) {
        return csvService.getCsvstopic(topic);
    }
 
    //------------Filter By Sector-------------------
    @GetMapping("/sector/{sector}")
    public List<Csvdata> getCsvBysector(@PathVariable(value = "sector") String sector) {
        return csvService.getCsvssector(sector);
    }

    
    
    //------------Filter By pestle-------------------
    @GetMapping("/pestle/{pestle}")
    public List<Csvdata> getCsvBypestle(@PathVariable(value = "pestle") String pestle) {
        return csvService.getCsvspestle(pestle);
    }
    
    
    //------------Filter By source-------------------
    @GetMapping("/source/{source}")
    public List<Csvdata> getCsvBysource(@PathVariable(value = "source") String source) {
        return csvService.getCsvssource(source);
    }
    
    
    //------------Filter By swot-------------------
    @GetMapping("/swot/{swot}")
    public List<Csvdata> getCsvByswot(@PathVariable(value = "swot") String swot) {
        return csvService.getCsvsswot(swot);
    }
    
    //------------Filter By country-------------------
    @GetMapping("/country/{country}")
    public List<Csvdata> getCsvBycountry(@PathVariable(value = "country") String country) {
        return csvService.getCsvsswot(country);
    }
    
    
    //------------Filter By swot-------------------
    @GetMapping("/city/{city}")
    public List<Csvdata> getCsvBycity(@PathVariable(value = "city") String city) {
        return csvService.getCsvscity(city);
    }
    
    //------------Filter By Endyear and Sector-------------------
    @GetMapping("/endyear/{endyear}/sector/{sector}")
    public List<Csvdata> getCsvByEndYearAndSector(@PathVariable(value = "endyear") Long endYear, 
                                                   @PathVariable(value = "sector") String sector) {
        return csvService.getCsvsByEndYearAndSector(endYear, sector);
    }
    
}
