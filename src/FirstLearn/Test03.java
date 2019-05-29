package FirstLearn;

public class Test03 {
    public static void main(String[] args) {
        Person tian = new Person();
        Benz b1 = new Benz();
        tian.run(b1);
    }
}
interface Car{
    public void run();
}
class Benz implements Car{
    public void run() {
        System.out.println("Benz is running");
    }
}
class Person{
    public void run(Car c) {
        c.run();
    }
}