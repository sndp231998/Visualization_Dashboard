package com.sandip.visualization.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.sandip.visualization.domin.Csvdata;

@Repository
public interface CsvRepository extends JpaRepository<Csvdata, Long> {

	List<Csvdata> findByEndyear(int endyear);
	 
	    List<Csvdata> findByTopic(String topic);
	    List<Csvdata> findBySector(String sector);
	    List<Csvdata> findByRegion(String region);
	    List<Csvdata> findByPestle(String pestle);
	    List<Csvdata> findBySource(String source);
	    List<Csvdata> findBySwot(String swot);
	    List<Csvdata> findByCountry(String country);
	    List<Csvdata> findByCity(String city);
//	    List<Csvdata> findByFilters(String endyear, String topic, String sector, String region, String pestle, String source, String swot, String country, String city);

}


//    // get all data
//    List<Csvdata> findAll();
//    
//    // filter by end year
//    List<Csvdata> findByEndYear(int endYear);
//    
//    // filter by topic
//    List<Csvdata> findByTopic(String topic);
//    
//    // filter by sector
//    List<Csvdata> findBySector(String sector);
//    
//    // filter by region
//    List<Csvdata> findByRegion(String region);
//    
//    // filter by pestle
//    List<Csvdata> findByPestle(String pestle);
//    
//    // filter by source
//    List<Csvdata> findBySource(String source);
//    
//    // filter by swot
//    List<Csvdata> findBySwot(String swot);
//    
//    // filter by country
//    List<Csvdata> findByCountry(String country);
//    
//    // filter by city
//    List<Csvdata> findByCity(String city);
	
   