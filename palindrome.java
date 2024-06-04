import java.util.HashMap;
import java.util.*;

class palindrome {
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res=0;
        int oddcount=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            int cfreq = map.get(ch);
            if(cfreq%2==0){
                res+=2;
                oddcount--;
            }
            else {
                oddcount++;
                
            }
            
        }
        if(oddcount>0){
            res+=1;
        }
        return res;
    }
    public static void main(String []args){
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
}