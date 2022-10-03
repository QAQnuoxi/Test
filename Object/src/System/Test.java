package System;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

//        System.out.println("开始");
//
//        System.exit(3);//终止JVM虚拟机
//
//        System.out.println("结束");

        //2.时间

        long time = System.currentTimeMillis();
        System.out.println(time);

        //进行时间计算：性能分析
//        for (int i = 0; i < 1000000; i++) {
//            System.out.print("输出"+i);
//        }
        System.out.println();
        long time1 = System.currentTimeMillis();
        long time2 = time1-time;
        System.out.println(time2/1000.0+"s");

        //3. 数组拷贝
        int[] integers = new int[10];
        int[] integers1 = new int[10];
        Random random = new Random();
        for (int i = 0; i <10; i++) {
            integers[i]=(random.nextInt());

        }
        for (int i = 0; i < 10; i++) {
            integers1[i]=(0);
        }
        System.out.println(Arrays.toString(integers));
        System.arraycopy(integers,4,integers1,3,4);//源数组的第几位开始，操作数组的索引开始位置，拷贝几个
        System.out.println(Arrays.toString(integers1));
        System.out.println();
        System.out.println();

        //4. BigDecimal  包装浮点数据为大数据对象
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.01);
        System.out.println(1.0011*100);
        System.out.println(1.0333/100);
        System.out.println("============");
        double a= 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);
        System.out.println("============");
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c1=a1.add(b1);//+
        BigDecimal c2=a1.subtract(b1);//-
        BigDecimal c3=a1.multiply(b1);//*
        BigDecimal c4=a1.divide(b1);// /
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //BigDecimal转double类型
        double v = c1.doubleValue();

        //注意：BigDecimal一定要精度运算
        BigDecimal x = BigDecimal.valueOf(10.0);
        BigDecimal y = BigDecimal.valueOf(3.0);
//        BigDecimal z = x.divide(y);//会崩溃
        BigDecimal z = x.divide(y,10, RoundingMode.HALF_UP);//传递参数可解决
        System.out.println(z);
    }
}
