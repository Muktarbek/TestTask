import java.util.*;

public class Task {
    public static void main(String[] args) {
        String s = "такси бокс ансамбль болото тарелка балласт";
        List<String> words = new ArrayList<>(List.of(s.split(" ")));
        Map<Character,List<String>> map = grouping(words);

        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    private static Map<Character,List<String>> grouping(List<String> list){
        Map<Character, List<String>> response = new HashMap<>();
        List<String> words = new ArrayList<>();

        for (String w : list) {
            Character ch = w.charAt(0);
            for (String word : list) {
                if (word.charAt(0) == w.charAt(0)) {
                    words.add(word);
                }
            }
            if(words.size()>1){
                Comparator<String> comparator = (s1,s2) -> Integer.compare(s2.length(), s1.length());
                words.sort(comparator);
                response.put(ch,words);
            }
            words = new ArrayList<>();
        }

        return response;
    }
}

