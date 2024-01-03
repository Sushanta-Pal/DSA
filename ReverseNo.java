public class ReverseNo {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }
    public static int reverse(int x) {
    String numberString = Integer.toString(Math.abs(x));
    StringBuilder reversedString = new StringBuilder(numberString).reverse();
    int rev = (x < 0) ? -Integer.parseInt(reversedString.toString()) : Integer.parseInt(reversedString.toString());
    return (rev > Integer.MIN_VALUE && rev < Integer.MAX_VALUE) ? rev : 0;
}



}
