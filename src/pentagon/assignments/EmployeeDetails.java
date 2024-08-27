package pentagon.assignments;

/* Enhanced For LOOP Syntax
 * for(data type ref name :listofdata)
 * {
 *     // code to be excuted
 * }
 */
public class EmployeeDetails
{

	public static void main(String[] args) 
	{
		String[] emp_names = {"Harshitha","Arpitha","Yashu","Chandana","Divya"};
		int salaries[] = {16000,14000,15000,20000,17000};
		String[] departments = {"IT","HR","Sales","Marketing","Finance"};
		
		//System.out.println("Display Employee salary  having 15000:");
		for(int i=0;i<emp_names.length;i++) 
		{
			if(salaries[i]>=15000) 	
				
			{
				System.out.println("Name: " + emp_names[i] + ", Salary: " + salaries[i] + ", Department: " + departments[i]);
			}
		}	
		
	}

}

