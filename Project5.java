import java.util.Scanner;
public class Project5{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1");
int num1 = sc.nextInt();
System.out.println("Enter number 2");
int num2 = sc.nextInt();
if(num1==num2){
System.out.println("These two numbers are similar");
}
else{
System.out.println("These two numbers are not similar");
}
}
}