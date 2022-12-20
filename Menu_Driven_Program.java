import java.util.Scanner;

class Menu{
    public void arts(){
        System.out.println("The subject of this stream are:\nHistory\nEnglish\nBengali\nGeogarphy");
    }
    public void commerce(){
        System.out.println("The subject of this stream are:\nLaw\nCost Tax\nAccountancy\nB.S.T.D");
    }
    public void science(){
        System.out.println("The subject of this stream are:\nBiology\nMaths\nPhysics\nChemistry");
    }
}

public class Menu_Driven_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        do {
            System.out.println("Enter your favourite stream you want chose in \nArts(arts)\nCommerce(com)\nScience(sci)");
            String stream = sc.next();
            if(stream.equals("arts")){
                m.arts();
                System.out.println("Are you sure");
                String yorn = sc.next();
                if(yorn.equals("yes")){
                    System.out.println("Congratulation You are enroll to this course");
                    System.exit(1);
                }
                else if(yorn.equals("no")){
                }
            }
            else if(stream.equals("commerce")){
                m.commerce();
                System.out.println("Are you sure");
                String yorn = sc.next();
                if(yorn.equals("yes")){
                    System.out.println("Congratulation You are enroll to this course");
                    System.exit(1);
                }
                else if(yorn.equals("no")){
                }
            }
            else if(stream.equals("science")){
                m.science();
                System.out.println("Are you sure");
                String yorn = sc.next();
                if(yorn.equals("yes")){
                    System.out.println("Congratulation You are enroll to this course");
                    System.exit(1);
                }
                else if(yorn.equals("no")){
                }
            }
            else if(stream!="arts"||stream!="com"||stream!="sci"){
                System.out.println("Please enter a correct a course");
            }
        }while (true);

    }
}
