package email_app;

import java.util.Scanner;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String comSuffix = "abccompany.com";
	private int mailboxCapacity = 500;
	private int defaultPassLength = 10;
	Scanner s = new Scanner(System.in);
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: "+ this.firstName + " " +this.lastName);
		
		//Call a method asking for department and returning it
		department = deptCode();
		//System.out.println("Department: "+department);
		
		//Call a method that returns random password
		password = randomPassoword(defaultPassLength);
		System.out.println("Your password is: "+password);
		
		//Combining elements to generate email
		email = firstName.toLowerCase() +"."+ lastName.toLowerCase() + "@" + department + "." + comSuffix; 
		//System.out.println("Your Email is: "+email);
	}
	
	
	//Ask for the department
	private String deptCode()
	{
		System.out.println("New Employee:"+firstName+"\nDepartment Codes\n1 for Sale \n2 for Developement\n3 for Accounting\n0 for none\n Enter department code:");
		int deptCode = s.nextInt();
		switch(deptCode)
		{
		case 1: return "sales";
		case 2: return "dev";
		case 3: return "acc";
		default : return "";
		}
	}
	//Generate a random password
	private String randomPassoword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}

	//Get password
	public String getPassword() {
		return password;
	}

	//Set Password
	public void setPassword(String password) {
		this.password = password;
	}

	//Get Alternate Email
	public String getAlternateEmail() {
		return alternateEmail;
	}

	//Set Alternate Email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	//Get MailBox Capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	//Set MailBox Capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	public String showInfo()
	{
		return "Display Name:" + firstName + " " + lastName + 
				"\nCompany Email:" + email +
				"\nMailbox Capacity:" + mailboxCapacity + "mb";
	}
	
	

}
