package sem4hw;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Tasks> tasks = new ArrayList<>();
        Tasks passport = new Passport();
        Tasks inn = new Inn();
        Tasks snils = new Snils();
        Tasks spravka = new Spravka();
        Tasks vypiska = new Vypiska();
        Tasks registration = new Registration();
        tasks.add(passport);
        tasks.add(inn);
        tasks.add(snils);
        tasks.add(spravka);
        tasks.add(vypiska);
        tasks.add(registration);
        System.out.println("Tasks description: " + '\n' + tasks);
        System.out.println("_____________________________________________");

        Integer[] ind = new Integer[tasks.size()];   // формирование очереди
        for (int i = 0; i < ind.length; i++) ind[i] = i * 1;
        List<Integer> indexes = Arrays.asList(ind);
        Collections.shuffle(indexes);
        System.out.println("Shuffled tasks indexes: " + indexes);

        Queue<Tasks> q = new LinkedList<>();
        for (int i = 0; i < indexes.size() - 1; i = i + 2) {      // сравниваем пары
            if (tasks.get(indexes.get(i)).priority() > tasks.get(indexes.get(i + 1)).priority()) {
                q.add(tasks.get(indexes.get(i)));
                q.add(tasks.get(indexes.get(i + 1)));
            } else {
                q.add(tasks.get(indexes.get(i + 1)));
                q.add(tasks.get(indexes.get(i)));
            }
        }
        System.out.println("Sorted line: " + q);

        Iterator<Tasks> it = q.iterator();  // обход очереди с паузой между заданиями, пока не опустеет
        while (it.hasNext()) {
            System.out.print("Present turn is: " + it.next());
            it.remove();
            sleep(5000);
        }
        System.out.println("The line is empty: " + q);
    }
}