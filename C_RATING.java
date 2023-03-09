// https://www.codechef.com/problems/C_RATING
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
		    int y = s.nextInt();
		    int count =0;
		    
		    if(x<y){
		        while(x<y){
		            count = count+1;
		            x=x+8;
		        }
		        System.out.println(count);
		    }else{
		        System.out.println(0);
		    }
		    
		}
	}
}
