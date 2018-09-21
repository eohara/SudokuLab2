package pkgHelper;

import java.util.Arrays;

import pkgHelper.LatinSquare;

import java.lang.Math;


public class Sudoku extends LatinSquare {
	
	private int iSize;
	private int iSqrtSize;
	
	// is it a square root a number then good or throw an error
	public Sudoku(int iSize) throws Exception {
		this.iSize = iSize;
		double Sqrt = Math.sqrt(iSize);
		
		if ((Sqrt == Math.floor(Sqrt)) && (!Double.isInfinite(Sqrt))) {
			this.iSqrtSize = (int) Sqrt;
		}
		else {
			throw new Exception("notSqrt");
		}
	}
	
	public Sudoku (int[][] puzzel) throws Exception {
		super(puzzel);
		this.iSize = puzzel.length;
		double Sqrt = Math.sqrt(iSize);
		if ((Sqrt == Math.floor(Sqrt)) && (!Double.isInfinite(Sqrt))) {
			this.iSqrtSize = (int) Sqrt;
		}
		else {
			throw new Exception("notSqrt");
		}
	}

	public int[][] getPuzzel()
	{
		return super.getLatinSquare();
	}


//input region number, find region and return the regional array	
	
	protected int[] getRegion(int rNbr) {
		
		int[] regionArray = new int[super.getLatinSquare().length];
		
		int i = (rNbr % iSqrtSize)* iSqrtSize;
		int j = (rNbr / iSqrtSize) * iSqrtSize;
		int iMax = j + iSqrtSize;
		int jMax = i + iSqrtSize;
		int iCount = 0;
		
		
		for ( ; j < jMax; j++) {
			
			for (i = (rNbr % iSqrtSize) * iSqrtSize ; i < iMax; i++) {
				
				System.out.println("J: " +j+ "  " + "I: " + i);
				
			}}}
	
//find region using input column and row, then call getRegion(int r) and return the regional array
	
	protected int[] getRegion(int iCol, int iRow)
	{
		int[] puzzelArray = new int[super.getLatinSquare().length];
		
	
		int regNum = iCol / iSqrtSize * ((iRow / iSqrtSize) * iSqrtSize);
		
		return(getRegion(regNum));
		
		
		
		
		//create integer and set equal to column divide by sqrt size, (row size divide by sqrtsize) * SqrtSize 
		// getRegion.integer set equal to above
	
		
	}
	
	
	
	
	
}
