public class Star_pattern2 {
    public static void main(String[] args) {
        int i, j, k;
        for(i=5; i>=0; i--)
        {
            for(j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<(i*2); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
