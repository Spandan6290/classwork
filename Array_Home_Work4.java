public class Array_Home_Work4 {
    public static void main(String[] args) {
        int [] arr4 = {41,15,2,88,148,23,62,85};
        int max = 41;
        int min =41;
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i]>max){
                max = arr4[i];
            }
            else if (arr4[i]<min) {
                min = arr4[i];
            }
        }
        System.out.println("Maximum is "+max);
        System.out.println("Minimum is "+min);
    }
}
