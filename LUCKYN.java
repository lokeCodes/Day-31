// https://www.codechef.com/problems/LUCKYN
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int count=0;
		    
		    while(x>0){
		      int rem=x%10;
		      int temp =rem;
		        if(temp==7){
		        count = count+1;
		        break;
		        }
		      x=x/10;
		      }

		    if(count==0){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
}
