/*
	* OOPSBannerApp UC7 - Store chareceter pattern in a class
	* 
	* This class extends UC6 by implementing a CharecterPatternMap class to encapsulate charecter-to-pattern mappings. 
	* The application retrieves and displays "OOPS" banner using these mappings. 
	* This approach enhances code reusability and maintainablilty by separating pattern generation logic from main display logic.
	*
	* @author Developer
	* @version 7.0
*/

class OOPSBannerApp
{
	static class CharecterPatternMap
	{
		public static String[] getOPattern()
		{
			return new String[]{
				"   ***   " ,
				" **   ** " ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				"**     **" ,
				" **   ** " ,
				"   ***   "
			};
		}
		public static String[] getPPattern()
		{
			return new String[] {
				"******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
			};
		}
		public static String[] getSPattern()
		{
			return new String[] {
				"    *****",
				" **      ",
				"**       ",
				" **      ",
				"   ***   ",
				"      ** ",
				"       **",
				"      ** ",
				"*****    "
			};
		}
		public void printMessage()
		{
			String[] oPattern = getOPattern();
			String[] pPattern = getPPattern();
			String[] sPattern = getSPattern();
			
			for(int i=0; i< oPattern.length; i++ )
			{
				System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
			}
		}
	}
		
	
	public static void main(String[] args)
	{
		CharecterPatternMap charMap = new CharecterPatternMap();
		charMap.printMessage();
	}
}