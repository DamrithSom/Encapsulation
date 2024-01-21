
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User myUser = new User();
		myUser.setId(0157);
		myUser.setName("Alex");
		myUser.setDateOfbirth("1-21-2024");
		myUser.setSex("Male");
		myUser.setSalary(450);
		System.out.println("User ID     : "+ myUser.getId());
		System.out.println("User Name   : "+ myUser.getName());
		System.out.println("User Sex    : "+ myUser.getSex());
		System.out.println("User DOB    : "+ myUser.getdateOfbirth());
		System.out.println("User Salary : "+ myUser.getSalary());
	}

}
