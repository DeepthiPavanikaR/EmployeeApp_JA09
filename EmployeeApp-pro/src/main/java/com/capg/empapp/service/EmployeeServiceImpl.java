package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdException;
import com.capg.empapp.exception.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
	// Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {

		// System.out.println(" ------------>> inside service "+e);

		if (e.getSalary() > 50000) {
			throw new WrongSalaryException();
		} else
			return dao.addEmployee(e);

	}

	public Employee[] getAllEmployees() {

		return dao.getAllEmployees();
	}

	// ================================================================================

	public boolean editSalaryByEmployeeId(int id, double salary) throws InvalidEmployeeIdException {
		
		if (!dao.editSalaryByEmployeeId(id, salary)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editSalaryByEmployeeId(id, salary);
	}

	public boolean editExpByEmployeeId(int id, int exp) throws InvalidEmployeeIdException {
		
		if (!dao.editExpByEmployeeId(id, exp)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editExpByEmployeeId(id, exp);
	}

	public Employee[] getEmployeeBySalary(double salary) {

		return dao.getEmployeeBySalary(salary);
	}
	
	public Employee[] getEmployeeByExperience(int exp) {

		return dao.getEmployeeByExperience(exp);
	}


	public Employee[] getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}
}