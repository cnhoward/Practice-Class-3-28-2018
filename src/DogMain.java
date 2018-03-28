import java.util.Scanner;
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter three dogs by name and breed");
		
		
		
Dog Dog1 = new Dog(scanner.nextLine(), scanner.nextLine());
Dog Dog2 = new Dog(scanner.nextLine(), scanner.nextLine());
Dog Dog3 = new Dog(scanner.nextLine(), scanner.nextLine());
		
Dog[] dogs = {Dog1, Dog2, Dog3};	

System.out.println(dogs[1].name);

	}

}
