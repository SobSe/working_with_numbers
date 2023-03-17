import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (element <= 0 ) continue;
            if (element % 2 != 0) continue;
            result.add(element);
        }
        Collections.sort(result);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
