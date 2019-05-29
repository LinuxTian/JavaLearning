package FirstLearn;

public class FinalTest01{

    public static void main(String[] args){

        final Customer c = new Customer("张三",20);

        //c是final的，无法重新赋值。
        //c = new Customer("李四",21);//Error

        c.name = "王五";
        c.age = 25;

        System.out.println(c.name);
        System.out.println(c.age);

    }
}

class Customer{

    String name;
    int age;

    Customer(String name,int age){
        this.name = name;
        this.age = age;
    }

}