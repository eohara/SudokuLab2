package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {

	
@Test
	
	public void getRegion_test1() throws Exception {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8},
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9},
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		
		System.out.println(Arrays.toString(puzzle.getRegion(0)));
	
	}


	@Test

	public void getRegion_test2() throws Exception {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8},
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9},
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
				

		System.out.println(Arrays.toString(puzzle.getRegion(4)));
	
	}
	@Test
	
	public void getRegion_test3() throws Exception {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8},
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9},
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		System.out.println(Arrays.toString(puzzle.getRegion(8)));
	
	}
	@Test
	
	public void getRegioncrinput_test1() throws Exception  {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8},
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9},
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		System.out.println(Arrays.toString(puzzle.getRegion(4,3)));
	
	}
	@Test
	
	public void getRegioncrinput_test2() throws Exception {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		System.out.println(Arrays.toString(puzzle.getRegion(6,7)));
	
	}
	@Test
	
	public void getRegioncrinput_test3() throws Exception {
		
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		System.out.println(Arrays.toString(puzzle.getRegion(6,4)));
		
	
	}
	@Test
	
	public void isValidValue_test1() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,1,0,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
	 						{6,5,2,7,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		boolean tester = puzzle.isValueValid(4,3,3);
	
		assertTrue(tester);

	}
	@Test
	
	public void isValidValue_test2() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,0,0,4,0,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,0,6,3},
	 						{6,5,2,0,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		boolean tester = puzzle.isValueValid(3,3,7);
	
		assertFalse(tester);

	}

	
	@Test
	
	public void isValidValue_test3() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,0,0,4,0,8,2},
							{1,2,0,6,7,8,0,4,9}, 
							{7,4,8,4,2,9,0,6,3},
	 						{6,5,2,0,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		boolean tester = puzzle.isValueValid(6,4,3);
	
		assertFalse(tester);

	}
	@Test
	
	public void isValidValue_test4() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
				 			{5,6,9,0,0,4,0,8,2},
							{1,2,0,6,7,8,0,4,9}, 
							{7,4,8,4,2,9,0,6,3},
	 						{6,5,2,0,8,1,3,9,4},
	 						{9,8,1,3,4,5,2,7,6},
	 						{3,7,4,9,6,2,8,1,5}};
		
		Sudoku puzzle = new Sudoku(myPuzzle);
		
		boolean tester = puzzle.isValueValid(6,4,2);
	
		assertFalse(tester);

	} 
		
	
	@Test
	public void isPartialSudoku_Test1() throws Exception
{
	
		int[][] myPuzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
							 { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
							 { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
							 { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
							 { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
							 { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
							 { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
							 { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
							 { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		Sudoku s1 = new Sudoku(myPuzzle);
		
		boolean tester = s1.isPartialSudoku();
		
		assertFalse(tester);
	

	
	
}
	@Test
	public void isPartialSudoku_Test2() throws Exception
{
	
	int[][] myPuzzle =   { { 0, 3, 4, 6, 7, 8, 9, 1, 2 }, 
						   { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
						   { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
						   { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
						   { 4, 2, 6, 0, 5, 3, 7, 9, 1 }, 
						   { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
						   { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
						   { 2, 8, 7, 4, 1, 0, 6, 3, 0 }, 
						   { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		Sudoku s1 = new Sudoku(myPuzzle);
		boolean tester = s1.isPartialSudoku();
		
		assertTrue(tester);

}
	
	@Test

	public void isSudoku_test1() throws Exception  {
	
	
		int[][] myPuzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
					   		 { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
					   		 { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
					   		 { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
					   		 { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
					   		 { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
					   		 { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
					   		 { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
					   		 { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		Sudoku s1 = new Sudoku(myPuzzle);
	
		assertTrue(s1.isSudoku());

}
	@Test

	public void isSudoku_test2() throws Exception  {
	
	
	int[][] myPuzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
						 { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
						 { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
						 { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
						 { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
						 { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
						 { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
						 { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
						 { 3, 4, 5, 2, 8, 6, 1, 7, 0 } };

	
		Sudoku s1 = new Sudoku(myPuzzle);
	
		assertFalse(s1.isSudoku());

}
	@Test

	public void isSudoku_test3() throws Exception  {
	
	
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
							{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
							{6,5,2,7,8,1,3,9,4},
							{9,8,1,3,4,5,2,7,6},
							{3,7,4,9,6,2,8,1,5}};

		
		Sudoku s1 = new Sudoku(myPuzzle);
	
		assertTrue(s1.isSudoku());
		
		}}



	
	



	


