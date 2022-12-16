import java.lang.Math;
import java.util.Scanner;
public class Cube_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the cube");
        int num=sc.nextInt();
        System.out.println(Math.pow(num,3));
    }
}
