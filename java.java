import java.util.Scanner;
public class Java{
	public static void main(String[] args) {
	
	int num1, num2, sum, zb, pj,shum, all, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();
		
		sc.close();
		sum = num1 + num2;
		zb = num1 - num2;
		pj = num1 / num2;
		shum = num1 * num2;
		all = num1 * num1 / num1 + num2;
		System.out.println("Sum of these numbers: " + sum);	
		System.out.println("Zb of these numbers: " + zb);
        System.out.println("Pj of these numbers: " + pj);
        System.out.println("Shum of these numbers: " + shum);
        System.out.println("All of these numbers: " + all);			
	}
	
}