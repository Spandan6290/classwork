 final class Motor_Bike{
    final void speed(){
        System.out.println("150km");
    }
}

public class Final_Variable_keyword /*extends Motor_Bike*/ /*final class can not be extend*/ {
//    void speed(){ //final method can not be override
//        System.out.println("160km");
//    }
    final int a = 100;
    public static void main(String[] args) {
        Final_Variable_keyword fvk = new Final_Variable_keyword();
        //fvk.a=15; //can not asign variable to final variable
        System.out.println(fvk.a);
//        fvk.speed();
        Motor_Bike mtrb = new Motor_Bike();
        mtrb.speed();
//        Final_Variable_keyword fvk = new Motor_Bike();
    }
}
