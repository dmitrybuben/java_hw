package sem3hw;

//Задание 3.
//4 задача из дока
//https://docs.google.com/document/d/14rZuh8e2pTupzzjsG9M2QYTB09GbALYuy7dUHIz4RKA/edit
//https://habr.com/ru/post/2007
//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class task3 {
    public static void main(String[] args) {
        int Rings = 3;
        move(Rings, "Source", "Destination", "Help");
    }

    public static void move (int n, String S, String D, String H ) {
        if(n == 1) {
            System.out.println(S + " -> " + D); // если кольцо одно - сразу переносим на стержень "назначение"
        }
        else {
            move(n-1, S, H, D); // иначе - весь стек, кроме 1 самого большого кольца переносим на вспомогательный стержень
            System.out.println(S + " -> " + D); // выводим перемещение 1-го кольца на конечный стержень
            move(n-1, H, D, S); // двигаем остальной стек на конечный стержень
        }
    }
}
