package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));

        }

        System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
        int employeeId = sc.nextInt();
        System.out.print("Digite a porcentagem de aumento salarial: ");
        double percentage = sc.nextDouble();

        // Aplicar o aumento salarial corretamente
        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                double newSalary = emp.getSalary() * (1 + percentage / 100);
                emp.setSalary(newSalary);
                break;
            }
        }


        // Exibir os funcionários e seus salários atualizados
        System.out.println("\nFuncionários registrados:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
