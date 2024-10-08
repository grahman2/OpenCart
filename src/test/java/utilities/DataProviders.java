package utilities;

import java.io.IOException;

public class DataProviders {
	
	public String[][] getData() throws IOException {
		String path = "./testData/logindata.xlsx";
		
		ExcelUtility xlutility = new ExcelUtility(path);
		int totalrows = xlutility.getRowCount("Sheet1");
		int totalcols = xlutility.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols];
		
		for (int i=1; i<=totalrows; i++) {
			for(int j=0; j<totalcols; j++) {
				logindata[i-1][j]= xlutility.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
		
	}

}
