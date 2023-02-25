package com.sandip.visualization.domin;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	@Entity
	@Table(name="data")
	@NoArgsConstructor
	@Getter
	@Setter
	
	
	public class Csvdata {
		//@Id
		//@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
	
		private Long endyear;
		private String topic;  //visual
		private String sector;
		private String pestle;
		private String source;
		private String swot;
		private String city; //visual
		private String country; //visual
		
		private int intensity;  //visual
		private int likehood;  //visual
		private int relevance;
		private String start_year;
		private String region;//topic
		//--------------------------------------------------
		private String citylng;
		private String citylat;
		private String url;
	    private String impact;
		private String added;
		private String published;
		private String title;
	
			
	}
	
