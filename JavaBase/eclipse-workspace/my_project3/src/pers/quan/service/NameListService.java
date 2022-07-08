package pers.quan.service;


import pers.quan.customException.TeamException;
import pers.quan.domain.Architect;
import pers.quan.domain.Designer;
import pers.quan.domain.Employee;
import pers.quan.domain.Equipment;
import pers.quan.domain.NetBook;
import pers.quan.domain.Pc;
import pers.quan.domain.Programmer;
import pers.quan.util.Data;

public class NameListService {
	
	static Employee  employee[] = new Employee[Data.EMPLOYEES.length]; // 提供的成员
	
	public static void main(String[] args) {

	}
	
	public NameListService() {
		
		for(int i = 0; i < employee.length;i++) {
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			Double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			double bonus = Double.parseDouble(Data.EMPLOYEES[i][4]);
			Equipment quipment;
			switch(Integer.parseInt(Data.EMPLOYEES[i][0])) {
				// 普通员工
				case Data.EMPLOYEE:
					employee[i] = new Employee(id,name,age,salary);
					break;
				//程序员
				case Data.PROGRAMMER:
					quipment = new Pc(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
					employee[i] = new Programmer(id,name,age,salary,quipment);
					break;
				//设计师
				case Data.DESIGNER:
					quipment = new Pc(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
					employee[i] = new Designer(id,name,age,salary,bonus,quipment);
					break;
				//架构师
				case Data.ARCHITECT:
					quipment = new Pc(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
					employee[i] = new Architect(id,name,age,salary,bonus,Integer.parseInt(Data.EMPLOYEES[i][5]),quipment);
					break;
			}
		}
	}
	
	
	public Employee[] getAllEmployees() {
		return employee;
	}
	public  Employee getEmployee(int id) throws TeamException {
		for(int i= 0;i<employee.length;i++) {
			if (employee[i].getId() == id) {
				return employee[i];
			}
		}
		//		没有找到，抛出异常
		throw new TeamException("找不到指定的员工");
	}
}
