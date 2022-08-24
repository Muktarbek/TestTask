import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        MyObj myObj = new MyObj();
        Set<MyObj> tests = new HashSet<>();
        tests.add(myObj);

        System.out.println(tests.contains(myObj));
    }
}
