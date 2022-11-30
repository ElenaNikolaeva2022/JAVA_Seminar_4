package SEM_4_HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> map = new HashMap<>();
  
    public void add(String name, String number) {
      List<String> numbers;
      if (map.containsKey(name)) {
        numbers = map.get(name);
      } else {
        numbers = new ArrayList<>();
      }
      numbers.add(number);
      map.put(name, numbers);
    }
  
    public List<String> get(String name) {
      return map.get(name);
    }
  
  }
