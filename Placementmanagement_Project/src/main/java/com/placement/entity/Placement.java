package com.placement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 


@Entity
@Table
public class Placement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(nullable = false,length = 100)
    private String college;
	@Column(nullable = false,length = 100)
    private String date;
	@Column(nullable = false,length = 100)
    private String name;
	@Column(nullable = false,length = 100)
    private String  qualification;
	@Column(nullable = false,length = 100)
    private String year;
    
    public  Placement() {
    }
 
 
	public Placement(Integer id, String college, String date, String name, String qualification, String year) {
		super();
		this.id = id;
		this.college = college;
		this.date = date;
		this.name = name;
		this.qualification = qualification;
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

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", college=" + college + ", date=" + date + ", name=" + name + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	
 

}
