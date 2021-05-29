package h04.onetomanyjoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Books04 {
	
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne // In child class use @ManyToOne
	@JoinColumn(name="std_id")
	private Students04 student;
	/*
	    In child class;
	 	When you create student object, create getter() and setter()
	 	but do not put student object into constructor and into toString()
	*/
	
	public Books04() {
	}
	public Books04(int book_id, String book_name) {
		this.book_id = book_id;
		this.book_name = book_name;
	}
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Students04 getStudent() {
		return student;
	}
	public void setStudent(Students04 student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "[book_id=" + book_id + ", book_name=" + book_name + "]";
	}
}
