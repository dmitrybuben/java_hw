// Написать программу вычисления n-ого треугольного числа.
public class task1 {
        public static void main(String... args) {
            int n = (int) (Math.random() * (11-1) + 1);
            int tn = (n*(n+1))/2;
            System.out.println("Triangle number for n = " + n + " is " + tn);
        }
    }
