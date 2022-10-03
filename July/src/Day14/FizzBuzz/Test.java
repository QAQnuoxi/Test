package Day14.FizzBuzz;


import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
//        int a[]={1,1,1,24,56,6,789899,25463,6245768,248736868,458738636,53547};
//        System.out.println(Arrays.toString(a));//打印数组元素
//
//        for (int i = 0; i < 3; i++) {
//
//        }

        Solution solution = new Solution();
        List<String> fizzBuzz = solution.fizzBuzz(8768);
        String s = fizzBuzz.toString();
        System.out.println(s);
        for (String buzz : fizzBuzz) {
            System.out.println(buzz);
        }

    }
}
