import java.util.Scanner;
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Movie movie1 = new Movie("101 Dalmations", "Family", 5);
Movie movie2 = new Movie("Central Intelligence", "Comedy", 5);
Movie movie3 = new Movie("Insidious", "Horror", 5);
Movie movie4 = new Movie("Up", "Family", 5);
Movie movie5 = new Movie("John Wick", "Action", 5);

Movie[] movies = {movie1, movie2, movie3, movie4, movie5};

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a movie");

String decide = scanner.nextLine();


for(int i = 0; i<movies.length-1; i ++){
	if (decide.equals(movies[i].name))
		{
		System.out.println(movies[i].name + ", " + movies[i].genre + ", " + movies[i].rating);
		break;
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}
}




	}


