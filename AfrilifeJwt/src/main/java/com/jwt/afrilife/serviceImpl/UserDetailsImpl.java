package com.jwt.afrilife.serviceImpl;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwt.afrilife.model.Hierarchy;
import com.jwt.afrilife.model.User;


public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
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
	
	@JsonIgnore
	private String password;
	
	private String email;
	
	private Collection<? extends GrantedAuthority> authorities;
	
	private Hierarchy hierarchy;


	
	
	public UserDetailsImpl(long id,long chTypeId, long chId, long reportUserId, String firstName, String lastName,
			long countryId, long cityId, long stateId, String phoneNumber, Boolean status, String username,
			String password, String email, Hierarchy hierarchy) {
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
		this.setHierarchy(hierarchy);
	}
	
	public static UserDetails build(User user) {
		// TODO Auto-generated method stub
		return new UserDetailsImpl(
				user.getId(),
				user.getChTypeId(),
				user.getChId(),
				user.getReportUserId(),
				user.getFirstName(),
				user.getLastName(),
				user.getCountryId(),
				user.getCityId(),
				user.getStateId(),
				user.getPhoneNumber(),
				user.getStatus(),
				user.getUsername(),
				user.getPassword(),
				user.getEmail(),
				user.getHierarchy());
			
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	
	 @Override
	  public boolean equals(Object o) {
	    if (this == o)
	      return true;
	    if (o == null || getClass() != o.getClass())
	      return false;
	    UserDetailsImpl user = (UserDetailsImpl) o;
	    return Objects.equals(id, user.id);
	  }
	 
	 public Long getId() {
		    return id;
		  }

		  public String getEmail() {
		    return email;
		  }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public long getChTypeId() {
		return chTypeId;
	}

	public void setChTypeId(long chTypeId) {
		this.chTypeId = chTypeId;
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

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getReportUserId() {
		return reportUserId;
	}

	public void setReportUserId(long reportUserId) {
		this.reportUserId = reportUserId;
	}

	public long getChId() {
		return chId;
	}

	public void setChId(long chId) {
		this.chId = chId;
	}

	public Hierarchy getHierarchy() {
		// TODO Auto-generated method stub
		return hierarchy;
	}

	public void setHierarchy(Hierarchy hierarchy) {
		this.hierarchy = hierarchy;
	}
	 
	 
	 

}
