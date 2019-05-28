public class ExceptionTest {
    public static void main(String[] args) {
        String username = "tzh";
        RegisterTest cs = new RegisterTest();
        try{
           cs.register(username);
        }catch (IllegalNameException e){
            System.out.println(e.getMessage());
        }
    }
}
class RegisterTest {
    //注册的方法
    public void register(String name) throws IllegalNameException{

        String error = "It's wrong";
        if(name.length()<6){

            //需要在这里面一个抛出非法注册名的异常，不过java里面没有类似的
            //手动抛出异常
            //注意是throw不是throws
            //使用throw在方法体内抛出异常
            throw new IllegalNameException(error);
        }

        //如果代码能执行到此处，证明用户名是合法的.
        System.out.println("注册成功！");

    }
}
class IllegalNameException extends Exception{ //编译时异常
//public class IllegalNameException extends RuntimeException{ //运行时异常

    //定义异常一般提供两个构造方法
    public IllegalNameException(){}


    public IllegalNameException(String msg){
        super(msg);
    }

}