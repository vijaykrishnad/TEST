package Gen.cool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	
	@Test(dataProvider="pora",alwaysRun=true,groups="reg")
	public void ca(String st) {
		
		System.out.println(st);
		
	}
	
	
	@DataProvider(name="pora")
	public  Object[][] sp(){
		
	Object[][] ob=new Object[1][1];
	
	ob[0][0]="hhh";
	//ob[0][1]="HHH";
	return ob;
		
	}

}
