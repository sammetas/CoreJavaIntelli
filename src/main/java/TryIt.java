public class TryIt {

    public static void main(String[] args) {
        TryIt t=new TryIt();
        System.out.println(t.tryMe());

    }

    private int    tryMe() {

        try{
            System.out.println("two");
            throw new ArithmeticException();
            //return 1;
        }
        catch (ArithmeticException ae){
            System.out.println("TwoAnd Half");
            return 2;
        }
        finally {
            System.out.println("Three");
            return 3;
        }
    }
}
