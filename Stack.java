/*------Stack Uses------:
1-Function Calls.
2-Balanced Parentheses Checking.
3-Expression Conversion.
4-Depth First Search(DFS).
5-Undo/Redo Operations.
*/
package com.mycompany.mavenproject1;

public class Stack {
  private int maxsize;
private int []arr;
private int top;
public Stack(int max){
    maxsize=max;
    arr=new int[max];
    top=-1;
}
public void puch(int j){
    arr[++top]=j;
}
public int pop(){
    return arr[top--];
}
public int peak(){
    return arr[top];
}
public boolean isEmpty(){
    return (top==-1);
}
public boolean isfull(){
    return (top==maxsize-1);
}

}
