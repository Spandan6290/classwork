public class Array_Home_Work2 {
    public static void main(String[] args) {
        int [] arr2 = {41,15,62,88,48,23,62,85};
        int a = 0,b=0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]%2==0){
                a++;
            }
            else if (arr2[i]%2!=0) {
                b++;
            }
        }
        System.out.println("The number of even number are in the array: "+a);
        System.out.println("The number of add number are in the array: "+b);
    }
}
