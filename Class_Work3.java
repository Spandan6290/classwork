import java.util.Scanner;
interface LibraryUser{
    void registersaccount();
    void requestbook();
}

class KidsUser implements LibraryUser{
    String name;
    KidsUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }
    @Override
    public void registersaccount() {
        System.out.println("You have been registered name:"+name);
    }

    @Override
    public void requestbook() {
        System.out.println("These are the kids section books:\n1.Tom and Jerry\n2.Pappy the Sailer");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        if(book.equals("Tom and Jerry")){
            System.out.println("You have got Toma nd jerry");
        }
        else{
            System.out.println("You have got Pappy the Sailer");
        }
    }
}

class AdultUser implements LibraryUser{
    String name;
    AdultUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }
    @Override
    public void registersaccount() {
        System.out.println("You have been registered name:"+name);
    }

    @Override
    public void requestbook() {
        System.out.println("These are the Adults section books:\n1.Attack on Titan\n2.Tokyo Ghoul");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        if(book.equals("Attack on Titan")){
            System.out.println("You have got Attack on Titan");
        }
        else{
            System.out.println("You have got Tokyo Ghoul");
        }
    }
}

public class Class_Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<=15) {
            LibraryUser klibu = new KidsUser();
            klibu.registersaccount();
            klibu.requestbook();
        }
        else if (age>=15) {
            LibraryUser Alibu = new AdultUser();
            Alibu.registersaccount();
            Alibu.requestbook();
        }

    }
}
