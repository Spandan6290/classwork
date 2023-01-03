public class Finally_Demo {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            int arr[] = new int[5];
            arr[7] = 49;
            System.out.println(arr[7]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finaly is always executed");
        }
    }
}
