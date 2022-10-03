package objects;

import object.Student;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student("a",'a',1);
        String s = null;
        String s1 = "afsafgas";
//        System.out.println(s.equals(s1));
        System.out.println(Objects.equals(s, s1));
    }
}
