/*-----Queue Uses-----
1-Print Queue.
2-Task Scheduling.
3-Data Buffering.
4-Breadth First Search(BFS).
5-Request Handling(Servers).
*/
package com.mycompany.mavenproject1;

public class Queue {
 private int []Array;
 private int maxsize;
 private int front;
 private int rear;
 private int nItems;
 public Queue(int max){
  maxsize=max;
  Array =new int [max];
  front=0;
  rear=-1;
  nItems=0;
 }
 public void insert(int x){
     if(rear==maxsize-1)
         rear=-1;
     Array[++rear]=x;
     nItems++;
 }
 public int remove(){
     int temp=Array[front++];
     if(front==maxsize)
         front=0;
     nItems--;
     return temp;
 }
 public int peak(){
     return Array[front];
 }
 public boolean isfull(){
     return(nItems==maxsize);
 }
 public boolean isEmpty(){
     return(nItems==0);
     
 }
 public int size(){
     return nItems;
 }
}
