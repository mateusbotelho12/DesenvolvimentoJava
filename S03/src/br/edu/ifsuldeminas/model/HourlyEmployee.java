package br.edu.ifsuldeminas.model;

public class HourlyEmployee extends Employee { // utilizou o extends pois vai invocar paramentros de outra classe Employee
	
	private double wage; //salário por hora
	private double hours; // horas trabalhadas durante a semana
	
	public HourlyEmployee(String firstName, String lastName, String cpf, double wage, double hours) {
		
		
		super(firstName, lastName, cpf); //implementa a chamada do construtor da superclasse
		
		this.wage = wage;
		this.hours = hours;
	}
	
	

	public double getWage() {
		return wage;
	}



	public void setWage(double wage) {
		this.wage = wage;
	}



	public double getHours() {
		return hours;
	}



	public void setHours(double hours) {
		this.hours = hours;
	}



	@Override // calcula e retorna para a classe principal SOBRECARGA, vai sobrescresver na classe principal
	public double earnings() {
		if(getHours() <= 40) {
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	@Override // vai subscrever na classe principal
	public String toString() {
		String s = String.format("Funcionario horista: %s, horas semanais: %s e salário por hora: %s", super.toString(), getHours(), getWage());
		return s;
	}

}
