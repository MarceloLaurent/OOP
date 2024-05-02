package view;

import controller.MonthlyReportController;
import controller.SalaryController;
import model.Employee;

//Como a classe Employee violava o SRP, por ser responsável por 3 funções diferentes
//(criar funcionário, calcular salário e gerar relarórios), foram criadas mais duas classes
//para ser responsáveis pelas outras funções

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Colevati");
        employee.setBaseSalary(20000);

        // Calcular o salário do funcionário
        SalaryController calculator = new SalaryController();
        double salary = calculator.calculateSalary(employee);
        System.out.println("Salário de " + employee.getName() + ": " + salary);

        // Gerar relatório mensal
        MonthlyReportController reportGenerator = new MonthlyReportController();
        reportGenerator.generateReport();
    }
}