package com.nareshit.advjpa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.advjpa.dao.BookDao;
import com.nareshit.advjpa.dao.EmployeeDao;
import com.nareshit.advjpa.dao.PersonDao;
import com.nareshit.advjpa.model.Book;
import com.nareshit.advjpa.model.CustomType;
import com.nareshit.advjpa.model.Employee;
import com.nareshit.advjpa.model.Person;

@Service
public class PersonService {


	@Autowired
	private PersonDao personDao;


	@Autowired
	private BookDao bookDao;


	@Autowired
	private EmployeeDao employeeDao;

	//1. SaveAll

	public Iterable<Person> saveAllPersons(Iterable<Person> personsData){
		//SaveAll ==> Which will Multiple Persons Data
		return personDao.saveAll(personsData);
	}


	//2. FindAllById

	public Iterable<Person> findPersonsByIds(List<Integer> personIds){
		//findAllById ==> Which will retrieve Persons DAta by Multiple Primary Key Values
		return personDao.findAllById(personIds);

	}


	// Calling Devived Methods
	public Iterable<Person> findByLastName(String lastName){
		return personDao.findByLastName(lastName);
	}

	public Person findByLastNameAndFirstName(String lastName,String firstName) {
		return personDao.findByLastNameAndFirstName(lastName,firstName);
	}

	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName){
		return personDao.findByLastNameOrFirstName(lastName,firstName);
	}

	public Iterable<Person> findByLastNameOrderByCreatedDateDesc(String lastName){
		return personDao.findByLastNameOrderByCreatedDateDesc(lastName);

	}
	public Iterable<Person> findByAgeLessThanEqual(Integer age){
		return personDao.findByAgeLessThanEqual(age);
	}
	public List<Person> findByFirstNameLike(String firstName){
		return personDao.findByFirstNameLike(firstName);
	}
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age){
		return personDao.findByLastNameAndAgeLessThanEqual(lastName,age);
	}
	public List<Person> findByCreatedDateBetween(Date startdate,Date endDate){
		return personDao.findByCreatedDateBetween(startdate,endDate);
	}


	public Iterable<Book> saveAllBooks(Iterable<Book> booksList){

		return bookDao.saveAll(booksList);
	}

	public Iterable<Book> getAllBooks(){
		return bookDao.findAll();
	}
	public Book findByBookName(String bookName) {
		return bookDao.findByBookName(bookName);
	}
	public List<Person> fetchDataWithName(String firstName){
		return personDao.fetchDataWithName(firstName);
	}

	public Book fetchDataByBookName(String bookName) {
		return bookDao.fetchDataByBookName(bookName);
	}

	public Iterable<Employee> saveAllEmployees(Iterable<Employee> empList){

		return employeeDao.saveAll(empList);

	}

	public List<Object[]> findMaxSalariesByDept(List<String> deptNames){
		return employeeDao.findMaxSalariesByDept(deptNames);
	}

	public List<CustomType> fetchFewColumns(String firstName){
		return personDao.fetchFewColumns(firstName);
	}
	
	//Query
	 public List<Person> findPersonINfobyFirstNameorEmail(String firstName,String email)
	 {
		 return personDao.findPersonINfobyFirstNameorEmail(firstName, email);
	 }

}
