public class HolidayBonus
{
	static double[] calculateHolidayBonus(double[][] data, double high, double low, double other)
	{
		double Bonus[] = new double[data.length];
		int highRowIndex= 0;
		int lowRowIndex = 0;
		for (int a = 0; a < Bonus.length; a++)
		{
			highRowIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, a );
			lowRowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, a );
			for (int b = 0; b < Bonus.length;b++ )
			{
				if (b == highRowIndex && Bonus[b] > a)
				{
					Bonus[b] += high;
				}
				else if (b == lowRowIndex && Bonus[b] > a)
				{
					Bonus[b] += low;
				}
				else 
				{
					Bonus[b] += other;
				}
			}
		}
		return Bonus;
	}
	static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
	{
		double total= 0;
		int highestRowIndex= 0;
		int lowestRowIndex = 0;
		for (int a = 0; a < data.length; a++)
		{
			highestRowIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, a );
			lowestRowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, a );
			for (int b = 0; b < data.length;b++ )
			{
				if (b ==highestRowIndex && data[b].length > a)
				{
					total += high;
				}
				else if (b == lowestRowIndex && data[b].length > a)
				{
					total+= low;
				}
				else
				{
					total += other;
				}
			}
		}
		return total;
	}
}