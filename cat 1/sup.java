import java.util.*;
import java.util.stream.*;

public class sup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        List<String> result = generatePermutations(input);
        result.forEach(System.out::println);
    }

    private static List<String> generatePermutations(String input) {
        return Arrays.stream(input.split(""))
                     .sorted()
                     .distinct()
                     .collect(Collectors.toList());
    }
}
