package com.jpa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.CoustmerMasterEntity;

public interface ContactMasterRepo extends JpaRepository<CoustmerMasterEntity, Serializable>{

}
