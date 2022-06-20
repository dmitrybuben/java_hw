// Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа.

public class task2 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * (10001 - 100) + 100);
        System.out.println("Number = "+n);
        System.out.println("Number digits sum = "+num_sum(n));
        if (n % num_sum(n) == 0) {
            System.out.println("Number "+n+" divides into its digits sum without the rest");
        }
        else {
            System.out.println("Number "+n+" does not divide into its digits sum without the rest");
        }
    }
// нахождение суммы числа
    public static int num_sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
