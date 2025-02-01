package com.vedesh.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.vedesh.springdatajpa.entity.Employee;
import com.vedesh.springdatajpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = SpringdatajpaApplication.class)
class SpringdatajpaApplicationTests {

	@Autowired
   	private EmployeeRepository employeeRepository;

	// @Test
	// void contextLoads() {
	// }

	@Test
	public void testFindById() {
		Employee employee = getEmployee();	     
		employeeRepository.save(employee);
		Employee result = employeeRepository.findById(employee.getId()).get();
		assertEquals(employee.getId(), result.getId());	     
	}
	@Test
	public void testFindAll() {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		List<Employee> result = new ArrayList<>();
		employeeRepository.findAll().forEach(e -> result.add(e));
		assertEquals(result.size(), 1);	     
	}
	@Test
	public void testSave() {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		Employee found = employeeRepository.findById(employee.getId()).get();
		assertEquals(employee.getId(), found.getId());	     
	}
	@Test
	public void testDeleteById() {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		employeeRepository.deleteById(employee.getId());
		List<Employee> result = new ArrayList<>();
		employeeRepository.findAll().forEach(e -> result.add(e));
		assertEquals(result.size(), 0);
	}
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Mahesh");
		employee.setAge(30);
		employee.setEmail("mahesh@test.com");
		return employee;
	}

	@Test
	public void testFindByName() {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		List<Employee> result = new ArrayList<>();
		employeeRepository.findByName(employee.getName()).forEach(e -> result.add(e));
		assertEquals(result.size(), 1);	     
	}
	@Test
	public void testFindByAge() {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		List<Employee> result = new ArrayList<>();
		employeeRepository.findByAge(employee.getAge()).forEach(e -> result.add(e));
		assertEquals(result.size(), 1);	     
	}

	@Test
	public void testFindByEmail() {	     
		Employee employee = getEmployee();
		employeeRepository.save(employee);
		Employee result = employeeRepository.findByEmail(employee.getEmail());	     
		assertNotNull(result);	     
	}

	@Test
	public void testFindAllSortedByName() {
		Employee employee = getEmployee();
		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setName("Aarav");
		employee1.setAge(20);
		employee1.setEmail("aarav@test.com");
		employeeRepository.save(employee);	     
		employeeRepository.save(employee1);
		List<Employee> result = employeeRepository.findAllSortedByName();
		assertEquals(employee1.getName(), result.get(0).getName());	     
	}

	@Test
	public void testFindAllSortedByNameUsingNative() {
		Employee employee = getEmployee();
		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setName("Aarav");
		employee1.setAge(20);
		employee1.setEmail("aarav@test.com");
		employeeRepository.save(employee);	     
		employeeRepository.save(employee1);
		List<Employee> result = employeeRepository.findAllSortedByNameUsingNative();
		assertEquals(employee1.getName(), result.get(0).getName());	     
	}  

}
