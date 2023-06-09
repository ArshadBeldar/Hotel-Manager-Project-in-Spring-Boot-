package com.infogalaxy.hotelmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerinfo")
public class CustomerEntity {

	@Id
	private int cid;
	
	
	private String cname;
	

	private String cmobileno;
	

	private String cemailid;

	
	public CustomerEntity () {}
	
	public CustomerEntity(int cid, String cname, String cmobileno, String cemailid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmobileno = cmobileno;
		this.cemailid = cemailid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmobileno() {
		return cmobileno;
	}

	public void setCmobileno(String cmobileno) {
		this.cmobileno = cmobileno;
	}

	public String getCemailid() {
		return cemailid;
	}

	public void setCemailid(String cemailid) {
		this.cemailid = cemailid;
	}

	
	
	@Override
	public String toString() {
		return "CustomerEntity [cid=" + cid + ", cname=" + cname + ", cmobileno=" + cmobileno + ", cemailid=" + cemailid
				+ "]";
	}

}
