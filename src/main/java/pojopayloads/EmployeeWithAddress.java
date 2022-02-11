package pojopayloads;

public class EmployeeWithAddress {

	private int empno;
	private String firstname;
	private String lastname;
	private String designation;
	private EmpAddress address;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmpAddress getAddress() {
		return address;
	}
	public void setAddress(EmpAddress address) {
		this.address = address;
	}
	
	
	
}
