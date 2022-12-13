package spandan;

class Employee{
	String emp_id;
	String emp_name;
	int emp_salary;
	long emp_phone;
	
	public Employee(String employee_id,String employee_name,int employee_salary,long employee_phone) {
		this.emp_id=employee_id;
		this.emp_name= employee_name;
		this.emp_salary=employee_salary;
		this.emp_phone = employee_phone;
	}
	
	public void getData() {
		System.out.println("Emp id "+emp_id+"Emp name "+emp_name+"Emp salary "+emp_salary+"Emp phone "+emp_phone);
	}
	
    /*public void setData(String employee_id,String employee_name,int employee_salary,long employee_phone) {
		emp_id=employee_id;
		emp_name= employee_name;
		emp_salary=employee_salary;
		emp_phone = employee_phone;
	}*/
}
public class getData_setData {

	public static void main(String[] args) {
		Employee emp = new Employee("24n", "Spandan", 25000, 658932145L);
		//System.out.println(emp.emp_id);
		//System.out.println(emp.emp_name);
		//System.out.println(emp.emp_salary);
		//System.out.println(emp.emp_phone);
		//emp.setData("24n", "Spandan", 25000, 658932145L);
		emp.getData();
	}
}
