package com.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

///**
// * @author ALI
// *
// */
//@Data
@Entity
@Table(name="CONTACT_MASTER")
public class CoustmerMasterEntity {
	
	@Id
	@SequenceGenerator(name="contact",sequenceName="con_id_seq",allocationSize=1)
	@GeneratedValue(generator="contact",strategy=GenerationType.SEQUENCE)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_NUMBER")
	private Integer contactNumber;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "CoustmerMasterEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + "]";
	}
	
	
	

}
