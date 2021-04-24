package br.edu.ifsuldeminas.model;

public class SalariedEmployee extends Employee {  // utilizou o extends para chamar os parametros da classe Employee 

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String cpf, double weeklySalary) {
		// TODO Auto-generated constructor stub
		super(firstName,lastName,cpf); // utilizou os paramentros da classe Employee
		
		this.weeklySalary = weeklySalary;  // declaração normal do metodo
	}
	
	

	public double getWeeklySalary() {
		return weeklySalary;
	}



	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}



	@Override // so vai retornar o salario passado
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		String s = String.format("Funcionario assalariado: %s, salÃ¡rio semanal: %s", super.toString(), getWeeklySalary());
		return s;
		
	}
	
	
}
