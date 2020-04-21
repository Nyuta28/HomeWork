package HomeWork10;
import java.util.HashSet;
import java.util.Set;

public class EqualsTest {
    public static void main(String[] args) {
        IdList id1 = new IdList();
        IdList id2 = new IdList();

        id1.setId(12);
        id2.setId(12);
        System.out.println(id1.equals(id2));

        Set id = new HashSet();
        id.add(id1);
        id.add(id2);

        System.out.println(id);
    }
}
