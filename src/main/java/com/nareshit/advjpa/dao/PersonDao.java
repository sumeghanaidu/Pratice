package com.nareshit.advjpa.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.advjpa.model.CustomType;
import com.nareshit.advjpa.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>{


	//Dervied Method with Keywords Implementation

	public Iterable<Person> findByLastName(String lastName);
	//select * from tbl_person where last_name=lastName;

	public Person findByLastNameAndFirstName(String lastName,String firstName);
	//select * from tbl_person where last_name=lastName and first_name=firstName


	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName);
	//select * from tbl_person where last_name=lastName or first_name=firstName


	public Iterable<Person> findByLastNameOrderByCreatedDateDesc(String lastName);
	//select * from tbl_person where last_name=lastName order by created_date desc

	public Iterable<Person> findByAgeLessThanEqual(Integer age);
	//select * from tbl_person where age<=age
	//It should be applied for Integer Types


	public List<Person> findByFirstNameLike(String firstName);
	//In general we will apply wildcardsearch by appending %firstName%
	//Developer will append %'s as per theire requirement


	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int Age);
	//select * from tbl_person where last_name=lastName and age<=age



	public List<Person> findByCreatedDateBetween(Date startdate,Date endDate);
	//select * from tbl_person where created_date>=startdate and created_date<=endDate



	//Named Query Section
	//Abstract method at Interface and Implementation at POJO Class --> Named Query
	public List<Person> fetchDataWithName(String firstName);


	public List<CustomType> fetchFewColumns(String firstName);
	
	
	//query notation
	@Query(value="select p from person p where p.firstName=?1 or p.email=?2")
	List<Person> findPersonINfobyFirstNameorEmail(String firstName,String email);
	
	
	


}
