/**
 * 1 Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список. 
 */

package SEM_4_HW;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        String[] array = {"1", "v", "abcdef", "15", "user"};
        LinkedList<String> array1 = new LinkedList<>();
        for(int i = array.length-1; i >=0; i--){
            array1.add(array[i]);
        }
        System.out.println(array1);
    }
}