package setsAndMaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(
                        Comparator.reverseOrder()   //(left, right) -> right.compareTo(left)
                ).limit(3)
                .forEach(num -> System.out.printf("%d ", num));

    }
}
