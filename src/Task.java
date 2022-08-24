import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        String s = "такси бокс ансамбль болото тарелка балласт";
        System.out.println(grouping(s));
    }

    private static Map<Character,List<String>> grouping(String s){
        List<String> words = new ArrayList<>(List.of(s.split(" ")));
        Map<Character, List<String>> response = words.stream()
                .sorted((s1, s2) -> {
                    if (s1.charAt(0) == s2.charAt(0)) {
                        return s2.length() - s1.length();
                    } else {
                        return s1.compareTo(s2);
                    }
                }).collect(Collectors.groupingBy(s1 ->
                        s1.charAt(0)
                )).entrySet().stream()
                .filter(m -> m.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return response;
    }
}

