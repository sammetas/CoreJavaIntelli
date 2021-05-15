import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadABCFileStreamOps {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> map=new HashMap<>();
//1.find longest string
        System.out.println(  Files.readAllLines(Path.of("D:\\MicroWorkSpace\\CoreJavaIntelli\\src\\main\\java\\abc.txt"))
              .stream()
             // .collect(Collectors.toList())
            //  .stream()
              .reduce( (s1, s2) ->{
                  if(s1.length()>s2.length()) return  s1; else return  s2;
              } ).get()


        );
//2. put all strings in map with their lengths from a file
        Map<String,Integer> map1 =Files.readAllLines(Path.of("D:\\MicroWorkSpace\\CoreJavaIntelli\\src\\main\\java\\abc.txt"))
                .stream()
                .collect(Collectors.toMap(String::valueOf,String::length)) ;

        System.out.println(map1);
    }
}
