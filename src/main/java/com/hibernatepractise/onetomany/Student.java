package com.hibernatepractise.onetomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_Id")
	private Long studentId;
	private String studentName;
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@OrderColumn
	private List<Certificate> certificates=new ArrayList<Certificate>(0);
	
	public Student(){
		
	}
	public Student(String studentName, List<Certificate> certificates) {
		super();
		this.studentName = studentName;
		this.certificates = certificates;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}
	
}
