public class Solution {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      
        StringBuilder sb1 = new StringBuilder();
        for (String w : word1) {
            sb1.append(w);
        }
        
        
        StringBuilder sb2 = new StringBuilder();
        for (String w : word2) {
            sb2.append(w);
        }
        
     
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
      
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        
        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result);  // Output: true

    
        String[] word1b = {"abc", "d", "ef"};
        String[] word2b = {"ab", "cdef"};
        
        boolean result2 = arrayStringsAreEqual(word1b, word2b);
        System.out.println(result2);  // Output: false
    }
}

