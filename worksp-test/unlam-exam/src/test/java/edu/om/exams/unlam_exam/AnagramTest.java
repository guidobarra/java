package edu.om.exams.unlam_exam;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramTest {

	@Test
	public void testCountMinimumForBeAnagram() {
		assertEquals(0, Anagram.countMinimumForBeAnagram("omar", "omar"));
	}
	
	@Test
	public void testCountMinimumForBeAnagram2() {
		assertEquals(2, Anagram.countMinimumForBeAnagram("omarBA", "omar"));
	}
	
	@Test
	public void testCountMinimumForBeAnagram12() {
		int d = Anagram.countMinimumForBeAnagram("baacbacabbomarx", "acb");
		assertEquals(12, Anagram.countMinimumForBeAnagram("baacbacabbomarx", "acb"));
	}

	@Test
	public void testMAp() {
		System.out.println(Anagram.getAmountRepetedLetters("I dont know how many letters there are here"));
	}
	
	@Test
	public void testMAsdsfp() {
		int[] ar = {3,1,2,4};
//		System.out.println(minimumSwaps(ar));
		mainsdf();
	}
	
	public static void mainsdf () {
		List lis = new ArrayList();
		int[] a = {1, 2, 3};
		lis.add(a);
		int[] b = {1, 2, 3};
		lis.add(b);
		int[] e = (int[])lis.get(0);
		System.out.println(e[0]);
		
	}
	
	static int minimumSwaps(int[] arr) {
		int swap=0;
		boolean visited[]=new boolean[arr.length];

		for(int i=0;i<arr.length;i++){
			int j=i, sizeCycle=0;

			while(!visited[j]){
				visited[j]=true;
				j=arr[j]-1;
				sizeCycle++;
			}
			
			System.out.println(sizeCycle);
			if(sizeCycle!=0)
				swap+=sizeCycle-1;
		}
		
		return swap;
	}
	
}
