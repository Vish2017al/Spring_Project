package com.placement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(nullable = false,length = 100)
    private String certificate;
	@Column(nullable = false,length = 100)
    private String college;
	@Column(nullable = false,length = 100)
    private String course;
	@Column(nullable = false,length = 100)
    private String hallTicketNo;
	@Column(nullable = false,length = 100)
    private String name;
	@Column(nullable = false,length = 100)
    private String qualification;
	@Column(nullable = false,length = 100)
    private String roll;
	@Column(nullable = false,length = 100)
    private String year;
    
    public  Student() {
    }
 
    public  Student(Integer id, String certificate, String college, String course  ,String hallTicketNo , String name ,String qualification,String roll,String year  ) {
        this.certificate = certificate;
        this.college = college;
        this.course = course;
        this.hallTicketNo = hallTicketNo;
        this.name  = name ;
        this.qualification = qualification;
        this.roll = roll; 
        this.year = year;
    }
 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(String hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
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

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", certificate=" + certificate + ", college=" + college + ", course=" + course
				+ ", hallTicketNo=" + hallTicketNo + ", name=" + name + ", qualification=" + qualification + ", roll="
				+ roll + ", year=" + year + "]";
	}
	
 

}
