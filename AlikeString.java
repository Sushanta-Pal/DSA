import java.util.HashSet;
import java.util.Set;

class AlikeString{
    public static void main(String[] args) {
        String s="textbook";
        AlikeString a =new AlikeString();
        System.out.println(a.halvesAreAlike(s));
    }
    public boolean halvesAreAlike(String s) {
       int c1=0;
       int c2=0;
       String str="aeiouAEIOU";
       for(int i=0,j=s.length()/2;i<s.length()/2&&j<s.length();i++,j++){
                if(str.indexOf(s.charAt(i))!=-1){
                    c1++;
                }
                 if(str.indexOf(s.charAt(j))!=-1){
                    c2++;
                }
       }
        return c1==c2;
    }
}