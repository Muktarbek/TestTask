import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObj myObj = new MyObj();
        Set<MyObj> tests = new HashSet<>();
        tests.add(myObj.clone());

        System.out.println(tests.contains(myObj));
    }
}
class MyObj implements Cloneable{
    protected MyObj clone() throws CloneNotSupportedException {
        return (MyObj) super.clone();
    }
}
