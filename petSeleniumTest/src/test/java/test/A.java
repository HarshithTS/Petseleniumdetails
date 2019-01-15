package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string which has digits");
		int charCount=0,digitCount=0;
		String s = sc.next();
		List li = new ArrayList();
		char[] a = {'1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<a.length;i++){
			li.add(a[i]);
		}
		
		char ch[] = s.toCharArray();
		for(int j=0;j<ch.length;j++){
			if(li.contains(ch[j])){
				digitCount++;
			}
			else {
				charCount++;
			}
		}
		System.out.println("no of digits in the string are:"+digitCount);
		System.out.println("no of characters in the string are:"+charCount);
		sc.close();
		
	}
}
