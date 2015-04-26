package addMovie;

import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		AddMovieService ams = new AddMovieService();
		AddMovie am = ams.getAddMoviePort();	
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		System.out.println("-----Welcome to IMDB Spy Movie Adder-----");
		while(running)
		{
			System.out.println("\n---Menu---");
			System.out.println("1- 	Add Movie");
			System.out.println("2- 	Exit");
			System.out.print("Chose an option:");
			switch(sc.next())
			{
				case "1":
					System.out.print("XML: ");
					sc.nextLine();
					System.out.println(am.addMovie(sc.nextLine()));
					break;
				case "2":
					running = false;
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}
		}
		
		//String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><MovieCatalog><Movie><Title>Paranormal Activity: The Marked Ones (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Horror</Genre><Genre>Thriller</Genre></GenresList><DirectorList><Director>Christopher Landon</Director></DirectorList><StarList><Star>Andrew Jacobs</Star><Star>Molly Ephraim</Star><Star>Richard Cabral</Star><Star>Crystal Santos</Star></StarList></Movie><Movie><Title>One Chance (2013)</Title><AdultContent>false</AdultContent><Score>51</Score><GenresList><Genre>Biography</Genre><Genre>Comedy</Genre><Genre>Drama</Genre></GenresList><DirectorList><Director>David Frankel</Director></DirectorList><StarList><Star>James Corden</Star><Star>Mackenzie Crook</Star><Star>Julie Walters</Star><Star>Jemima Rooper</Star></StarList></Movie><Movie><Title>Jack Ryan: Agente Sombra (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Action</Genre><Genre>Drama</Genre><Genre>Thriller</Genre></GenresList><DirectorList><Director>Kenneth Branagh</Director></DirectorList><StarList><Star>Chris Pine</Star><Star>Kevin Costner</Star><Star>Keira Knightley</Star><Star>Kenneth Branagh</Star></StarList></Movie><Movie><Title>Ride Along (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Action</Genre><Genre>Comedy</Genre></GenresList><DirectorList><Director>Tim Story</Director></DirectorList><StarList><Star>Ice Cube</Star><Star>Kevin Hart</Star><Star>Tika Sumpter</Star><Star>John Leguizamo</Star></StarList></Movie><Movie><Title>Nascido das Trevas (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Horror</Genre></GenresList><DirectorList><Director>Matt Bettinelli-Olpin</Director><Director>Tyler Gillett</Director></DirectorList><StarList><Star>Allison Miller</Star><Star>Zach Gilford</Star><Star>Steffie Grote</Star><Star>Robert Belushi</Star></StarList></Movie><Movie><Title>The Nut Job (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Animation</Genre><Genre>Adventure</Genre><Genre>Comedy</Genre><Genre>Family</Genre></GenresList><DirectorList><Director>Peter Lepeniotis</Director></DirectorList><StarList><Star>Will Arnett</Star><Star>Katherine Heigl</Star><Star>Brendan Fraser</Star><Star>Liam Neeson</Star></StarList></Movie><Movie><Title>Eu, Frankenstein (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Action</Genre><Genre>Fantasy</Genre><Genre>Sci-Fi</Genre></GenresList><DirectorList><Director>Stuart Beattie</Director></DirectorList><StarList><Star>Aaron Eckhart</Star><Star>Bill Nighy</Star><Star>Miranda Otto</Star><Star>Virginie Le Brun</Star></StarList></Movie><Movie><Title>Um Segredo do Passado (2013)</Title><AdultContent>true</AdultContent><Score>66</Score><GenresList><Genre>Drama</Genre></GenresList><DirectorList><Director>Jason Reitman</Director></DirectorList><StarList><Star>Kate Winslet</Star><Star>Josh Brolin</Star><Star>Gattlin Griffith</Star><Star>Clark Gregg</Star></StarList></Movie><Movie><Title>That Awkward Moment (2014)</Title><AdultContent>false</AdultContent><GenresList><Genre>Comedy</Genre><Genre>Romance</Genre></GenresList><DirectorList><Director>Tom Gormican</Director></DirectorList><StarList><Star>Zac Efron</Star><Star>Michael B. Jordan</Star><Star>Miles Teller</Star><Star>Imogen Poots</Star></StarList></Movie></MovieCatalog>";
		
	}
}
