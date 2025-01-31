package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;


public class Sorting {
    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Hachi", 6);
        students.put("Rex", 4);
        students.put("Aira", 6);
        students.put("Mechi", 3);

        students.values().stream().forEach(System.out::println);
        System.out.println();
        students.keySet().stream().forEach(System.out::println);
        System.out.println();
        students.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println();
        students.entrySet()
                .stream()
                .sorted(
                        (left, right) -> {
                            int result = right.getValue().compareTo(left.getValue());
                            if (result == 0) {
                                result = left.getKey().compareTo(right.getKey());
                            }
                            return result;
                        }
                )
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
