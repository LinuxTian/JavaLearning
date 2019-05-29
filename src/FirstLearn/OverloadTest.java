package FirstLearn;

public class OverloadTest {
    public static void main(String[] args) {
        overloadTest t = new overloadTest();
        System.out.println(t.max(3,4));
        float x = 3.5f;
        float y = 4.5f;
        System.out.println(t.max(x,y));
    }
}
class overloadTest{
    int max(int a, int b) {
        return a > b ? a : b;
    }
    float max(float a, float b) {
        return a > b ? a : b;
    }
}
