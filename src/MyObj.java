import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class MyObj {
     private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObj myObj = (MyObj) o;
        return id == myObj.id;
    }

    @Override
    public int hashCode() {
        long time = System.nanoTime();
        return (int)time;
    }
}
