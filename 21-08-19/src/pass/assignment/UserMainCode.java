package pass.assignment;

public class UserMainCode {
	private static int u=0;
	private static int l=0;
	private static int d=0;
	private static int s=0;
	
	public static boolean checkPassword(String password){
		if(password.length() >=8) {
			for(int i=0;i<password.length();i++)
			{
				if(Character.isLetter(password.charAt(i)) == true) 
				{
					if(Character.isUpperCase(password.charAt(i))== true)
						{
						u++;
						}
					else 
						{
						l++;
						}
				}
				else if(Character.isDigit(password.charAt(i))== true)
					{
					d++;
					}
				else //(!(password.charAt(i).matches("A-Za-z0-9")))
		{
					s++;
					}
			}
		}
		else
		{
			return false;
		}
		if(u>=1 && l>=1 && d>=1 && s>=1)
		{
			return true;}
		else
			return false;
	}
}
