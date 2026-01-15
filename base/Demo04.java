package base;

public class Demo04 {
    //main方法
    //实例变量:从属于对象，如果不自行初始化，这个类型的默认值 数值类：0 0.0 0000
    //布尔值默认是：false
    //除了基本类型，默认值都是null
    //类变量 static
    static double salary = 2500;//自动转换
    //定义一个常量
    static final double PI = 3.14;
    //等价于final static double PI = 3.14; 二者都可以，修饰符不存在先后顺序
    String name;
    int age;
    public static void main(String[] args){
        //局部变量：必须声明和初始化
        int i= 10;
        System.out.println(i);

        //变量类型 变量名字 = new base.Demo04
        Demo04 demo04 = new Demo04();
        System.out.println(demo04.name);
        System.out.println(demo04.age);
        //类变量
        System.out.println(demo04.salary);

        //输出常量
        System.out.println(PI);
    }
    //其他方法
    public void add(){

    }
}
