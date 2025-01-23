package dsa;
import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}
public class BinaryTree {
    static Node root=null;
    static Scanner sc=new Scanner(System.in);
    static void populate(){
        System.out.println("Enter The Root Value:");
        root=new Node(sc.nextInt());
        populate(root);
    }
    static void populate(Node node){
        System.out.println("Enter 1 for Insert the left value of "+node.data+" otherwise enter 0:");
        if(sc.nextInt()==1){
            System.out.println("Enter The left Value of "+node.data);
            node.left=new Node(sc.nextInt());
            populate(node.left);
        }
        System.out.println("Enter 1 for Insert the right value of "+node.data+" otherwise enter 0:");
        if(sc.nextInt()==1){
            System.out.println("Enter The right value of "+node.data);
            node.right=new Node(sc.nextInt());
            populate(node.right);

        }
    }
    static void display(){
        display(root,0);
    }
    static void display(Node node,int level){
        if(node==null){
            return;
        }
        display(node.right,level+1);
        if(level!=0){
            for(int i=1;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.data);
        }
        else{
            System.out.println(node.data);
        }
        display(node.left,level+1);
    }
    public static void main(String[] args) {
        populate();
        System.out.println("The Tree is :");
        display();
    }
}
