package test.com.Maven;

public class Student {

	
	 
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", studId=" + studId + ", marks=" + marks + "]";
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	private String stdName;
	 private int studId;
	 private double marks;
	 
	 public Student(String stdName, int studId, double marks) {
			super();
			this.stdName = stdName;
			this.studId = studId;
			this.marks = marks;
		}
	 
	 
	class College{
		@Override
		public String toString() {
			return "College [collName=" + collName + ", location=" + location + ", collegeCode=" + collegeCode + "]";
		}
		public College(String collName, String location, long collegeCode) {
			super();
			this.collName = collName;
			this.location = location;
			this.collegeCode = collegeCode;
		}
		private String collName;
		private String location;
		private long collegeCode;
	}
	
}
