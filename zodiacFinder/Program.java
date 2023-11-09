/*
 * A program that determines a person’s astrological zodiac sign based on their birthday.
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {
	
	// constants
	
	/*
	Aquarius = January 20 to February 18
	Aries = March 21 to April 19
	Cancer = June 21 to July 22
	Capricorn = December 22 to January 19
	Gemini = May 21 to June 20
	Leo = July 23 to August 22
	Libra = September 23 to October 22
	Pisces = February 19 to March 20
	Sagittarius = November 22 to December 21
	Scorpio = October 23 to November 21
	Taurus = April 20 to May 20
	Virgo = August 23 to September 22
	 */
	
	public static final int AQUARIUSEND = 18;
	
	public static final int ARIESEND = 19;
	
	public static final int CANCEREND = 22;
	
	public static final int CAPRICORNEND = 19;
	
	public static final int GEMINIEND = 20;
	
	public static final int LEOEND = 22;
	
	public static final int LIBRAEND = 22;
	
	public static final int PISCESEND = 20;
	
	public static final int SAGEND = 21;
	
	public static final int SCORPIOEND = 21;
	
	public static final int TAURUSEND = 20;
	
	public static final int VIRGOEND = 22;
	
	// methods
	
	// method for wrong date, and program termination
	static void wrongDate()
	{
		System.out.println("Invalid Date!!!");
		System.exit(0);
	}
	
	// method for checking the requirements for month, and day input
	static void checkInput(int month, int day)
	{
		// invalid month
		if (month < 1 || month > 12)
		{
			System.out.println("Invalid Month!!!");
			System.exit(0);
		}
		// invalid day
		if (day < 0 || day > 31)
		{
			wrongDate();
		}
		
	}

	// method for checking the correct # of days for the month
	static void checkDay(int month, int day)
	{	
		// february
		if ((month == 2) && (day > 28))
		{
			wrongDate();
		}
		// april, june, september, november
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
		{
			wrongDate();
		}
	}
	
	// method for determining zodiac / sun sign
	static void getZodiac(int month, int day)
	{
		
		switch (month)
		{
		// jan
		case 1:
			if (day <= CAPRICORNEND)
			{
				System.out.println("You are a Sagittarius!");
			}
			else
			{
				System.out.println("You are an Aquarius!");
			}
			break;
		// feb
		case 2:
			if (day <= AQUARIUSEND)
			{
				System.out.println("You are an Aquarius!");
			}
			else
			{
				System.out.println("You are a Pisces!");
			}
			break;
		// mar
		case 3:
			if (day <= PISCESEND)
			{
				System.out.println("You are a Pisces!");
			}
			else
			{
				System.out.println("You are a Aries!");
			}
			break;
		// apr
		case 4:
			if (day <= ARIESEND)
			{
				System.out.println("You are a Aries!");
			}
			else
			{
				System.out.println("You are a Taurus!");
			}
			break;
		// may
		case 5:
			if (day <= TAURUSEND)
			{
				System.out.println("You are a Taurus!");
			}
			else
			{
				System.out.println("You are a Gemini!");
			}
			break;
		// jun
		case 6:
			if (day <= GEMINIEND)
			{
				System.out.println("You are a Gemini!");
			}
			else
			{
				System.out.println("You are a Cancer!");
			}
			break;
		// jul
		case 7:
			if (day <= CANCEREND)
			{
				System.out.println("You are a Cancer!");
			}
			else
			{
				System.out.println("You are a Leo!");
			}
			break;
		// aug
		case 8:
			if (day <= LEOEND)
			{
				System.out.println("You are a Leo!");
			}
			else
			{
				System.out.println("You are a Virgo!");
			}
			break;
		// sep
		case 9:
			if (day <= VIRGOEND)
			{
				System.out.println("You are a Virgo!");
			}
			else
			{
				System.out.println("You are a Libra!");
			}
			break;
		// oct
		case 10:
			if (day <= LIBRAEND)
			{
				System.out.println("You are a Libra!");
			}
			else
			{
				System.out.println("You are a Scorpio!");
			}
			break;
		// nov
		case 11:
			if (day <= SCORPIOEND)
			{
				System.out.println("You are a Scorpio!");
			}
			else
			{
				System.out.println("You are a Sagittarius!");
			}
			break;
		// dec
		case 12:
			if (day <= SAGEND)
			{
				System.out.println("You are a Sagittarius!");
			}
			else
			{
				System.out.println("You are a Capricorn!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		// create a new instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// get user input
		System.out.println("What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.");
		String input = sc.nextLine();
		
		sc.close();
		
		// create a new instance of Scanner to parse the previous input
		Scanner parse = new Scanner(input);
		int month = parse.nextInt();
		int day = parse.nextInt();
		
		// check input for immediate termination
		checkInput(month, day);
		
		// check input for wrong day of month
		checkDay(month, day);
		
		// output
		getZodiac(month, day);
		
		parse.close();

	}

}
