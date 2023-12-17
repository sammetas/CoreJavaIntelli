package stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
/*
  1. remove aeiou 's from the each string and grup by lengt of remining chars and list
  2.to group by names of persons and list of their addresses.
 */
public class GroupingBy {
    public static void main(String[] args) {
        List<String> names = List.of("abc","pqr","xyz","abc","iop","oops","oBJ","obj","obj"); //9
       // System.out.println(names.stream().limit(2).map(null).sorted(null).dropWhile(null).count());
        Map<Integer, List<String>> nameMap = names.stream().map(s -> s.replaceAll("a", "")
                        .replaceAll("e", "")
                        .replaceAll("i", "")
                        .replaceAll("o", "")
                        .replaceAll("u", ""))
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));

        System.out.println(nameMap);

        List<Person> persons = List.of(new Person("abc",10,new Address(1,10400)),
                new Person("xyz",20,new Address(2,10500)),
                new Person("abc",11,new Address(3,10600)),
                new Person("xyz",35,new Address(4,521001)),
                new Person("obj",90,new Address(5,453344)),
                new Person("Obj",98,new Address(15,10400)));
        Map<String, List<Address>> filteredPersons = persons.stream().filter(person -> !Objects.isNull(person))
                .collect(Collectors.groupingBy(Person::name, Collectors.mapping(Person::address, Collectors.toList())));
        System.out.println(filteredPersons);

        Map<String, List<Person>> output = persons.stream()
                .collect(Collectors.groupingBy(person -> person.age() % 2 == 0 ? "a": "b"));
        System.out.println("abab\n"+output);

    }
}




record Person(String name,int age,Address address){

}

record Address(int dno,int pin){}