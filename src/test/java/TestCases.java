import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(Suite.class)
class TestCases {


    @Before
    public void getReadEmp(){
        TestEmployee t1= new TestEmployee(1,"samm",83893.9);
        TestEmployee t2= new TestEmployee(2,"ramm",82929.78);
    }

    @Test
    public void toTestReverseInt(){
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        l1.add(1);l2.add(1);
        l1.add(2);l2.add(2);
        l1.add(3);l2.add(3);
        int x= new ReverseInt().reverse(1922);
        assertEquals(x,2291);
        assertFalse(22911==x);
        assertEquals(l1,l2);
     //   assertTrue(t1.);

    }


}


class TestEmployee{
    int id;
    String name;
    double sal;

    public TestEmployee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}