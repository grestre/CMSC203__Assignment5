
import java.io.*;
import java.util.*; 

public class TwoDimRaggedArrayUtility {
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		double[][] data=new double[10][10];
		Scanner inputFile = new Scanner (file);
		int row = 0;
				for(int col = 0; col < data[row].length; col++)
				{
					data[row][col] = inputFile.nextDouble();
				}
		return data; 
	}
	
	
	public static double getAverage(double [][] data)
	{
		int count = 0;
		double sum = 0;
		 for (int a = 0; a < data.length; a++)
         {
             for (int b = 0; b < data[a].length; b++)
             {
                  sum += data[a][b];
                  count += 1;
             }
         }
         return sum / count;
	}
	public static double getColumnTotal(double [][] data, int col)
	{
	     double colTotal = 0;
         for (int a = 0; a < data.length; a++)
         {
             if (col <= data[a].length - 1) 
             {
                  colTotal += data[a][col];
             }
         }
         return colTotal;
	}
	public static double getHighestInArray(double [][] data)
	{
		 double highArray = data[0][0];
         for (int a = 0; a < data.length; a++)
         {
             for (int b = 0; b < data[a].length; b++)
             {
                  if (data[a][b] > highArray)
                       highArray = data[a][b];
             }
         }
         return highArray;
	}
	public static double getHighestInColumn(double [][] data, int col)
	{
		 double highCol = data[0][col];
         for (int a = 0; a < data.length; a++)
         {
             if (col <= data[a].length - 1)
             {
                  if (data[a][col] > highCol)
                  {
                       highCol = data[a][col];
                  }
             }
         }
         return highCol; 
	}
	
	public static int getHighestInColumnIndex(double [][] data, int col)
	{
		  int highColIndex = -1;
		    for(int a = 0; a < data.length; ++a) {
		        if(col < data[a].length) {
		            if(highColIndex == -1 || data[a][col] > data[highColIndex][col]) {
		                highColIndex = a;
		            }
		        }
		    }
		    return highColIndex;
		}
	public static double getHighestInRow(double [][] data, int row)
	{
		double highRow = data[row][0];
		for (int a = 0; a < data[row].length; a++) 
	        {
	            if (highRow < data[row][a]) 
	            {
	                highRow = data[row][a];
	            }
	        }
	        return highRow;
	    }
	public static int getHighestInRowIndex(double [][] data, int row)
	{
		 int highRowIndex = 0;
         for (int a = 0; a < data[row].length; ++a)
         {
             if (data[row][a] > data[row][highRowIndex])
             {
                  highRowIndex = a;
             }
         }
         return highRowIndex;
	}
	public static double getLowestInArray(double [][] data)
	{
		double lowestArray = data[0][0];
          for (int a = 0; a < data.length; a++)
          {
              for (int b = 0; b < data[a].length; b++)
              {
                   if (data[a][b] < lowestArray)
                        lowestArray = data[a][b];
              }
          }
          return lowestArray;
     }
	
	public static double getLowestInColumn(double [][] data, int col)
	{
		double lowCol = data[0][col];
		for (int a = 0; a < data.length; a++)
		{
			if (col <= data[a].length - 1)
				if (data[a][col] < lowCol)
				{
					lowCol = data[a][col];
				}
		}
		return lowCol;
	}
	
	public static int getLowestInColumnIndex(double [][] data, int col)
	{
		  int lowColIndex = -1;
		    for(int a = 0; a < data.length; ++a) {
		        if(col < data[a].length) {
		            if(lowColIndex == -1 || data[a][col] < data[lowColIndex][col]) {
		                lowColIndex = a;
		            }
		        }
		    }
		    return lowColIndex;
	}
	public static double getLowestInRow(double [][] data, int row)
	{
		double lowRow = data[row][0];
		for(int a = 0; a < data[row].length; a++)
		{
			if (lowRow > data[row][a])
			{
				lowRow = data[row][a];
			}
		}
		return lowRow; 
	}
	public static int getLowestInRowIndex(double [][] data, int row)
	{
		 int lowRowIndex = 0;
         for (int a = 0; a < data[row].length; ++a)
         {
             if (data[row][a] < data[row][lowRowIndex])
             {
                  lowRowIndex = a;
             }
        }
         return lowRowIndex;
	}
	public static double getRowTotal(double [][] data, int row)
	{
		double rowTotal = 0; 
		for(int a = 0; a < data[row].length; a++)
		{
			rowTotal += data[row][a]; 
		}
		return rowTotal; 
	}
	public static double getTotal(double [][] data)
	{
		  double total = 0;
          for (int a = 0; a < data.length; a++)
          {
              for (int b = 0; b < data[a].length; b++)
              {
                   total += data[a][b];
              }
          }
		return total; 
	}
	public static void writeToFile(double [][] data, java.io.File outputFile) throws FileNotFoundException
	{
		int a; 
		int b; 
		PrintWriter output = new PrintWriter(outputFile);
		for(a = 0; a<data.length; a++)
		{
			for(b = 0; b<data[a].length; b++)
			{
				output.print(data[a][b] + " ");
				output.println(data[a][b]);
			}
		}
		output.close();
	}
}
