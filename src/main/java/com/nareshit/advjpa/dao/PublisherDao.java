package com.nareshit.advjpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.nareshit.advjpa.model.Publisher;

@Repository
public interface PublisherDao extends CrudRepository<Publisher, Integer>{


}
