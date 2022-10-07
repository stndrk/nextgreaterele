import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                long arr[]= new long[n];
                for(int i=0;i<n;i++){
                        arr[i]= sc.nextLong();
                }
                long ans[]=new long[n];
                Stack<Long>st=new Stack<>();
                for(int i=n-1;i>=0;i--){
                        long currval=arr[i];
                        if(i==n-1){
                                ans[i]=-1;
                        }
                        else{
                                while(!st.isEmpty()&&st.peek()<=currval){
                                          st.pop();}
                                if(st.isEmpty()){
                                         ans[i]=-1;} 
                                 else{
                                          ans[i]=st.peek();}
                        }
                 st.push(currval);
                }
                        
                for(int i=0;i<n;i++){
                        System.out.print(ans[i]+" ");}
	}
}
