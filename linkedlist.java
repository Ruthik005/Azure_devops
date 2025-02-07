import java.util.*;
  class node{
      int data;
      node next;
      node(int x)
      {
          data=x;
          next=null;
      }
}
public class Main{
    public static void main(String[] args){
       node temp1=new node(10);
       node temp2=new node(20);
       node temp3=new node(30);
       node temp4=new node(40);
       node temp5=new node(50);
       temp1.next=temp2;
      temp2.next=temp3;
    temp3.next=temp4;
        temp4.next=temp5;
        node head=temp1;
        int sum=0;
        while(head!=null)
        {
            System.out.print(head.data+"\n");
            sum+=head.data;
            head=head.next;
        }
       System.out.print(sum);
       
    }
}
