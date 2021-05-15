import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Consumer;

public class Hashes1 {
    public static void main(String[] args) {
      //  String tobeHashed="abcde"; //YWJjZGU=
        String tobeHashed="ABCDIEUIEURIEUR93U9UFEFJDKFMDKMFKDMFKDMFKDMED";  //QUJDREVE
        //String str=new String(tobeHashed.hashCode());
     //   byte[] encoded=Base64.getEncoder().encode( );
      //  System.out.println(new String(encoded));

        HashMap<A1,Integer> amap= new HashMap<>();
        amap.put(new A1("abc"),1);
        amap.put(new A1("xyz"),2);
        amap.put(new A1("abc"),3);
        System.out.println(amap);
        System.out.println(amap.get(new A1("abc")));

        Consumer<String> consumer=a->System.out.println(a);
       //  amap.forEach(entry-> entry.getName());

    }
}

class A1{
    private String name;

protected A1(String name){
    this.name=name;
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        A1 a1=(A1)o;
        return this.name.equals(a1.name);
    }

    @Override
    public int hashCode() {
        return 123;
    }
}

