import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {

	@Test (dataProvider="getData")
	public void LearningDataProviders(String firstName, String lastName) {
		System.out.println("I am executing");
		System.out.println(firstName + " "+ lastName);
	}
	
	
	@DataProvider
	public String[][] getData() {
		
		String[][] data = new String[3][2];
		
		//First Set of data
		data[0][0] = "Mandy";
		data[0][1] = "Taak";
		
		//Second set of data
		data[1][0]= "Misha";
		data[1][1]= "Das";
		
		//Third set of data
		
		data[2][0]= "Jerisha";
		data[2][1]= "George";
		return data;
		
		
	}
	
	@DataProvider
	public String[][] getData2() {
		
		String[][] data = new String[2][2];
		
		//First Set of data
		data[0][0] = "Virat";
		data[0][1] = "Kohli";
		
		//Second set of data
		data[1][0]= "Ms";
		data[1][1]= "Dhoni";
		
	
		return data;
		
		
	}
}
