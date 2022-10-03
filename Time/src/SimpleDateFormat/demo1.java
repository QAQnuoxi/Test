package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) throws ParseException {
        //学会使用SimpleDateFormat解析字符串时间成为日期对象

        //问题：2021年09月08日 10:10:10 向后3天 10小时 30分 09秒后的时间是多少

        //1. 写入字符串时间
        String date = "2021年09月08日 10:10:10" ;
        //2. 将字符串解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(date);
        //3.  增加时间
        long time = d.getTime()+(3L*24*60*60+10*60*60+30*60+9)*1000;

        //4.格式化
        String f = sdf.format(time);
        System.out.println(f);


        


    }
}
