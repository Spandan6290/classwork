import java.util.Scanner;
public class Sort_Words_based_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text you want to sort");
        String str = sc.nextLine();
//        System.out.println(str);

        String arr1[] = str.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i].length() > arr1[j].length()) {
                    String temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.println(arr1[i]);
        }
    }
}
