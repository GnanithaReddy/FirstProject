
public class People {
	
	public String Fname;	
	public String Lname;
	public int Age;
	
	public People(String fname, String lname, int age) {
		super();
		Fname = fname;
		Lname = lname;
		Age = age;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "People [Fname=" + Fname + ", Lname=" + Lname + ", Age=" + Age + "]";
	}
	
	
	

}
