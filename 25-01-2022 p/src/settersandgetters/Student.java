package settersandgetters;

public class Student 
{
	int studId;
	String studName;
	int studClass;
	String studAdd;
	
	public Student()
	{
		
	}
	
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudClass() {
		return studClass;
	}

	public void setStudClass(int studClass) {
		this.studClass = studClass;
	}

	public String getStudAdd() {
		return studAdd;
	}

	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}

	public static void main(String[] args) 
	{
		Student s= new Student();
		
		//setters
		s.setStudId(1346789);
		s.setStudName("GHY");
		s.setStudClass(10);
		s.setStudAdd("Mumbai");
		
		//getters
		System.out.println(s.getStudId());
		System.out.println(s.getStudName());
		System.out.println(s.getStudClass());
		System.out.println(s.getStudAdd());
		
		

	}

}
