class Animal{
    public void display(){
        System.out.println("I am the parent class Dog");
    }
}
class Dog extends Animal{
    public void dog(){
        System.out.println("I am Dog class child of Animal Class");
    }
}
class Puppy extends Dog{
    public void puppy(){
        System.out.println("I am the puppy class child of Dog class and grand child of Animal Class");
    }
}

public class MultipleLevel_Inheritance {
    public static void main(String[] args) {
        Puppy py = new Puppy();
        py.display();
        py.dog();
        py.puppy();

    }
}
