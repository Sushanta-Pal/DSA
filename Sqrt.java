public class Sqrt {
   public static void main(String[] args) {
    int n=10;
    System.out.println(mySqrt(n));
   } 
   public static int mySqrt(int x) {
    if(x<2){
        return x;
    }
    int l=1;
    int r=x;
    
   while (l<=r) {
    int mid =(r+l)/2;
    if (mid*mid==x) {
        return mid;
    }else if (mid*mid<x) {
        l=mid+1;
    }else 
    r=mid-1;
   }
   return r;
   }
}
