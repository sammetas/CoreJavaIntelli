import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRevisited {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(new String[]{"apple", "banana", "cherry", "pine apple", "peach"});

        List<String> newList = list.stream().filter(s -> s.contains("apple")).collect(Collectors.toList());
        System.out.println(newList);

        //part 2
        Sample s1= new Sample(1,"apple");
        Sample s2= new Sample(2,"banana");
        Sample s3= new Sample(3,"passion");
        Sample s4= new Sample(4,"pingapple");
        List<Sample> listS = Arrays.asList(s1,s2,s3,s4);

        List<String> newSamList= listS.stream().filter(s->s.getName().contains("apple")).map(s->s.getName()).collect(Collectors.toList());
        System.out.println("Mapped strings"+newSamList);

        //remove peach..
        List<String> list2 = Arrays.asList(new String[]{"apple", "banana", "cherry", "pine apple", "peach"});

        List<String> newList2=list2.stream().filter(s->
            !s.equals("banana")


        ).collect(Collectors.toList());
        System.out.println(newList2);
    }
}


class Sample{

    String name;
    int no;

    public Sample(int no,String name) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}