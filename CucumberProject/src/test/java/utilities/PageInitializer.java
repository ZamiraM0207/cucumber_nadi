package utilities;

import pagesClass.CardioPage;
import pagesClass.HomePage_Page;
import pagesClass.LogInPage;
import pagesClass.MyAccountPage;
import pagesClass.SignUpPage;
import pagesClass.eBikesPage;

public class PageInitializer extends Driver{
	public static MyAccountPage MyP;
	public static HomePage_Page HpP;
	public static CardioPage CT;
	public static eBikesPage eBP;
	public static SignUpPage sPage;
	public static LogInPage LgP;

	
	
	public static void initialize() {
		
		MyP = new MyAccountPage();
		HpP = new HomePage_Page();
		CT = new CardioPage();
		eBP = new eBikesPage();
		sPage = new SignUpPage();
		LgP =new LogInPage();
	}
	
}
