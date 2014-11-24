package net.viralpatel.contact.form;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Person {
	
	
	private Date updateon;

	
	public Person(){}
	
	@Column(name = "UPDATEON")
	@Temporal(TemporalType.DATE) 
	public Date getUpdateon() {
		return updateon;
	}



	public void setUpdateon(Date updateon) {
		this.updateon = new Date();
	}
	
	
	
	

}
