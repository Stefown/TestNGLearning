package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class TestParameterization {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider="getData")
	public void doLogin(Hashtable<String,String> data)
	{
		//System.out.println(username+"---"+password+"---"+is_correct);
		System.out.println(data.get("username")+"---"+data.get("password")+"---"+data.get("is_correct")+"---"+data.get("age")+"---"+data.get("gender")+"---");
	}

	@DataProvider
	public static Object[][] getData()
	{
		
		if(excel == null)
		{
			excel = new ExcelReader("../TestNGLearning/Excel/testngdata.xlsx");
			
		}
		
		String sheetName="loginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][1];
		
		Hashtable<String,String> table = null;
		
		for(int rowNum=2; rowNum<=rows; rowNum++)
		{
			table = new Hashtable<String,String>();
			
			for(int colNum=0; colNum<cols; colNum++)
			{
				//data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);		
			
			table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
			data[rowNum-2][0]=table;
			
			}
		}
		
		/*
		 * data[0][0] = "trainer@way2automation.com"; data[0][1] = "sdfsdf";
		 * 
		 * data[1][0] = "java@way2automation.com"; data[1][1] = "sdfsdfsdf";
		 * 
		 * data[2][0] = "corporate@way2automation.com"; data[2][1] = "sdfsdfssss";
		 */
		
		return data;
	}

}
