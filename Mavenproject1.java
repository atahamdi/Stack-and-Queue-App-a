
package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.insert(12);
        q.insert(14);
        q.insert(81);
        q.insert(199);
        q.insert(12);
        q.remove();
        while(!q.isEmpty()){
            int n=q.remove();
            System.out.println("The elment of queue :  "+n);
                    System.out.println(" ");
                   
        }
        System.out.println("--------------------------------------");
        Stack s =new Stack(4);
        s.puch(45);
        s.puch(61);
        s.puch(90);
        s.puch(67);
       while(!s.isEmpty()){
           int value= s.pop();
           System.out.println("The elemntes of stack : "+value);
           System.out.println(" ");
       }
        System.out.println("");
}
}