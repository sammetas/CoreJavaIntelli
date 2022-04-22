import com.samm.lru.LRUAlgo;
import com.samm.lru.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class LRUAlgoTestCases {
    private LRUAlgo lruAlgo;
 @Before
 public void init(){
     lruAlgo=new LRUAlgo();


 }

   @Test
   public void addNode(){
       com.samm.lru.Data data1=new  com.samm.lru.Data(1,"name1",101.01);
       com.samm.lru.Data data2=new  com.samm.lru.Data(2,"name2",102.01);
       com.samm.lru.Data data3=new  com.samm.lru.Data(3,"name3",103.01);
       com.samm.lru.Data data4=new  com.samm.lru.Data(4,"name4",104.01);
       com.samm.lru.Data data5=new  com.samm.lru.Data(5,"name5",105.01);
       com.samm.lru.Data data6=new  com.samm.lru.Data(6,"name6",106.01);

     lruAlgo.addNode(data1);  lruAlgo.addNode(data2);  lruAlgo.addNode(data3);  lruAlgo.addNode(data4);  lruAlgo.addNode(data5)  ;
     lruAlgo.addNode(data6);

    // lruAlgo.iterateNodes(lruAlgo.getHead());
     //  System.out.println("=============");
     lruAlgo.iterateNodesReverse(lruAlgo.getTail());

   }

}
