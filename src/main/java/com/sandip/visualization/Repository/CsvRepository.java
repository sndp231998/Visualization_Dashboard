package com.sandip.visualization.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.sandip.visualization.domin.Csvdata;

@Repository
public interface CsvRepository extends JpaRepository<Csvdata, Long> {

	List<Csvdata> findByendyear(Long endyear);

	List<Csvdata> findBytopic(String topic);

	List<Csvdata> findBysector(String sector);

	List<Csvdata> findBypestle(String pestle);

	List<Csvdata> findByendyear(String source);

	List<Csvdata> findByswot(String swot);

	List<Csvdata>findBycountry(String country);
	
	List<Csvdata>findBycity(String city);

	
}