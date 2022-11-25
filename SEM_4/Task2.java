/**
* Реализовать консольное приложение, которое:
* Принимает от пользавателя и "запоминает" строки.
* Если введено print, выводит строки так, чтобы последняя 
* введенная была первой в списке, а первая - последней. 
* Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

// >>hello 
// >>world,
// >>java
// >>print
// <<[print, java, world,, hello]
// >>revert
// <<print
// >>print
// <<[java, world,, hello]

package SEM_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String word = "";
        while (!Objects.equals(word, "end")) {
            word = scanner.nextLine();
            if (Objects.equals(word, "print")) {
                System.out.println(list);
            } else if (Objects.equals(word, "revert")) {
                if (list.size() != 0) {
                    list.remove(0);
                }
            } else
                list.add(0, word);
        }
    }
}

/**
 * в Терминале пример с цифрами:
 * 1 (вводим сами) Enter
 * 2 (вводим сами) Enter
 * 3 (вводим сами) Enter
 * print (вводим сами) Enter
 * [3, 2, 1] (получаем)
 * revert (вводим сами) Enter
 * print (вводим сами) Enter
 * [2, 1] (получаем)
 * end (вводим сами) Enter (конец работы  )
 */
