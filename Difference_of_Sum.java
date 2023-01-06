public class Difference_of_Sum {
    public void difference_of_sum(int m,int n){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if(i%n!=0){
                sum1=sum1+i;
//                System.out.println(i);
            }
            else{
                sum2=sum2+i;
//                System.out.println(i);
            }
        }
        System.out.println("Sum of numbers that are divisible by n "+sum1);
        System.out.println("Sum of numbers that are not divisible by n "+sum2);
        System.out.println("Difference between the numbers that are divisible by n and not divisible by n  " + (sum1-sum2));
    }
    public static void main(String[] args) {
        Difference_of_Sum def_sum = new Difference_of_Sum();
        def_sum.difference_of_sum(49,5);
    }
}
