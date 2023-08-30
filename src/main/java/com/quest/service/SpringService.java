package com.quest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.quest.entity.Feedback;
import com.quest.entity.ServiceRequest;

public interface SpringService {

	ServiceRequest saveServiceReq(ServiceRequest serviceRequest);

	ServiceRequest updateServiceReq(ServiceRequest serviceReq);
	
	List<ServiceRequest> getAllServiceRequest();

	Optional<ServiceRequest> findById(int serviceId) throws Throwable;

	ServiceRequest updatebyIDServiceReq(ServiceRequest serviceReq, int serviceId);

	String deleteServiceReq(int serviceId);

	List<Feedback> getAllfeedback();

	Feedback saveFeedback(Feedback feedback);


}
