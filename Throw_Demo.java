import java.io.IOException;

public class Throw_Demo {
    static void valid_age(int age)/*throws Age_Validation_Exception*/{
        try {
        if (age < 18) {
            throw new Age_Validation_Exception(age+" is not valid for vote");
        }
        else {
            System.out.println(age+"is valid for vote");
        }
        }catch (Age_Validation_Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
//        try {
        valid_age(5);
//        }catch (Age_Validation_Exception s){
//            System.out.println(s.getMessage());
//        }
    }
}
