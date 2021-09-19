import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDeep {
    public static void main(String[] args) {
        //1. convert a type of list into another type of list: List<Object> to List<Person>

List<Integer> sum=Arrays.asList(83,3,5,7,84,456);
        List<String> names= Arrays.asList("myname","your name","our name","all names");
        List<Person> persons = names.stream().map(s->{
            Person p= new Person();
            p.setName(s);
            return p;
        }).collect(Collectors.toList());

        persons.forEach(s->System.out.println(s.getName()));
        Collections.sort(persons,(a,b)->a.getName().compareTo(b.getName()));
        persons.forEach(s->System.out.println(s.getName()));
        System.out.println(persons.stream().distinct().count());
        System.out.println(sum.stream().reduce(0,(a,b)->a+b));
        System.out.println(sum.stream().reduce(0,Integer::sum));
    }


}


class Person{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
