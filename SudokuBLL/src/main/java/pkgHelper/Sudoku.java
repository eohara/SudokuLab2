package pkgHelper;

import java.util.Arrays;

import pkgHelper.LatinSquare;

import java.lang.Math;


public class Sudoku extends LatinSquare {
	
	private int iSize;
	private int iSqrtSize;
	
	private int[][] myPuzzle;
	
	
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
	
	public Sudoku (int[][] puzzle) throws Exception {
		super(puzzle);
		this.iSize = puzzle.length;
		double Sqrt = Math.sqrt(iSize);
		if ((Sqrt == Math.floor(Sqrt)) && (!Double.isInfinite(Sqrt))) {
			this.iSqrtSize = (int) Sqrt;
		}
		else {
			
			throw new Exception("notSqrt");
		}
	}

	public int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}


//input region number, find region and return the regional array	
	
	public int[] getRegion(int rNum)  {
		
		int[] regionArray = new int[super.getLatinSquare().length];
		
		int i = (rNum % iSqrtSize)* iSqrtSize;
		int j = (rNum / iSqrtSize) * iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = 0;
		
		
		for ( ; j < jMax; j++) {
			
			for (i = (rNum % iSqrtSize) * iSqrtSize ; i < iMax; i++) {
				
				regionArray[iCnt++] = super.getLatinSquare()[j][i];
			
				 
			}}
		
		return regionArray; 
		}
	 
	
//find region using input column and row, then call getRegion(int r) and return the regional array
	
	protected int[] getRegion(int iCol, int iRow)
	{
		int regNum = (iCol / iSqrtSize) + ((iRow / iSqrtSize) * iSqrtSize);
		
		return getRegion(regNum);
		
		//create integer and set equal to column divide by sqrt size, (row size divide by sqrtsize) * SqrtSize 
		// getRegion.integer set equal to above

	}
	
	public boolean isValueValid(int iCol, int iRow, int iValue)
	{
		boolean a = true;
		if (super.doesElementExist(super.getRow(iRow),iValue) == true)
		{
			a = false;
		}
		if (super.doesElementExist(super.getColumn(iCol),iValue) == true)
		{
			a = false;	
		}
		if (super.doesElementExist(getRegion(iCol,iRow),iValue) == true)
		{
			a = false;
		}
		return a;
		
	}
		 
	 public boolean isPartialSudoku() {
		
		boolean a = true;
		boolean b;
		int c;
		int[][] mySud = super.getLatinSquare();
		
	
		for (int i = 0; i < iSize; i++)
		{
		for (int j = 0; j < iSize; j++) 
			{ 
				if (mySud[i][j] != 0)
				{
					c = mySud[i][j];
					b = isValueValid(j,i,c); 
					if (b = false)
					{
						a = false;
						
					}
				}
				
			} 
		}
		return a;
	}
	 
	 public  boolean isSudoku() {
			boolean a = false;
			  if (isPartialSudoku() == true && super.ContainsZero() == false)
			  {
				  a = true;
			  }
			  return a;
	}
}
	
	
	

