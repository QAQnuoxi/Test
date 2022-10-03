package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2 {
    public static void main(String[] args) throws ParseException {
        String begin = "00:00:00";//开始时间
        String end = "00:10:10";//结束时间

        String a = "00:06:33";//要比较的时间

        //解析时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date begin1 = simpleDateFormat.parse(begin);
        Date end1 = simpleDateFormat.parse(end);
        Date a1 = simpleDateFormat.parse(a);




    }
}
