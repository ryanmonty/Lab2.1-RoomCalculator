import java.util.Scanner;

public class Room_Calulator {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		calculate();
		
	}

	public static void calculate() {

		Scanner scnr = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Length:");
		double Length = scnr.nextDouble();
		System.out.print("Enter Width:");
		double Width = scnr.nextDouble();
		System.out.print("Enter Height:");
		double Height = scnr.nextDouble();

		double area = (Length * Width);
		double perimeter = (Length * 2 + Width * 2);
		double volume = (Length * Width * Height);
		

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);

		
		repeat();
		System.out.println();

		scnr.close();
	}

	public static void repeat() {
		
		Scanner confirm = new Scanner(System.in);
		System.out.print("Continue? (y/n)");
		String Answer = confirm.nextLine();
		
		if (Answer.equals("n")) {
			System.out.println();
			System.out.println("OK, bye!");
		}
		else if (Answer.equals("y")) {
			calculate();
		}
		else {
			System.out.println("please only enter 'y' or 'n'");
			repeat();
		}
		
		confirm.close();

}

}
