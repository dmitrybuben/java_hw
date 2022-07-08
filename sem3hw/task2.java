package sem3hw;
// Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните) и при помощи конструкции
// try-catch рекурсивно принимайте данные (нужно ограничить колиичество попыток до 6 и после 3 попытки должно быть сообщение,
// мол вы привысили количество попыток, немного пододождите //тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)

import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        inputLog();
        inputPass();
    }

    public static void inputLog() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Login: ");
            String lCheck = sc.nextLine();
            String login = "admin";
            if (lCheck.equals(login)) {
                System.out.println("Login is ok");
            } else {
                throw new IOException("Login doesn't exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            inputLog();
        }
    }

    public static void inputPass(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Password: ");
            String pCheck = sc.nextLine();
            String pass = "12345";
            if(pCheck.equals(pass)){
                System.out.println("Pass is ok, you are in");
            }else{
                throw new IOException("Pass is wrong");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            inputPass();
        }
    }
}
