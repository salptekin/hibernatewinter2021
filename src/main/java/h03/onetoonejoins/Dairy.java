package h03.onetoonejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dairy {
	
	@Id
	private int id;
    private String dairy;
    
    @OneToOne
    @JoinColumn(name="student_id")
    private Students03 student;

	public Dairy() {
	}
	public Dairy(int id, String dairy) {
		this.id = id;
		this.dairy = dairy;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDairy() {
		return dairy;
	}
	public void setDairy(String diary) {
		this.dairy = diary;
	}
	public Students03 getStudent() {
		return student;
	}
	public void setStudent(Students03 student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Dairy [id=" + id + ", dairy=" + dairy + ", student=" + student + "]";
	}
}
