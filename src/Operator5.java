public class Operator5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(3);
        System.out.println(s.getAge());
    }
}
class Student{
    private int age;
    private String name;
    private boolean sex;

    public void setAge(int _age) {
        age = _age;
    }
    public int getAge() {
        return age;
    }
}
