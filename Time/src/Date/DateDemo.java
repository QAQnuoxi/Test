package Date;


import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //1.代表系统当前时间
        Date d = new Date();
        System.out.println(d);

        //1.获取当前时间毫秒值
        long time = d.getTime();
        System.out.println(time);


        //2.当前时间向后走一小时
        long time1 = System.currentTimeMillis();
        time1+=(60*60+121)*1000;
        //3.把时间毫秒值转换成对应的日期时间
        Date date =new Date(time1);
        System.out.println(date);
    }
}
