public class revint {
    public static void main(String[] args) {
        int x=1534236469;
        revint a=new revint();
            System.out.println(a.reverse(x));
    }
   
    public int reverse(int x){
            int t=x;
            x=Math.abs(x);
        long ans=0;
        while (x>0) {
            int lastDigit=x%10;
            ans=10*ans+lastDigit;
            if (ans>Integer.MAX_VALUE) {
                return 0;
            }
            x/=10;

        }
        if (t<0) {
            return -(int)ans;
        }
        return (int)ans;
    }

}
