import java.util.*;
import java.util.stream.Collectors;

public class Lab9 {


    public static void Lab9() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            int num = rand.nextInt(5,25);
            numbers.add(num);
        }

        System.out.println(numbers);

        System.out.println("sum: " + numbers.stream().mapToInt(n -> n).sum());


        System.out.println("max: " + numbers.stream().max((o1, o2) -> o1 > o2?1:-1).get());

        System.out.println("min: " + numbers.stream().min((o1, o2) -> o1 > o2?1:-1).get());

        numbers = (ArrayList<Integer>) numbers.stream().filter(n -> {
            if(n > 10 && n < 20) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.println("Filtering Between 10 and 20: " + numbers);

        ArrayList<Double> doubleNumbers = numbers.stream()
                .map(n -> (double)n)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("double: " + doubleNumbers);

        //System.out.println(numbers.stream().reduce(n -> n == 12 ? 1 : -1);
        System.out.println("Value 12 is found in the list: " + numbers.stream().anyMatch(n -> n == 12));

        // 9.3.2

        List<Integer> array1 = new ArrayList<>(Arrays.asList(9, 10, 3, 4, 7, 3, 4));
        Set<Integer> array2 = new HashSet<>();

        for(int i = 0; i < array1.size(); i++) {
            array2.add(array1.get(i) * array1.get(i));
        }

        System.out.println("squares: " + array2);


        // 9.3.3

        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> words = Arrays.asList(text.split(" "));
        List<String> words5 = new ArrayList<>();

        for(String word: words) {
            if(word.length() >= 5) {
                words5.add(word);
            }
        }

        words5.sort(Comparator.naturalOrder());

        System.out.println("Sorted words: " + words5);

        System.out.println("Element that start with \"p\": " + words5.stream()
                .filter(w -> w.toLowerCase().startsWith("p"))
                .findFirst());
    }
}
