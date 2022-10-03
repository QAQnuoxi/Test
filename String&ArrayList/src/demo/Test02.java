package demo;

import java.util.Random;


//Random随机数
public class Test02 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int j = 0; j < 4; j++) {
            int i = random.nextInt(3,6);//  origin起源  bound一定会；很可能会；受(法律、义务或情况)约束(必须做某事)；有义务(做某事)；因…受阻(或不能正常工作)；正旅行去（某地）

            System.out.println(i);
        }
    }
}
