package com.sandip.visualization.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandip.visualization.Repository.CsvRepository;
import com.sandip.visualization.domin.Csvdata;
import com.sandip.visualization.service.Csvservice;

@Service
public class CsvServiceImpl implements Csvservice{

	@Autowired
	private CsvRepository csvrepo;
	@Override
	public List<Csvdata> getAllCsv() {
		
		return csvrepo.findAll();
	}

	@Override
	public List<Csvdata> getCsvsendyear(Long endyear) {
		List<Csvdata>csvs=csvrepo.findByendyear(endyear);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","endyear",endyear);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvstopic(String topic) {
		List<Csvdata>csvs=csvrepo.findBytopic(topic);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","topic",topic);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvssector(String sector) {
		List<Csvdata>csvs=csvrepo.findBysector(sector);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","sector",sector);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvspestle(String pestle) {
		List<Csvdata>csvs=csvrepo.findBypestle(pestle);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","pestle",pestle);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvssource(String source) {
		List<Csvdata>csvs=csvrepo.findByendyear(source);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","source",source);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvsswot(String swot) {
		List<Csvdata>csvs=csvrepo.findByswot(swot);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","swot",swot);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvscountry(String country) {
		List<Csvdata>csvs=csvrepo.findByendyear(country);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","country",country);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvscity(String city) {
		List<Csvdata>csvs=csvrepo.findByendyear(city);
		if(csvs.isEmpty()) {
			throw new ResourceNotFoundException("Csvdata","endyear",city);
		}
			return csvs;
	}

	@Override
	public List<Csvdata> getCsvsByEndYearAndSector(Long endYear, String sector) {
		// TODO Auto-generated method stub
		return null;
	}


	}

	
	
	
	
