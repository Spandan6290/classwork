class Parent_Bank{
    public void loanInterest(){
        System.out.println("Parent_Bank 9% interest");
    }
}
class Child_Sbi extends Parent_Bank{
    public void loanInterest(){
        System.out.println("Child_Sbi 10% interest");
    }
}
class Child_Axis extends Parent_Bank{
    public void loanInterest(){
        System.out.println("Child_Axis 7.5% interest");
    }
}
class Child_Hdfc extends Parent_Bank{
    public void loanInterest(){
        System.out.println("Child_Hdfc 6% interest");
    }
}

class Child_Pnb extends Child_Hdfc{
    public void loanInterest(){
        System.out.println("Child_Pnb 8% interest");
    }
}

public class Method_OverRiding {
    public static void main(String[] args) {
//        Parent_Bank pb = new Parent_Bank();
//        Child_Sbi chs = new Child_Sbi();
//        Child_Axis cha = new Child_Axis();
//        Child_Hdfc chd = new Child_Hdfc();
//        pb.loanInterest();
//        chs.loanInterest();
//        cha.loanInterest();
//        chd.loanInterest();

//         Uppcasting
          Parent_Bank pb;
          Child_Hdfc chd;
          chd=new Child_Pnb();
          chd.loanInterest();
          pb=new Parent_Bank();
          pb.loanInterest();
          pb= new Child_Sbi();
          pb.loanInterest();
          pb= new Child_Axis();
          pb.loanInterest();
          pb= new Child_Hdfc();
          pb.loanInterest();
    }
}
