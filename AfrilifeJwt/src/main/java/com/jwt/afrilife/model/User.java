package com.jwt.afrilife.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user",
uniqueConstraints = {
@UniqueConstraint(columnNames = "username"),
@UniqueConstraint(columnNames = "email")
})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long chTypeId; 
	
	private long chId; 
	
	private long reportUserId;
	
	private String firstName; 
	
	private String lastName;
	
	private long countryId;
	
	private long cityId;
	
	private long stateId; 
	
	private String phoneNumber; 
	
	private Boolean status; 
	
	private String username;
	
	private String password;
	
	private String email;
	
	@OneToOne
	@JoinColumn(name="hierarchy_id")
	private Hierarchy hierarchy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getChTypeId() {
		return chTypeId;
	}

	public void setChTypeId(long chTypeId) {
		this.chTypeId = chTypeId;
	}

	public long getChId() {
		return chId;
	}

	public void setChId(long chId) {
		this.chId = chId;
	}

	public long getReportUserId() {
		return reportUserId;
	}

	public void setReportUserId(long reportUserId) {
		this.reportUserId = reportUserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Hierarchy getHierarchy() {
		return hierarchy;
	}

	public void setHierarchy(Hierarchy hierarchy) {
		this.hierarchy = hierarchy;
	}

	public User(long id, long chTypeId, long chId, long reportUserId, String firstName, String lastName, long countryId,
			long cityId, long stateId, String phoneNumber, Boolean status, String username, String password,
			String email, Hierarchy hierarchy) {
		super();
		this.id = id;
		this.chTypeId = chTypeId;
		this.chId = chId;
		this.reportUserId = reportUserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryId = countryId;
		this.cityId = cityId;
		this.stateId = stateId;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.username = username;
		this.password = password;
		this.email = email;
		this.hierarchy = hierarchy;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
