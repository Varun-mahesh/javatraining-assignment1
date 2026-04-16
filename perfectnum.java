public class perfectnum {
    public static void main(String[] args) {
        int num = 28, sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
    
}

