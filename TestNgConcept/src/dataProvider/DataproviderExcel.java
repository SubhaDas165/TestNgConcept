package dataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelUtility.ExcelReader;

public class DataproviderExcel {
	 ExcelReader er;
	 @Test(dataProvider="testdata")
	public void test1(String username,String email,String state) {
		System.out.println(username+"  "+email+"  "+state);
	}
	 @DataProvider(name="testdata")
	public Object[][] getData() throws Exception {
		Object obj[][]=testData();
		return obj;
	}
	
	public Object[][] testData() throws Exception {
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\TestNgConcept\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
		
		int rowc=er.getRowCount(0);
		int colc=er.getColCount(0);
		Object obj[][]=new Object[rowc][colc];
		for (int i = 0; i < rowc; i++) {
			for (int j = 0; j < colc; j++) {
			
				String data=er.getData(0, i, j);
				System.out.println(data+"  ");
				obj[i][j]=data;
	
			}
		}
		return obj;
		
	}

}
