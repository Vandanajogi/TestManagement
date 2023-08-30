package com.quest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.entity.ServiceRequest;

@Repository
public interface SpringRepository extends JpaRepository<ServiceRequest, Integer>{

}
