import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
   public Student(String firstName, String lastName, int id, int[] testScores)
   {
    super(firstName,lastName,id);
    
    this.testScores=testScores;
}
    public String calculate()
    {
        int avg=0;
        String str="";
        for(int i=0;i<testScores.length;i++)
        {
            avg = avg + testScores[i];
        }
        avg = avg/testScores.length;
        
        if(avg>=90)
        {
            str = "O";
        }
        else if(avg<90 && avg>=80)
        {
            str = "E";
        }
        
        else if(avg<80 && avg>=70)
        {
            str = "A";
        }
        else if(avg<70 && avg>=55)
        {
            str = "P";
        }
        else if(avg<55 && avg>=40)
        {
            str = "D";
        }
        else if(avg<40)
        {
            str = "T";
        }
        return str;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
