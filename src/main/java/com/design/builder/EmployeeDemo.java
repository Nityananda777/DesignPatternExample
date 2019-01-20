package com.design.builder;

class Employee {
	private int id;
	private String name;
	private String address;
	private double salary;

	private Employee(EmployeeBuilder employeeBuilder) {
		this.id = employeeBuilder.id;
		this.name = employeeBuilder.name;
		this.address = employeeBuilder.address;
		this.salary = employeeBuilder.salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}
	public static  EmployeeBuilder createBulder()
	{
		return new EmployeeBuilder();	
	}

	 static class EmployeeBuilder {

		private int id;
		private String name;
		private String address;
		private double salary;

		public EmployeeBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee.EmployeeBuilder().setId(101).setName("raja").setAddress("mumbai").setSalary(1010.00).build();
		System.out.println(e.getAddress());
		
	}
}