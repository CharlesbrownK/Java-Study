package GetInfo.Customers;

public class Project1 {
	
	static String answer;
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------");
		System.out.println("Start of the Data Entry System"); 
		System.out.println("---------------------------------\n\n");
		
		loop:
		for (int i = 0; i < 5; i++) {			
			if (i < 5) {
				if (i > 0) {
					System.out.println("Your attempts [" + i + "/5]"); // get users first name
				}
				
				System.out.println("Enter your First Name : "); // get users first name
				String first_name = System.console().readLine();
				
				System.out.println("\nEnter your Last Name : "); // get users last name
				String last_name = System.console().readLine();			
				
				System.out.println("\nThis is the name that you entered : " + last_name + " " + first_name); // print inputted name
				System.out.println("Is it Right?[\"y\" or \"n\"] : ");
				answer = System.console().readLine();
				
				if (answer == "y") {
					break loop;
				}
			}
		}
		
	System.out.println("\n\n---------------------------------");
	System.out.println("End of the Data Entry System"); 
	System.out.println("---------------------------------\n\n");
	
	}
}

/*
cd C:\Users\ekjh0\Desktop\프로그래밍\Java\Login-Java\LoginTutorials\bin
java GetInfo.Customers.Project1
*/