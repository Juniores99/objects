package alculate;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectagule;

public class ProgramC {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectagule rect = new Rectagule();
		
		System.out.println("Enter rectangule width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf(" Diagonal = %.2f%n", rect.perimeter());
		
		
		sc.close();

	}

}
