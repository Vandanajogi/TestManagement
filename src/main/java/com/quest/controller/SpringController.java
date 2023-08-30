package com.quest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quest.entity.Feedback;
import com.quest.entity.ServiceRequest;
import com.quest.service.SpringService;

@CrossOrigin
@RestController
@RequestMapping("/servicereq")
public class SpringController {
	
	@Autowired
	private SpringService service;
	
	@GetMapping("/")
	public String welcome() {
		
		
		return "Welcome";
	}
	
	@GetMapping("/get")
	public List<ServiceRequest> listServiceReq() {
		return service.getAllServiceRequest();
	}
	
	@GetMapping("/getservice/{id}")
	public Optional<ServiceRequest> getServiceByID(@PathVariable("id")int serviceId) throws Throwable {
		
		return service.findById(serviceId);
		
	}
	
	
	@PostMapping("/save")
	public ServiceRequest saveServiceReq(@RequestBody ServiceRequest serviceReq) {
		
		
		return service.saveServiceReq(serviceReq);
	}

	
	@PutMapping("/update")
    public ServiceRequest updateServiceReq(@RequestBody ServiceRequest serviceReq) {
			
		return service.updateServiceReq(serviceReq);
	}
	
	
	@PutMapping("/updateServiceReq/{id}")
	public ServiceRequest updatebyIDServiceReq(@RequestBody ServiceRequest serviceReq, @PathVariable(value = "id") int serviceId) {

	
		return service.updatebyIDServiceReq(serviceReq,serviceId);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteServiceReq(@PathVariable(value = "id",required = true) int serviceId)
	{
		return service.deleteServiceReq(serviceId);
	}
	
	@GetMapping("/getfeedback")
	public List<Feedback> listFeedback() {
		return service.getAllfeedback();
	}
	
	@PostMapping("/savefeedback")
	public Feedback saveFeedback(@RequestBody Feedback feedback) {
		
		
		return service.saveFeedback(feedback);
	}
}
