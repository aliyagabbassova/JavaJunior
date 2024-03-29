package Homework1;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение четных чисел: " + average);
    }
}
