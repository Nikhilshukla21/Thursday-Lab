package studentsystem;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------Welcome to Student Management system---------------");
			System.out.println("Press 1. for create student\nPress 2. for get student by id\n"
					+ "Press 3. for update student by id\n" + "Press 4. for delete student by id\n"
					+ "Press 5. for get all students\n" + "Press 6. for quit");
			System.out.println("=====================================");
			System.out.println("Enter your choice!");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				StudentService.createStudent();

				System.out.println("=====================================");
				break;

			case 2:
				System.out.println("Enter id to search:");
				int id = sc.nextInt();
				try {
					StudentService.getStudentById(id);
				} catch (StudentNotFoundException sf) {
					System.out.println(sf.getMessage());
				}
				System.out.println("=====================================");
				break;

			case 3:
				System.out.println("Enter id to update:");
				id = sc.nextInt();
				try {
					StudentService.updateStudent(id);
				} catch (StudentNotFoundException sf) {
					System.out.println(sf.getMessage());
				}
				System.out.println("=====================================");
				break;

			case 4:
				System.out.println("Enter id to delete:");
				id = sc.nextInt();
				try {
					StudentService.deleteStudent(id);
					;
				} catch (StudentNotFoundException sf) {
					System.out.println(sf.getMessage());
				}
				System.out.println("=====================================");
				break;
			case 5:
				System.out.println("All students are:");
				StudentService.getAllStudents();
				System.out.println("=====================================");
				break;
			default:

				// Print statement
				System.out.println("\nInvalid input!\n");
				break;

			case 6:
				System.out.println("Thank You visit again!");
				break;
			}
		} while (choice != 6);
	}

}
