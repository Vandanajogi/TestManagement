package com.quest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceRequest implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
	private String service;
	private String priority;
	private String title;
	private String description;
	private Date expectedBy;
	private String selectServiceLevel;
	private String osVersion;
	private String fwVersion;
	private String hwPlatform;
	private String hwConfiguration;
	private String recipeLink;
	private String additionalInstruction;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getExpectedBy() {
		return expectedBy;
	}
	public void setExpectedBy(Date expectedBy) {
		this.expectedBy = expectedBy;
	}
	public String getSelectServiceLevel() {
		return selectServiceLevel;
	}
	public void setSelectServiceLevel(String selectServiceLevel) {
		this.selectServiceLevel = selectServiceLevel;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getFwVersion() {
		return fwVersion;
	}
	public void setFwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
	}
	public String getHwPlatform() {
		return hwPlatform;
	}
	public void setHwPlatform(String hwPlatform) {
		this.hwPlatform = hwPlatform;
	}
	public String getHwConfiguration() {
		return hwConfiguration;
	}
	public void setHwConfiguration(String hwConfiguration) {
		this.hwConfiguration = hwConfiguration;
	}
	public String getRecipeLink() {
		return recipeLink;
	}
	public void setRecipeLink(String recipeLink) {
		this.recipeLink = recipeLink;
	}
	public String getAdditionalInstruction() {
		return additionalInstruction;
	}
	public void setAdditionalInstruction(String additionalInstruction) {
		this.additionalInstruction = additionalInstruction;
	}
	public ServiceRequest(int serviceId, String service, String priority, String title, String description,
			Date expectedBy, String selectServiceLevel, String osVersion, String fwVersion, String hwPlatform,
			String hwConfiguration, String recipeLink, String additionalInstruction) {
		super();
		this.serviceId = serviceId;
		this.service = service;
		this.priority = priority;
		this.title = title;
		this.description = description;
		this.expectedBy = expectedBy;
		this.selectServiceLevel = selectServiceLevel;
		this.osVersion = osVersion;
		this.fwVersion = fwVersion;
		this.hwPlatform = hwPlatform;
		this.hwConfiguration = hwConfiguration;
		this.recipeLink = recipeLink;
		this.additionalInstruction = additionalInstruction;
	}
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
