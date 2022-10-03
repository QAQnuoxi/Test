package Day13.ransomNote;

public class Solution {
    public boolean canConstruct(String ransomNote,String magazine){
/*        if (ransomNote.length()>magazine.length()){
            return false;
        }
        char[] ransom = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();
        for (int i = magazines.length; i >=0 ; i--) {
            char m = magazines[i];
            while (true){
                for (int j = 0; j < ransom.length; j++) {
                    char r = ransom[j];
                    if (r==m){
                        break;
                    }
                }
            }
        }*/
        if (ransomNote.length()>magazine.length()){
            return false;
        }
//        Statistical统计
        char[] ransom = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();
        int[] Statistical = new int[26];
        int[] Statistical1 = new int[26];
        for (int i = 0; i < magazines.length; i++) {
            Statistical[magazines[i]-'a']++;
        }
        for (int i = 0; i < ransom.length; i++) {
            Statistical1[ransom[i]-'a']++;
        }
        for (int i = 0; i < Statistical.length; i++) {
            if (Statistical1[i]>Statistical[i]){
                return false;
            }
        }
        return true;
    }
}
