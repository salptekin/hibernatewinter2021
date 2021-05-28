package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/*
	POJO: Plain Old Java Object
	1)Create private variables
	2)Create constructor
	3)Create getters and setters
	4)Create toString()
*/

/*
 	Note:If you wil use a class in hibernate to create table in database, do not make any variable "final" or "static"
 */
@Entity // @Entity tells to Hibernate to convert a class to a table
@Table(name="students_table") // @Table() is used to be able to use different names for table
public class Students01 {
	
	@Id //@Id is used to make a variable primary key in table
	private int student_id;
	@Column(name="student_name") //@Column() is used to be able to use different names for columns
	private String name;
	//@Transient // @Transient is used not to make a variable column
	private int grade;
	
	public Students01() {
		
	}
	public Students01(int id, String name, int grade) {
		this.student_id = id;
		this.name = name;
		this.grade = grade;
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
		return "Students01: student_id=" + student_id + ", name=" + name + ", grade=" + grade + ".";
	}

}
