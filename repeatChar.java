public class repeatChar {
    public static void main(String[] args) {
       String s="abcabcbb";
       repeatChar r=new repeatChar();
    //    System.out.println(r.lengthOfLongestSubstring(s));
       System.out.println(r.longestPalindrome(s));
        
    }
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        StringBuilder str= new StringBuilder("");
        int max=0;
        for(char ch:arr){
            if (str.indexOf(ch+"")==-1) {
                str.append(ch);
            }else{
                str.delete(0, str.indexOf(ch+"")+1);
                str.append(ch);
            }
            max=Math.max(max, str.length());
        }
        return max;
    }
   


        public String longestPalindrome(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }
    
            return helper(s, 0, s.length() - 1);
        }
    
        private String helper(String s, int start, int end) {
            if (start > end) {
                return "";
            }
    
            // Check if the current substring is a palindrome
            if (ispalindrome(s, start, end)) {
                return s.substring(start, end + 1);
            }
    
            // Recursively check palindromes excluding one character from either end
            String withoutFirst = helper(s, start + 1, end);
            String withoutLast = helper(s, start, end - 1);
    
            // Return the longer palindrome substring
            return withoutFirst.length() > withoutLast.length() ? withoutFirst : withoutLast;
        }
    
        private boolean ispalindrome(String s, int start, int end) {
            while (start <= end) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
    

