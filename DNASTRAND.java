// https://www.codechef.com/problems/DNASTRAND
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
		while(t-- > 0) {
			int n = s.nextInt();
			String dna = s.next();
			char arr[] = new char[n];
			for(int i=0;i<n;i++) {
				if(dna.charAt(i)=='T') {
					arr[i]='A';
				}else if(dna.charAt(i)=='A') {
					arr[i]='T';
				}else if(dna.charAt(i)=='G') {
					arr[i]='C';
				}else {
					arr[i]='G';
				}
			}
			
			System.out.println(arr);
		}
	}
}
