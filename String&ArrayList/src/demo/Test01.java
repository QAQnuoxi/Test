package demo;

import demo.object.Movie;
import demo.object.Student;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {


//        ArrayList遍历删除、存对象、搜索
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int i1 = new Random().nextInt(30, 100);//随机数为成绩
            scores.add(i1);
        }
        System.out.println(scores);

        //将成绩低于70分的成绩去掉
//        for (Integer score : scores) {//错误示范  因为存在数组前移或重复成绩情况
//            if (score<70){
//                scores.remove(score);
//            }
//        }
//        scores.removeIf(score -> score < 70);//自动生成的正则表达式

        for (Integer i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score<70){
                scores.remove(scores.get(i));
                i--;
            }
        }
        System.out.println(scores);

        System.out.println();
//        存储自定义类型的对象

        Movie movie = new Movie("《间谍过家家》",9,"小亮");
        Movie movie1 = new Movie("《阿甘正传》",8.1,"汉克斯");
        Movie movie2 = new Movie("《肖申克的救赎》",9,"罗宾斯");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie1);
        movies.add(movie2);


        for (Movie movie3 : movies) {
            System.out.println(movie3.getActor());
            System.out.println(movie3.getScore());
            System.out.println(movie3.getName());
        }


        //信息的数据搜索
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        for (Integer i = 0; i < 4; i++) {
            String a = scanner.next();
            String b = scanner.next();
            int c = scanner.nextInt();
            String d = scanner.next();
            students.add(new Student(a,b,c,d));
        }
        for (Student student : students) {
            System.out.println(student.getAge()+","+student.getName()+","+student.getClassName()+","+student.getId());
        }


    }





}

