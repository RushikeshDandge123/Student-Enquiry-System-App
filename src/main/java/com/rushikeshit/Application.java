package com.rushikeshit;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rushikeshit.entity.CitizensPlan;
import com.rushikeshit.repository.CitizensPlanRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		CitizensPlanRepository repo = context.getBean(CitizensPlanRepository.class);
		
		CitizensPlan c1 = new CitizensPlan();		
		c1.setCitizenName("Stive");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setGender("Male");
		c1.setStartDate(LocalDate.now());
		c1.setEndDate(LocalDate.now().plusMonths(6));
		
		
		CitizensPlan c2 = new CitizensPlan();		
		c2.setCitizenName("Michelee");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setGender("Female");
		c2.setStartDate(LocalDate.now());
		c2.setEndDate(LocalDate.now().plusMonths(4));
		c2.setBenefitAmmount(12000.00);
		
		
		CitizensPlan c3 = new CitizensPlan();		
		c3.setCitizenName("Peter");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setGender("Male");
		c3.setStartDate(LocalDate.now());
		c3.setEndDate(LocalDate.now().plusMonths(2));
		c3.setBenefitAmmount(7000.00);
		
		CitizensPlan c4 = new CitizensPlan();		
		c4.setCitizenName("Rose");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setGender("Female");
		c4.setStartDate(LocalDate.now());
		c4.setEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmmount(4000.00);
		
		CitizensPlan c5 = new CitizensPlan();		
		c5.setCitizenName("Jack");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setGender("Male");
		c5.setStartDate(LocalDate.now());
		c5.setEndDate(LocalDate.now().plusMonths(4));
		c5.setBenefitAmmount(4000.00);
		
		
		CitizensPlan c6 = new CitizensPlan();		
		c6.setCitizenName("Cathy");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setGender("Female");
		c6.setStartDate(LocalDate.now());
		c6.setEndDate(LocalDate.now().plusMonths(2));
		c5.setBenefitAmmount(8000.00);
		
		CitizensPlan c7 = new CitizensPlan();		
		c7.setCitizenName("Finch");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setGender("Male");
		c7.setStartDate(LocalDate.now());
		c7.setEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmmount(2000.00);
		
		CitizensPlan c8 = new CitizensPlan();		
		c8.setCitizenName("Aron");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setGender("Male");
		c8.setStartDate(LocalDate.now());
		c8.setEndDate(LocalDate.now().plusMonths(4));
		c8.setBenefitAmmount(4000.00);
		
		
		CitizensPlan c9 = new CitizensPlan();		
		c9.setCitizenName("Ritaa");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setGender("Female");
		c9.setStartDate(LocalDate.now());
		c9.setEndDate(LocalDate.now().plusMonths(2));
		c9.setBenefitAmmount(8000.00);
		
	
		CitizensPlan c10 = new CitizensPlan();		
		c10.setCitizenName("Warner");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setGender("Male");
		c10.setStartDate(LocalDate.now());
		c10.setEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmmount(2000.00);
		
		CitizensPlan c11 = new CitizensPlan();		
		c11.setCitizenName("Alexandra");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setGender("Female");
		c11.setStartDate(LocalDate.now());
		c11.setEndDate(LocalDate.now().plusMonths(4));
		c11.setBenefitAmmount(4000.00);
		
		
		CitizensPlan c12 = new CitizensPlan();		
		c12.setCitizenName("Josh");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setGender("Male");
		c12.setStartDate(LocalDate.now());
		c12.setEndDate(LocalDate.now().plusMonths(2));
		c12.setBenefitAmmount(8000.00);
		
		List<CitizensPlan> asList = Arrays.asList(c1,c2,c3,c4, c5,c6,c7,c8,c9,c10,c11,c12);
	
		//repo.saveAll(asList);
	}

}
