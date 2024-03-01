import java.util.Scanner;

public class stringParce {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        int num = 0;
        int len = str.length() - 1;
        if (str.charAt(0) == '-'){
            for (int i = len, n = 1; i >= n; i--) {
                char ch = str.charAt(i);
                num += (int) (Character.digit(ch, 10) * Math.pow(10, len - i));
            }
            num *= -1;
        }
        else{
            for (int i = len, n = 0; i >= n; i--) {
                char ch = str.charAt(i);
                num += (int) (Character.digit(ch, 10) * Math.pow(10, len - i));
            }
        }
        System.out.println(num);
    }
}
