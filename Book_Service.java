import java.util.Scanner;
public class Book_Service {
    Book book [] = new Book[10];
    int index = 0;
    Scanner sc = new Scanner(System.in);
    public void createBook(){
        int id;
        String name;
        int price;
        System.out.println("Enter the Book id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Book name");
        name = sc.nextLine();
        System.out.println("Enter the Book price");
        price = sc.nextInt();
        book[index] = new Book(id,name,price);
        index++;
        System.out.println("Books added succesfully");
    }

    public void getBook(){
        for (int i = 0; i < index; i++) {
            System.out.println("Book id: "+book[i].getBookId());
            System.out.println("Book name: "+book[i].getBookName());
            System.out.println("Book price: "+book[i].getBookPrice());
        }
    }

    public void searchBookById(){
        System.out.println("Enter the book id");
        int s_id = sc.nextInt();
        int i;
        for (i = 0; i < index; i++) {
            if(book[i].getBookId()==s_id){
                System.out.println("Book id: "+book[i].getBookId());
                System.out.println("Book name: "+book[i].getBookName());
                System.out.println("Book price: "+book[i].getBookPrice());
                break;
            }
        }
        if(i==index){
            System.out.println("The book is not found");
        }
    }

    public void update(){
        System.out.println("Enter the book id");
        int s_id = sc.nextInt();
        int i;
        for (i = 0; i < index; i++) {
            if(book[i].getBookId()==s_id){
                int id;
                String name;
                int price;
                System.out.println("Enter the Book updated id");
                id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Book updated name");
                name = sc.nextLine();
                System.out.println("Enter the Book updated price");
                price = sc.nextInt();
                book[index] = new Book(id,name,price);
                System.out.println("Book is updated");
            }
        }
        if(i==index){
            System.out.println("The book is not found");
        }
    }
}
