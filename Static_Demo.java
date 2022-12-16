
class Student{
    String id;
    String name;
    static String college = "SVU";
    Student(String id,String name){
        this.id=id;
        this.name=name;
//        this.college=college;
    }

    public void display() {
        System.out.println("The id is: "+id+" The name of the student is: "+name+" The college name is "+ college);
    }
}

public class Static_Demo {
    public static void main(String[] args) {
        Student sp = new Student("51p","Spandan");
        Student su = new Student("51p","Spandan");
        su.display();
        sp.display();
    }
}
