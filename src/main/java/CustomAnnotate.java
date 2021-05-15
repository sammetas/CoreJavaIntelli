import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotate {
    public static void main(String[] args) {
        Myown a= new Myown();
        a.meth();

    }
}



@interface MyAnnotation{

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation1{

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonSerializable {
    public String key() default "hello";
}



class Myown{

    @JsonSerializable(key="hello")
    String name;

    public void meth(){
        System.out.println(name);
    }
}

interface  Myone{
    void method();
    static  void method2(){
        System.out.println("this is statis methid");
    }
    default void method3(){
        System.out.println("This is default method..");
    }

}


class MyCls implements Myone{

    @Override
    public void method() {

    }

    @Override
    public void method3() {

    }
}