import java.util.Scanner;
public class Ternei_Operator {
    public static void main(String[] args) {
        int num1,num2;
        int max;
        System.out.println("Enter the num1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        num2 = sc.nextInt();
        max = (num1>num2)?num1:num2;
        System.out.println("Max is "+max);
    }
}
