/**
 * Задание
 * 
 * public static void main(String[] args) {
 *   long currentTimeMillis = System.currentTimeMillis(); // Время в милисекундах, прошедшее с 1 января 1970 года.
 *   // какая-то работа (добавляем 100_000 элементов в список)
 *   // получаем время
 *   // вычисляем разницу
 * 
 *   List<String> arrayList = new ArrayList<>();  // Выяснилось, что ArrayList работает быстрее.
 *   List<String> linkedList = new LinkedList<>();
 */

package SEM_4;

// import java.util.*;

// // Вариант 1 Задание 1
// public class Task1 {
//     public static void main(String[] args) {
//         List<Integer> list1 = new ArrayList<>();

//         long time = System.currentTimeMillis();
//         for (int i = 0; i < 100_000; i++) {   // Можно поставить 1000_000
//             list1.add(0, i);
//         }
//         System.out.println(System.currentTimeMillis() - time);

//         List<Integer> list2 = new LinkedList<>();
//         time = System.currentTimeMillis();
//         for (int i = 0; i < 100_000; i++) { // Можно поставить 1000_000
//             list2.add(0, i); // Добавлен индекс
//         }
//         System.out.println(System.currentTimeMillis() - time);
//     }
// }


// // Вариант 1 Задание 2
// public class Task1 {
//     public static void main(String[] args) {
//         Set<Integer> set1 = new HashSet<>();
//         long time = System.currentTimeMillis();
//         for (int i = 0; i < 10_000; i++) { // Можно поставить и 100_000, и 1000_000, и 10_000_000
//             set1.add(i);
//         }
//         System.out.println(System.currentTimeMillis() - time);

//         Set<Integer> set2 = new TreeSet<>();
//         time = System.currentTimeMillis();
//         for (int i = 0; i < 10_000; i++) { // Можно поставить и 100_000, и 1000_000, и 10_000_000
//             set2.add(i);
//         }
//         System.out.println(System.currentTimeMillis() - time);
//     }
// }

// Вариант 2
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis(); // Время в милисекундах, прошедшее с 1 января 1970 года.
        // какая-то работа (добавляем 100_000 элементов в список)|
        // получаем время
        // вычисляем разницу

        for (int i = 0; i < 10; i++) { // Добавляем, чтобы смотреть на среднюю разницу, а не в одном случае.
            foo(new ArrayList<>()); // ArrayList содержит массив [1, 2, 3, 4, null, null, null]
            foo(new LinkedList<>()); // LinkedList Содержит цепочку [null <-> 1 <-> 2 <-> 3 <-> 4 <-> null]
            System.out.println(); // // Добавляем, чтобы смотреть на среднюю разницу, а не в одном случае.
        }
    }

    private static void foo(List<String> list) {
        long start = System.currentTimeMillis(); // Но лучше измерять скорость кода Java, используя JMH
        for (int i = 0; i < 1_000_000; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
