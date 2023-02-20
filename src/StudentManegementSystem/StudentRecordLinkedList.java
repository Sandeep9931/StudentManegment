package StudentManegementSystem;

import java.util.Scanner;

public class StudentRecordLinkedList {

	public static void main(String[] args) {

		StudentRecordManagement hr = new StudentRecordManagement();

		Record record = new Record();
		record.setIdNumber(11909125);
		record.setContactNumber(9931879700l);
		record.setName("Sandeep Kumar");

		hr.add(record);

		Scanner input = new Scanner(System.in);

		int option = 0;
		do {
			menu();
			option = input.nextInt();
			switch (option) {
			case 1:
				System.out.println("What is the Student id Number ? ");

				int idNumber = input.nextInt();

				System.out.println("What is the Student contact Number ? ");

				long contactNumber = input.nextLong();
				int count = 0;
				long temp = contactNumber;
				while (temp != 0) {
					temp /= 10;
					count++;
				}
				if (count < 10) {
					System.out.println("Please Enter 10 digit Number!");
					break;
				}

				input.nextLine();

				System.out.println("What is the Student Name ? ");

				String name = input.nextLine();

				record = new Record(name, idNumber, contactNumber);

				hr.add(record);
				System.out.println("Student Record Added Successfully");
				break;

			case 2:

				System.out.println("What is the Student id number ? ");
				int rId = input.nextInt();
				hr.delete(rId);

				break;

			case 3:
				System.out.println("What is the Student id number? ");

				int rIdNo = input.nextInt();
				hr.update(rIdNo, input);

				break;

			case 4:

				System.out.print("What is the Student id ? ");
				int bookId = input.nextInt();

				if (!hr.find(bookId)) {
					System.out.println("Student id does not exist\n");
				}

				break;

			case 5:
				hr.display();
				break;

			case 9:
				System.out.println("\nThank you for using the program. Goodbye!\n");
				System.exit(0);

				break;
			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		} while (option != 9);
	}

	public static void menu() {
		System.out.println("MENU");
		System.out.println("1: Add Student");
		System.out.println("2: Delete Student");
		System.out.println("3: Update Student");
		System.out.println("4: Search Student");
		System.out.println("5: Display Students");
		System.out.println("9: Exit program");
		System.out.println("Enter your selection : ");
	}
}
