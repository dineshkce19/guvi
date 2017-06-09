import java.util.*;
public class Solution{
  	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long num=sc.nextLong();
    String res="";
    if(num<0)
      res="negative";
    else if(num==0)
      res="zero";
    else
      res="positive";
    System.out.println(res);
  }
}
