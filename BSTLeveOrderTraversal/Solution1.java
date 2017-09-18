import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution1 {

    static LinkedList list = new LinkedList();

    static void levelOrder(Node root){
        //Write your code here
        if (list.add(root.data) == true) {
            if(root.left != null)  {
                list.add(root.left.data);
                levelOrder(root.left);
                System.out.println(list.poll());
            }
            if(root.right != null)  {
                list.add(root.right.data);
                levelOrder(root.right);
            }
        } 
        //System.out.println(list.poll());
        /* else {
            System.out.println("ss");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }*/

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
    }	
}

