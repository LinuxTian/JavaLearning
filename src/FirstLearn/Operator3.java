package FirstLearn;

public class Operator3 {
    public static void main(String[] args){
        System.out.println(6 & 3);
        int res = add(6,3);
        System.out.println(res);
        int res1 = Method1.Add(4,5);
        System.out.println(res1);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
class Method1 {
    public static int Add(int a, int b) {
        return a + b;
    }
}