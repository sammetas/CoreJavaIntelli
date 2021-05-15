import java.util.LinkedHashMap;

public class BinaryTreeOps {
    static  Node root;
    public static void main(String[] args) {

          root= addRecord(43,root);
//43, 10, 79, 90, 12, 54, 11, 9, 50
        //

        addRecord(10,root);
        addRecord(79,root);
        addRecord(90,root);
        addRecord(12,root);
        addRecord(54,root);
        addRecord(11,root);
        addRecord(9,root);
        addRecord(50,root);

        preOrderTraverse(root);
        System.out.println("-->"+root.left.left.data+"  and " +root.right.left.data);
    }

    public static  Node addRecord(int x,Node root){

        if(root==null){
           return   new Node(x);
         }
        if(x<root.data){
        root.left=  addRecord(x,root.left);
        }else  if(x>root.data){
         root.right=  addRecord(x,root.right);
        }
        return  root;
    }

    public  static  void preOrderTraverse(Node root){ //root left right
        if (root==null) return;

        System.out.print(root.data+" , ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);

    }
}



class Node{
    int data;
    Node left;
    Node right;


    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }

}

