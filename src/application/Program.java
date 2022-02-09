package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int qttEmployee = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= qttEmployee; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsource = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			
			if(outsource == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valueHour, additional));
			
				
			}
			else {
				list.add(new Employee(name, hours, valueHour));
			}
			
		}
		
		System.out.println("PAYMENTS:");
		for(Employee x : list) {
			System.out.println(x.toString());
			
		}
		
		sc.close();
		

	}

}
