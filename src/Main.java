public class Main {

    private static int age = 10;
    String str = "abc";
    boolean b = true;// 默认值 false
    byte bb = 1;//字节型 默认值 0
    short s = 2;
    int i = 10;
    long l = 100L;
    float f = 10.4f;
    double d = 10.8d;
    char c = 'c';
    static int ii;


    public static void main(String[] args) {
        int no = 19180254;
        age = 20;
        int ii; //内部变量没有初始值
        ii = 10;
        int i = 22;
        short s = 11;
        i = s;
        s = (short) i;
        System.out.println("张三的年龄市" + age + "xuehao " + no);
       /* String str = "aaa\rbbb";
        System.out.println(str);*/

    }


    /*
    此功能获取年龄学号
     */
    public void myAgeAndNo() {
        System.out.println(str);
    }

}
