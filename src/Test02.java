public class Test02 {
    public static void main(String[] args) {
        Animal a1 = new Cats();
        a1.eat();
        System.out.println(a1.num);
        Cats c1 = (Cats)a1;
        c1.move();
    }
}
class Animal{
    public int num = 10;
    public void eat() {
        System.out.println("Animal eat");
    }
}
class Cats extends Animal {
    public int num = 20;
    public void eat() {
        System.out.println("Cat eat");
    }
    public void move() {
        System.out.println("Cat will move");
    }
}
