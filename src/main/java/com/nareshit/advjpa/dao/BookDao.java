package com.nareshit.advjpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.advjpa.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer>{

	public Book findByBookName(String bookName);
//select * from tbl_book where book_name=bookName;


	public Book fetchDataByBookName(String bookName);





}
