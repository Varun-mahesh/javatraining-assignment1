public class StrongNumber{
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }

    static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }
}