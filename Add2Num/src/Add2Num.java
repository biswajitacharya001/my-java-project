import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		int a, b;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:\n");
		a = scn.nextInt();
		System.out.println("Enter another number:\n");
		b = scn.nextInt();
		
		System.out.println("");
		System.out.println("Sum is:"+(a+b));
		//System.out.println(a+b);
					
	}

}
