import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class ShortJavaString {
    public static void main(String[] args) {

        for(int ii=0;ii<5000;ii++) {
            Set<String> s = new HashSet<>();
            for (int i = 0; i < 10000; i++) {
                String rand = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
                s.add(rand);
            }
            System.out.println(s.size());
        }
    }
}
