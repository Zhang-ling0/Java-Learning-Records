package base;

public class Demo02 {
    public static void main(String[] args ) {
        //整数拓展： 进制 二进制0b 十进制 八进制0 十六进制0x
        int i1 = 10;
        int i2 = 010;//八进制0
        int i3 = 0x10;//十六进制0x 0~9 A~F

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //浮点数扩展 eg:银行业务怎么表示？不使用浮点数表示钱，使用BigDecimal（数学工具类进行表示
        //float 因为浮点数是有限且离散的，四舍五入后具有误差，是个大约的数，接近但不等于
        //double
        //最好完全使用浮点数进行比较
        float f1 = 0.1f;
        double d1 = 0.1;
        double d2 = 1.0/10;
        System.out.println(f1==d1);//false
        System.out.println(d1==d2);//ture
        System.out.println(f1==d2);//false
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(d2);

        float f2 = 1234567890f;
        float f3 = f2+1;
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f2==f3);//true

        //字符扩展
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);//字符型可以涉及强制类型转换
        System.out.println((int)c2);
        //原因是因为所有的字符本质上还是数字
        //unicode编码表（97 = a;20013 = 中），占两个字节（可以表示0-65536字符，2的16次方）
        //U0000 UFFFF
        char c3 = '\u0061';
        System.out.println(c3);//a

        //转译字符 \t 制表符 \n 换行
        System.out.println("base.Hello\nWorld");
        System.out.println("base.Hello\tWorld");

        String sa = new String("HelloWorld");
        String sb= new String("HelloWorld");
        System.out.println(sa==sb);//false,地址不同
        String sc = "HelloWorld";
        String sd= "HelloWorld";
        System.out.println(sc==sd);//true

        //布尔值扩展
        boolean flag = true;
        if(flag==true){}
        //等价于
        if(flag){}//更加专业


    }

}
