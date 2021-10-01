package com.jpa.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.CoustmerMasterEntity;

public interface CustomerMasterRepo extends JpaRepository<CoustmerMasterEntity, Serializable>{
	
	//public CoustmerMasterEntity findbyContactNameIs(String name);
	
	@Query("select contactName from CoustmerMasterEntity where contactNumber=:pno")
	public String findContactNameByContactNumber(Integer pno);
	
	@Query("select contactName from CoustmerMasterEntity")
	public List<String> findAllColumeNames();

}
