package Math;

public class Test {
    public static void main(String[] args) {
        //1. 绝对值
        System.out.println(Math.abs(12.66));
        System.out.println(Math.abs(-12.66));

        //2. 向上取整
        System.out.println(Math.ceil(4.00000000000000000000000000000000000000001));
        //3. 向下取整
        System.out.println(Math.floor(4.9999999999999999999999999999999999999999));

        //4. 指数
        System.out.println(Math.pow(4,6));//4的6次方

        //5.四舍五入
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));

        //6. 0.0~1.0的随机数
        System.out.println(Math.random());
    }
}
