package setsAndMaps;
import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            elements.addAll(Arrays.asList(input));

        }

        elements.forEach(element -> System.out.print(element + " "));
    }
}

