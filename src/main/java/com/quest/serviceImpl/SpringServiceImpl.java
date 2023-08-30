package com.quest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.entity.Feedback;
import com.quest.entity.ServiceRequest;
import com.quest.exceptionHandler.EmployeeNotFoundException;
import com.quest.repository.FeedbackRepo;
import com.quest.repository.SpringRepository;
import com.quest.service.SpringService;

@Service
public class SpringServiceImpl implements SpringService{

	@Autowired
	private SpringRepository springRepository;
	
	@Autowired
	private FeedbackRepo feedbeckrepo;
	
	@Override
	public ServiceRequest saveServiceReq(ServiceRequest serviceRequest) {
		// TODO Auto-generated method stub
		return springRepository.save(serviceRequest);
	}

	@Override
	public ServiceRequest updateServiceReq(ServiceRequest serviceReq) {
		// TODO Auto-generated method stub
		
		return springRepository.save(serviceReq);
	}

	@Override
	public List<ServiceRequest> getAllServiceRequest() {
		// TODO Auto-generated method stub
		return springRepository.findAll();
	}

	@Override
	public Optional<ServiceRequest> findById(int serviceId) {
		// TODO Auto-generated method stub
		  return springRepository.findById(serviceId);
			      
	}

	@Override
	public ServiceRequest updatebyIDServiceReq(ServiceRequest serviceReq, int serviceId) {
		// TODO Auto-generated method stub
		if (springRepository.findById(serviceId).isPresent()){
            ServiceRequest serviceReqs= springRepository.findById(serviceId).get();

           serviceReqs.setAdditionalInstruction(serviceReq.getAdditionalInstruction());
           serviceReqs.setDescription(serviceReq.getDescription());
           serviceReqs.setExpectedBy(serviceReq.getExpectedBy());
           serviceReqs.setFwVersion(serviceReq.getFwVersion());
           serviceReqs.setHwConfiguration(serviceReq.getHwConfiguration());
           serviceReqs.setHwPlatform(serviceReq.getHwPlatform());
           serviceReqs.setOsVersion(serviceReq.getOsVersion());
           serviceReqs.setPriority(serviceReq.getPriority());
           serviceReqs.setRecipeLink(serviceReq.getRecipeLink());
           serviceReqs.setSelectServiceLevel(serviceReq.getSelectServiceLevel());
           serviceReqs.setService(serviceReq.getService());
           
           serviceReqs.setTitle(serviceReq.getTitle());
           

            ServiceRequest updatedservice =springRepository.save(serviceReqs);

            return updatedservice;
        }else{
            return null;
        }
    }

	@Override
	public String deleteServiceReq(int serviceId) {
		
		if (springRepository.findById(serviceId).isPresent()){
       
		springRepository.deleteById(serviceId);
		// TODO Auto-generated method stub
		return "Successfully Deleted";
		}else{
            return "ID not present";
        }
		
	}

	@Override
	public List<Feedback> getAllfeedback() {
		// TODO Auto-generated method stub
		return feedbeckrepo.findAll();
	}

	@Override
	public Feedback saveFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbeckrepo.save(feedback);
	}


	}

	


