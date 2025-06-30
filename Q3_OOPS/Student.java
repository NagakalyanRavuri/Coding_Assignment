package Q3_OOPS;

public class Student {
	private String name;
	private  int marks;
	private String rollNo;
	public Student(String name, int marks, String rollNo) {
		
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "name=" + getName() + ", marks=" + marks +", Grade: "+getGrade();
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public   String getGrade() {
		if(marks>=90) {
			return "acheived 'A' grade";
		}
		else if(marks>=75 && marks<=89) {
			return "acheived 'B' grade";
		}
		else if(marks>=60 && marks<=74) {
			return "acheived 'C' grade";
		}
		else {
			return "acheived 'D' grade";
		}
	}
	

}
