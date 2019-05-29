package FirstLearn;

public class Test01 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.climb();
        t.eat();
        t.hall();
        t.m1();

        Sheep s = new Sheep();
        s.eat();

        A.m1();
        B.m1();
    }
}
class Animal {
    public void hall() {
        System.out.println("It is an animal");
    }
    public void eat() {
        System.out.println("It's eating");
    }
}
class Tiger extends Animal {
    public void climb() {
        System.out.println("Tiger cannot climb tree");
    }
    public void eat() {
        System.out.println("Tiger eat meat");
    }
    public void m1() {
        this.eat();
        super.eat();
    }
}
class Sheep extends Animal {
    public void eat() {
        System.out.println("Sheep eat grass");
    }
}
class A{

    //静态方法
    public static void m1(){
        System.out.println("A中静态方法m1");
    }
}

class B extends A{

    //尝试重写父类的静态方法
    public static void m1(){
        System.out.println("B中静态方法m1");
    }
}
