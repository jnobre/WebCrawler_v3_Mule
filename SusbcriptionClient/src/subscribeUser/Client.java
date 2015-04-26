package subscribeUser;

import getstatistics.GetStatistics;
import getstatistics.GetStatisticsService;

import java.util.Scanner;

public class Client
{
	
	public static String getUserData(String action, String type)
	{
		Scanner sc = new Scanner(System.in);
		boolean complete = false; 
		String email = "";
		
		while(!complete)
		{
			System.out.print("Enter Email: ");
			email = sc.nextLine();
			email = email.replaceAll(" ", "");
			if(email != "")
				complete = true;
		}
		return "<user><mail>" + email + "</mail><type>" + type + "</type><action>" + action + "</action></user>";
	}
	public static void main(String[] args)
	{
		SubscribeUserService sus = new SubscribeUserService();
		SubscribeUser su = sus.getSubscribeUserPort();
		
		GetStatisticsService gss = new GetStatisticsService();
		GetStatistics gs = gss.getGetStatisticsPort();
		
		//String mail = "telmococo2@gmail.com", digestType = "TRUE", action = "subscribe";
		//System.out.println(su.addUser("<user><mail>" + mail + "</mail><type>" + digestType + "</type><action>" + action + "</action></user>"));
		
		
		//String mail = "lalala", digestType = "TRUE", action = "unsubscribe";
		//System.out.println(su.addUser("<user><mail>" + mail + "</mail><type>" + digestType + "</type><action>" + action + "</action></user>"));
		
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		String type;
		System.out.println("-----Welcome to IMDB Spy-----");
		while(running)
		{
			System.out.println("\n---Menu---");
			System.out.println("1- 	Subscribe");
			System.out.println("2- 	Unsubscribe");
			System.out.println("3- 	Statistics");
			System.out.println("4- 	Exit");
			System.out.print("Chose an option:");
			switch(sc.next())
			{
				case "1":
					System.out.println("\n---Subscription Type---");
					System.out.println("1- 	Digest");
					System.out.println("2- 	Non-Digest");
						switch(sc.next())
						{
							case "1":
								type = "TRUE";
								System.out.println(su.addUser(getUserData("subscribe", type)));
								break;
							case "2":
								type = "FALSE";
								System.out.println(su.addUser(getUserData("subscribe", type)));
								break;
							default:
								System.out.println("Invalid Option");
								break;
						}
					break;
				case "2":
					System.out.println(su.addUser(getUserData("unsubscribe", "FALSE")));
					break;
				case "3":
					System.out.println(gs.getStatistics(" "));
					break;
				case "4":
					running = false;
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}
		}
	}
}
