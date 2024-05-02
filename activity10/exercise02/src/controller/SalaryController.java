package controller;

import model.Employee;

public class SalaryController {
    public double calculateSalary(Employee employee) {
        // Lógica para calcular o salário do funcionário
        return employee.getBaseSalary();
    }
}
