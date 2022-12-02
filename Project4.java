import java.util.Scanner;
public class Project4{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int num1 = sc.nextInt();
if(num1%5==0 && num1%11==0){
System.out.println(num1+ "is divissible by 5 and 11");
}
else{
System.out.println(num1+ " is not divissible by 5 and 11");
}
}
}