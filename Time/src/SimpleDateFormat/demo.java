package SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        //2. 格式化这个日期对象（指定最终格式化的形式）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss  EEE a");

        //3. 开始格式化日期对象成为喜欢的字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);

        //4. 解析时间



    }
}
