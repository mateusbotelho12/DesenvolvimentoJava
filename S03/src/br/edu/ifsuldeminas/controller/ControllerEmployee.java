package br.edu.ifsuldeminas.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifsuldeminas.model.Employee;

public class ControllerEmployee {
	
	/* padrão de projeto - singleton */
	private static ControllerEmployee instance = null;
	
	/* Arraylist */
	
	private List<Employee> listEmployee = new ArrayList<Employee>();
	
	private ControllerEmployee() {}
	
	public static ControllerEmployee getInstance() {
		if(instance == null) {
			instance = new ControllerEmployee();
		}
		
		return instance;
	}
	
	
	public void Add(Employee employee) {
		listEmployee.add(employee);
	}
	
	public List<Employee> ListAll() {
		return listEmployee;
	}

}
