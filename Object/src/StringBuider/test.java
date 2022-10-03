package StringBuider;

public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append("q");
        System.out.println(sb);

        //支持链式编程
        StringBuilder sb1 = new StringBuilder();//capacity
        sb1.append(2).append("fsdg").append(false).append('n').append("湖梦幻洞").append(1).append(2);
        System.out.println(sb1);


        //反转内容
        sb1.reverse().append(12).append(1234568790);
        System.out.println(sb1);

        //注意：最终结果必须转换成String类型
        String s3 = sb1.toString();
        System.out.println(s3);

    }
}
