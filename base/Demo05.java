package base;
public class Demo05 {
    //运算符基本运算
    public static void main(String[] args) {
        //整型运算的特殊点
        long a = 1234567L;
        int b =  1234;
        short c = 12;
        byte d =8;
        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
        //关系运算符返回的结果： 正确，错误（输出bool值）
        //幂运算，如：2^3 2*2*2 = 8 很多运算我们会使用一些工具来操作
        double pow = Math.pow(3,2);
        System.out.println(pow);
        //逻辑运算：与and 或or 非！
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1&&b2:"+(b1&&b2));//逻辑与运算：两个变量都为真，结果才为true
        System.out.println("b1||b2:"+(b1||b2));//逻辑或运算：两个变量有一个为真，结果才为true
        System.out.println("b1&&b2:"+!(b1&&b2));//如果是真，取反为假的，如果是假的，取反为真的
        //短路运算
        int e = 5;
        boolean f =(e<4)&&(++e<1);
        System.out.println(e);
        System.out.println(f);
        //位运算符，如何计算2*8的效率最高
        System.out.println(2<<3);
        //字符串连接
        int t1 = 10;
        int t2 = 20;
        System.out.println(" "+t1+t2);
        System.out.println(t1+t2+" ");
        //三元运算符号
        int score = 80;
        String type = score<60?"不及格":"及格";
        System.out.println(type);
    }
}
