import java.util.Arrays;
public class AssignCoockis {
    public static void main(String[] args) {
        int[] g={8,4,6,3};
        int[] s={9,3,4,7};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int i=0;int j=0;
       Arrays.sort(g);
       Arrays.sort(s);
       //Sort the Arrays First in Assending Order..
       while (j<s.length&& i<g.length) {
           if (s[j] >= g[i]) {
            //if condiTion Staisfied i As Well As Count will increase 
               i++;
           }
           j++;
       }
       return i;
   }
}
/*Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

 

Example 1:

Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1. */