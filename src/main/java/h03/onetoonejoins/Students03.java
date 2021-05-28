package h03.onetoonejoins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Students03 {
	
	@Id
	private int student_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	@OneToOne(mappedBy="student")
	private Dairy dairy;
	
	public Students03() {
		
	}
	public Students03(int id, String name, int grade, Dairy dairy) {
		this.student_id = id;
		this.name = name;
		this.grade = grade;
		this.dairy = dairy;
	}
	
	public int getId() {
		return student_id;
	}
	public void setId(int id) {
		this.student_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Students03 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
	}

}
