import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AfterLambda {
    public static void main(String[] args) {
int am=10;
int pm=20;


        LambSumInter inn = (a,b)->{
            return a+b;
        };
        System.out.println(inn.absMeth(am,pm));
        // similarly we have existing functional interfaces

        Predicate<Integer> EVEN=(a)->a%2==0;
        Predicate<Integer>  ODD=(a)->a%2!=0;
        Predicate<Integer> PRIME = (a) ->{
            for(int i = 2; i<=Math.sqrt(a);i++){
                if(a%i == 0) return false;
            }
            return true;
        };


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,13,25,49,37,8,9,9,28364,4,6);
        LinkedHashMap<Integer,Integer> anewList =  list.stream().filter(ODD).filter(PRIME).collect(Collectors.toMap(x->x,x->x*2,(k,v)-> k+v,LinkedHashMap::new));


        System.out.println(anewList);
    }
}


@FunctionalInterface
interface  LambSumInter{
    int absMeth(int x,int y);
    default void meth(){
        System.out.println("Hello..");
    }
}