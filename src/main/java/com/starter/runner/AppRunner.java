package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.document.Employee;
import com.starter.repo.EmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		//case-1 id=null, then generate ID and insert
//		repo.save(new Employee(null,104, "LMN", 5.5));
		
		//case-2 id=123ab is not exist in Collection
//		repo.save(new Employee("123ab",105, "OPQ", 6.6));
		
		//case-3 id=123ab is exit then update/modify
//		repo.save(new Employee("123ab", 106, "RST", 7.7));
		
		
		//case-1 id=null, then generate ID and insert
		repo.insert(new Employee(null, 107, "ABC", 8.8));
		
		//case-2 id=123ab is not exist in Collection
		repo.insert(new Employee("123abc", 108, "CDE", 9.9));
		
		//case-3 id=123ab is exit then update/modify
//		repo.insert(new Employee("123abc", 108, "FGH", 9.9)); it will throw error because using insert method update wont possible
		
		
	}

}
