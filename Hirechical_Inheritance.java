class Bank{
    public void loaninterest(){
        System.out.println("9% interest");
    }
}

class SBI extends Bank{
    public void sbiloan(){
        System.out.println("For SBI");
    }
}

class Axis extends Bank{
public void asixloan(){
    System.out.println("For Axis");

}
}

class Hdfc extends Bank{
public void hdfcloan(){
    System.out.println("For Hdfc");

}
}

class Pnb extends Bank{
public void pnbloan(){
    System.out.println("For Pnb");

}
}

public class Hirechical_Inheritance {
    public static void main(String[] args) {
        Bank bk = new Bank();
        Axis ax = new Axis();
        SBI sb = new SBI();
        Pnb pb = new Pnb();
        Hdfc hd = new Hdfc();

        ax.asixloan();
        ax.loaninterest();
        sb.sbiloan();
        sb.loaninterest();
        pb.pnbloan();
        pb.loaninterest();
        hd.hdfcloan();
        hd.loaninterest();

    }
}
