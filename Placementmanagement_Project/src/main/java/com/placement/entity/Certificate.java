package com.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Certificate {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(nullable = false,length = 100)
    private String college;
	@Column(nullable = false,length = 100)
    private String year;
    public Certificate () {
    }
 
    public Certificate (Integer id,  String college, String year) {
        this.id = id;
        this.college = college;
        this.year = year;
     
    }
   
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", college=" + college + ", year=" + year + "]";
	}

	

}
