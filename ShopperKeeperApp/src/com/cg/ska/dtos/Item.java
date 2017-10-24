package com.cg.ska.dtos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@Min(value=0,message="Can not be negative")
	private int code;
	
	@NotEmpty
	@Pattern(regexp="[A-Z].*",message="Should start with capital letter")
	private String name;
	
	@Min(value=99,message="Can not be cheaper than 99")
	@Max(value=99999,message="Can not be costlier than 99999")
	private double rate;
	
	private String packagedDate;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getPackagedDate() {
		return packagedDate;
	}

	public void setPackagedDate(String packagedDate) {
		this.packagedDate = packagedDate;
	}
	
	
}
