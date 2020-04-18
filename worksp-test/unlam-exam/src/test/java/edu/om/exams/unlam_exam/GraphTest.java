package edu.om.exams.unlam_exam;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

public class GraphTest {

//	@Test
//	public void testMinimumSwaps() {
//		int[] array = {4, 3, 1, 2 };
//		int minimum = Graph.minimumSwaps(array);
//		assertEquals(3, minimum);
//	}
//
//	@Test
//	public void testMinimumSwapsSimple3() {
//		int[] array = {4, 3, 1, 2 };
//		int minimum = Graph.minimumSwapsSimple(array);
//		assertEquals(3, minimum);
//	}
//	
//	@Test
//	public void testMinimumSwapsSimple2() {
//		int[] array = {1, 5, 4, 3, 2};
//		int minimum = Graph.minimumSwapsSimple(array);
//		assertEquals(2, minimum);
//	}
//
//	@Test
//	public void testMinimumSwapsSimple1() {
//		int[] array = {2, 1};
//		int minimum = Graph.minimumSwapsSimple(array);
//		assertEquals(1, minimum);
//	}
//	
//	@Test
//	public void testMinimumSwapsSimple5() {
//		int[] array = {7, 1, 3, 2, 4, 5, 6};
//		int minimum = Graph.minimumSwapsSimple(array);
//		assertEquals(5, minimum);
//	}
//	
//	@Test
//	public void applyfloydWarshall() {
//		int INF = Integer.MAX_VALUE;
//		Integer[][] weights = {{0,4,8,null,null},{4,0,1,2,null},{8,null,0,4,2},{null,2,4,0,7},{null,null,2,7,0}};
////		Integer[][] weights = {{0,5,INF,10},{INF,0,3,INF},{INF,INF,0,1},{INF,INF,INF,0}};
////		Integer[][] weights = {{0,1},{1,0}};
//		Map<String, Integer[][]> result = Graph.applyfloydWarshall(weights);
//		
//		Integer[][] dis = result.get("distances") ;
//		
//		for(Integer[] row: dis) {
//			for(Integer cell: row) {
//				if(cell == null) {
//					System.out.print("INF, ");
//				}else {
//					System.out.print(cell +", ");
//				}
//			}
//			System.out.println("");
//		}
//		
//		Integer[][] paths = result.get("paths") ;
//		
//		for(Integer[] row: paths) {
//			System.out.println(Arrays.toString(row));;
//		}
//	}
	
	@Test
	public void applyDikjstran() {
		Integer[][] weights = {{0,4,8},{4,0,1},{8,1,0}};
		Integer[] costs = Graph.applyDikjstran(2, weights);
		System.out.println(Arrays.toString(costs));
	}
	
}
