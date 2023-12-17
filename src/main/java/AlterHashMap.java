import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class AlterHashMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(); e1.setId(10);e1.setName("3abc");
        Employee e2 = new Employee(); e2.setId(101);e2.setName("2abc");
        Employee e3 = new Employee(); e3.setId(110);e3.setName("1abc");
        HashMap<Employee,Employee> map = new HashMap<>();

        map.put(e1,e1);
        map.put(e2,e2);
        map.put(e3,e3);
        System.out.println(map.get(e1).name);
        System.out.println(map.get(e2).name);
        System.out.println(map.get(e3).name);

    }
}


class Employee{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
       return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}