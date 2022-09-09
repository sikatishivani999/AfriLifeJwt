package com.jwt.afrilife.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Hierarchy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String description;
	private Boolean status; 
	private LocalDateTime createdAt; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "TIMESTAMP", nullable=true)
	private LocalDateTime updatedAt; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "TIMESTAMP", nullable=true)
	private LocalDateTime deletedAt;
	@Column(nullable = true,  length = 255)
	private String createdBy; 
	@Column(nullable = true,  length = 255)
	private String deletedBy; 
	@Column(nullable = true,  length = 255)
	private String updatedBy;
	
	
	
	public Hierarchy(long id) {
		this.id = id;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Hierarchy(long id, String name, String description, Boolean status, LocalDateTime createdAt,
			LocalDateTime updatedAt, LocalDateTime deletedAt, String createdBy, String deletedBy, String updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.createdBy = createdBy;
		this.deletedBy = deletedBy;
		this.updatedBy = updatedBy;
	}
	public Hierarchy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hierarchy [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ", createdBy="
				+ createdBy + ", deletedBy=" + deletedBy + ", updatedBy=" + updatedBy + "]";
	}
	
	
	

}
