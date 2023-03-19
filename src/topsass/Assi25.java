package topsass;

class Member
{
	String name, address;
	int age;
	long contact;
	double salary;
	
	public  Member(String name,int age,long contact,String address,double salary){
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.salary = salary;

	}
	public void salary()
	{
	System.out.println("Salary of "+name+" is: "+salary);
	}

}
public class Assi25 {
	public static void main(String[] args) {
		Member m = new Member("Vilince", 25, 635516115, "Valsad", 90000);
	}
}
