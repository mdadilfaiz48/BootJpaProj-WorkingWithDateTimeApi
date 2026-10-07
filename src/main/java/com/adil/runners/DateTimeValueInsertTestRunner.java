package com.adil.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adil.entity.PersonInfo;
import com.adil.service.IPersonMgmtService;

@Component
public class DateTimeValueInsertTestRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
	 
		/*try {
			  PersonInfo info = new PersonInfo("raja", "hyd", LocalDate.of(1999,10,20), LocalTime.of(20, 30),LocalDateTime.of(2012,10,21,10,50,30));
			  String message = service.registerPerson(info);
			  System.out.println(message);
			  
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			  service.showAllPerson().forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			
			System.out.println("Person age is :"+service.getAgeByPid(1));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
