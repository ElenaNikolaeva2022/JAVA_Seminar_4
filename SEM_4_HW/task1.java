// Stack [a, b, c, d] LIFO Last In First Out
// Queue [a, b, c, d] FIFO First In First Out
/**
 * 0.1) Написать метод, который принимает массив элементов, 
 * помещает их в стэк и выводит на консоль содержимое стэка.
 * 0.2) Написать метод, который принимает массив элементов, 
 * помещает их в очередь и выводит на консоль содержимое очереди.
 */

package SEM_4_HW;

import java.util.*;

public class task1 {
  public static void main(String[] args) {
    String[] array = { "1", "v", "abcdef", "15", "user" };
    Stack<String> array2 = new Stack<>();
    Queue<String> array3 = new LinkedList<>();

    for (int i = 0; i < array.length; i++) {
      array2.add(array[i]);
    }

    for (int i = 0; i < array.length; i++) {
      array3.add(array[i]);
    }

    System.out.println(array2);
    System.out.println(array3);
  }
}