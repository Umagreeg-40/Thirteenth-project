package settersAndToStrings;

public class Student
{
	int studId;
	String studName;
	int studClass;
	String studAdd;
	
	public Student()
	{
		
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public void setStudClass(int studClass) {
		this.studClass = studClass;
	}

	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studClass=" + studClass + ", studAdd="
				+ studAdd + "]";
	}
	
	public static void main(String[] args) 
	{
		Student s= new Student();
		
		//setters
		s.setStudId(1346789);
		s.setStudName("GHY");
		s.setStudClass(10);
		s.setStudAdd("Mumbai");
		
		System.out.println(s);
	}
}
