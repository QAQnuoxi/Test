package object;

public class test {
    public static void main(String[] args) {
        Student s = new Student("QAQ",'女',3);
        Student s1 = new Student("QAQ",'女',3);
        System.out.println(s.equals(s1));
        System.out.println(s.toString());
    }
}
