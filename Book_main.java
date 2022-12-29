import java.util.Scanner;
public class Book_main {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Book_Service bs = new Book_Service();
        System.out.println("Welcome Book Management");
        do{
            System.out.println("1: createBook\n2: get book id\n3: get all book\n4: update\n5: exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    bs.createBook();
                    break;
                case 2:
                    bs.searchBookById();
                    break;
                case 3:
                    bs.getBook();
                    break;
                case 4:
                    bs.update();
                case 5:
                    System.exit(0);
                default:
                System.out.println("Thanks for visiting");
            }
        }while (true);
    }
}
