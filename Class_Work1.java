class Board{
    public void display(){
        System.out.println("I am Board Class");
    }
}

class WBCHSE extends Board{
    public void display(){
        System.out.println("I am WBCHSE child of Board Class");
    }
}

class CBSE extends Board{
    public void display(){
        System.out.println("I am CBSE child of Board Class");
    }
}

class ICSE extends Board{
    public void display(){
        System.out.println("I am ICSE child of Board Class");
    }
}

class Salkia_A_S_High_School extends WBCHSE{
    public void display(){
        System.out.println("I am Salkia_A_S_High_School child of WBCHSE Class");
    }
}

class Mahadevi_Birla_School extends CBSE{
    public void display(){
        System.out.println("I am Mahadevi_Birla_School child of CBSE Class");
    }
}

class Do_Bosco_School extends ICSE{
    public void display(){
        System.out.println("I am Do_Bosco_School child of ICSE Class");
    }
}

public class Class_Work1 {
    public static void main(String[] args) {
        Board bd;
        WBCHSE wb;
        CBSE cb;
        ICSE ic;
        bd=new CBSE();
        bd.display();
        bd=new ICSE();
        bd.display();
        bd=new WBCHSE();
        bd.display();
        wb=new Salkia_A_S_High_School();
        wb.display();
        cb = new Mahadevi_Birla_School();
        cb.display();
        ic = new Do_Bosco_School();
        ic.display();
//      bd=new Salkia_A_S_High_School();
//      bd.display();
    }
}
