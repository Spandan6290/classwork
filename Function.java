package spandan;
import java.util.Scanner;
public class Function {
	static int add(int a,int b) {
		return a+b;
	}static int sub(int a,int b) {
		return a-b;
	}static int mul(int a,int b) {
		return a*b;
	}static int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		do {
		System.out.println("Addition /n Subtraction /n Multiplication /n Division");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
			int sum=Function.add(num1, num2);
			System.out.println(sum);
			break;
			}
			case 2: {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int sub=Function.sub(num1, num2);
				System.out.println(sub);
				break;
				}
			case 3: {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int mul=Function.mul(num1, num2);
				System.out.println(mul);
				break;
			}
			case 4: {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int div=Function.div(num1, num2);
				System.out.println(div);
				break;
			}
			default:
				System.exit(choice);
				System.out.println("Enter the right choice");
			}
		} while (true);
		

	}

}
