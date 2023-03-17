import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> result = new TreeSet<>();
        for (Integer element : list) {
            if (element <= 0 ) continue;
            if (element % 2 != 0) continue;
            result.add(element);
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
