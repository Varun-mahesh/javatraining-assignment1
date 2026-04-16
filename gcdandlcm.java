import java.util.*;
public class gcdandlcm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("GCD: " + gcdValue);
        System.out.println("LCM: " + lcmValue);
    }
}