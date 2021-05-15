import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
have an array of maps and get output of Map<Long,Long> from the maps.
Each map<String,UserStats> then convert this string key to Long and userStats have one Optional<Long> and get the count

 */
public class BackBase1 {
    public static void main(String[] args) {
        Optional<Long> opt1 = Optional.of(10L);
        Optional<Long> opt2 = Optional.of(12L);
        Optional<Long> opt3 = Optional.of(14L);
          UserStats u1= new UserStats();
        UserStats u2= new UserStats();
        UserStats u3= new UserStats();
        u1.setVists(opt1);
        u2.setVists(opt2);
        u3.setVists(opt3);

        HashMap<String,UserStats> m1=new HashMap<>();
        HashMap<String,UserStats> m2=new HashMap<>();
        HashMap<String,UserStats> m3=new HashMap<>();
        HashMap<String,UserStats> m4=new HashMap<>();
        HashMap<String,UserStats> m5=new HashMap<>();
         m1.put("1",u1);m2.put("2",u2);m3.put("3",u3);

         Map<Long,Long> l0= callMethod(m1,m2,m3);
        Map<Long,Long> l1= callMethod(m4,m5);

    }

    private static Map<Long, Long> callMethod(HashMap<String,UserStats> ... visits) {
         Map<Long,Long> map1= new HashMap<>();
        List<HashMap<String,UserStats>> list=new ArrayList<>();
        Arrays.stream(visits).forEach(list::add);
        System.out.println(list);

            

        return  map1;
    }
}


class UserStats{
    Optional<Long> vists;

    public Optional<Long> getVists() {
        return vists;
    }

    public void setVists(Optional<Long> vists) {
        this.vists = vists;
    }
}
