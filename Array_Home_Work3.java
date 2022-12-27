import java.util.Scanner;
public class Array_Home_Work3 {
    public static void main(String[] args) {
        int [] arr3 = {41,15,62,88,48,23,62,85};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int num = sc.nextInt();
        int num2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if(num==arr3[i]){
                num2=1;
            }
        }
        if(num2==1){
            System.out.println("The number is founded "+num);
        }
        else{
            System.out.println("Sorry the number is not in the array");
        }
    }
}
