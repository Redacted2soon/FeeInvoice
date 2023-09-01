import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		// variables
		String id, fullName, crnc1, crnc2, split1[], split2[];
		int crn, ch;
		double total;

		// created new scanner for user input
		Scanner stringScanner = new Scanner(System.in);

		System.out.println("Enter the Student's Id: ");
		id = stringScanner.nextLine();

		System.out.println("Enter the Student’s full name: ");
		fullName = stringScanner.nextLine();

		System.out.println("Enter crn/credit hours for the first class(like 5665/3): ");
		crnc1 = stringScanner.next();

		split1 = crnc1.split("/");

		System.out.println("Enter crn/credit hours for the second class(like 5665/3): ");
		crnc2 = stringScanner.next();

		split2 = crnc2.split("/");

		total = ((Float.valueOf((split1[1])) * 120.25) + (Float.valueOf((split2[1])) * 120.25) + 35.00);
		//prints output 
		System.out.println("\nThank you!");
		System.out.println("Fee invoice prepared for: " + fullName + "\n");
		System.out.println("\t\tSIMPLE COLLEGE\r\n" + "\t\tORLANDO FL 10101");
		System.out.println("\t\t*************************");
		System.out.println("\n\t\tFee Invoice Prepared for:");
		System.out.println("\t\t[" + fullName + "][" + id + "]\n");
		System.out.println("\t\t1 Credit Hour = $120.25\n");
		System.out.println("\t\tCRN\tCREDIT HOURS");
		System.out.printf("\t\t%s\t%s\t\t\t$%.2f\n", split1[0], split1[1], Float.valueOf((split1[1])) * 120.25);
		System.out.printf("\t\t%s\t%s\t\t\t$%.2f\n", split2[0], split2[1], Float.valueOf((split2[1])) * 120.25);
		System.out.println("\t\t\tHealth & id fees\t$35.00\n");
		System.out.println("\t\t----------------------------------------");
		System.out.printf("\t\t\tTotal Payments\t\t$%.2f",total);

		stringScanner.close();
	}

}