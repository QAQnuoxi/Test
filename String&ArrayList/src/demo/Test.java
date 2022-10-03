package demo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "abcabcabc";
        String name = "QAQ爱画圈";
        String name1="QAQ";
        //1.字符串长度   name.length()
        System.out.println(name.length());
        System.out.println();

        //2. 获取指定索引位的字符  name.charAt(4)
        System.out.println(name.charAt(4));
        System.out.println();

        //3. 字符串转换字符数组  name.toCharArray()
        for (char c : name.toCharArray()) {
            System.out.print(c);
        }//迭代打印
        System.out.println(Arrays.toString(name.toCharArray()));//toString转换  Arrays.toString
        System.out.println();

        //4. 截取内容
        System.out.println(name.substring(3));//以指定索引处的字符开始并延伸到该字符串的末尾
        System.out.println(name.substring(1, 4));//从指定的beginIndex开始并延伸到索引endIndex - 1处的字符
        System.out.println();

        //5. 内容替换   s.replace()

        System.out.println(s.replace("abc","x"));
        //用指定的文字替换序列替换此字符串中与文字目标序列匹配的每个子字符串。替换从字符串的开头到结尾进行，例如，将字符串“aaa”中的“aa”替换为“b”将导致“ba”而不是“ab”。
        System.out.println(s.replace('a','b'));//用newChar替换此字符串中所有出现的oldChar   replace()
        System.out.println(name.replaceAll("Q","b"));
        System.out.println(s.replaceAll("abc","x"));//好像是能替换包含正则表达式的啥东西（用起来和replace差不多）
        System.out.println(s.replaceAll("abc","x"));
        System.out.println();

        //6.  判断是否包含   name.contains()
        System.out.println(name.contains(s));
        System.out.println(name.contains("QAQ爱画圈"));
        System.out.println(name.contains(name1));
        System.out.println();

        //7.  测试   字符序列是否是此字符串表示的字符序列的前缀
        System.out.println(name.startsWith("QA"));//如果参数表示的字符序列是此字符串表示的字符序列的前缀，则为true ；否则false
        System.out.println(name.startsWith("QA",1));//从指定索引开始的此字符串的子字符串是否以指定前缀开头
        System.out.println();


        //8.  围绕给定正则表达式的匹配拆分此字符串
        String name2= "QAQ:QAQ:QAQ:QAQ";
        String[] as = name2.split("Q");//     [, A, :, A, :, A, :, A]
        String[] as1 = name2.split(":");//    [QAQ, QAQ, QAQ, QAQ]
        String[] as2 = name2.split(":",3);// [QAQ, QAQ, QAQ:QAQ]
        System.out.println(Arrays.toString(as));
        System.out.println(Arrays.toString(as1));
        System.out.println(Arrays.toString(as2));

    }
}
