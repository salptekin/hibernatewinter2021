package h02.embeddable;

import javax.persistence.Embeddable;

@Embeddable // @Embeddable is used to make data a class object inside a table
public class Courses02 {

	private String elective;
	private String mandatory;
	
	public Courses02() {
	}
	public Courses02(String elective, String mandatory) {
		this.elective = elective;
		this.mandatory = mandatory;
	}
	public String getElective() {
		return elective;
	}
	public void setElective(String elective) {
		this.elective = elective;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	@Override
	public String toString() {
		return "Courses02: elective=" + elective + ", mandatory=" + mandatory + ".";
	}
}
