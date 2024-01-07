public class goodSub {
    public static void main(String[] args) {
      String s="xyzzaz";
      System.out.println(countGoodSubstrings(s));  
    }
    public static int countGoodSubstrings(String s) {
        int count =0;
        if (s.length()<3) {
            return count;
        }
        for(int i=2;i<s.length();i++){
            if (s.charAt(i)!=s.charAt(i-1)&&s.charAt(i-1)!=s.charAt(i-2)&&s.charAt(i)!=s.charAt(i-2)) {
                count++;
            }
        }
        return count;
    }
}
