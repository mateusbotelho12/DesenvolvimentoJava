package br.edu.ifsuldeminas.model;

public class TestEmployee {
	public static void main(String args[]) {
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("Paulo", "Avila", "333.333.333-33", 1000.10);
		System.out.println(salariedEmployee);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("João", "Silva", "222.222.222-22", 10000,0.25, 1000);
		System.out.println(basePlusCommissionEmployee);
		System.out.println("Salario: " + basePlusCommissionEmployee.earnings());
		
		
		CommissionEmployee commissionEmployee = new CommissionEmployee("Pedro", "Santos", "777.777.777-77", 10000,0.25);
		System.out.println(commissionEmployee);
		System.out.println("Salario: " + commissionEmployee.earnings());
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Manoel", "Tobias", "888.888.888-88", 37.00 ,41);
		System.out.println(hourlyEmployee);
		System.out.println("Salario: " + hourlyEmployee.earnings());
		
	}

}
