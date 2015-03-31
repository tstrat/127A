/*
	Travis Stratton
	Andrew Emmott
	Sept. 2, 2010, 1:15pm
	C Sc 127A, Section 10
	Description:
		This program prints out a "TOP SECRET TABLE" that
		contains 3 entries of different values.
*/

public class TableFormat
{
	public static void main(  String args[]  )
	{
		String tableName = "\tTOP SECRET TABLE";
		String rowOneName = "Entry 1" , rowTwoName = "Entry 2", rowThreeName = "Entry 3";
		String seperator = " | ";
		String firstRowData = " 1  2  3  4  5", secondRowData = "10 15 35 20  2", lastRowData = "15 12  3 17 20";
		
		System.out.print(tableName);
		System.out.print('\n' + rowOneName + seperator + firstRowData);
		System.out.print('\n' + rowTwoName + seperator + secondRowData);
		System.out.print('\n' + rowThreeName + seperator + lastRowData);
	}
}