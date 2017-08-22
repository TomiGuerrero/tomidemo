package com.redbeechallenge.repository;

import com.redbeechallenge.model.Data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<Data, String> {

	List<Data> findByTag(String tag);

	List<Data> findAll();

}