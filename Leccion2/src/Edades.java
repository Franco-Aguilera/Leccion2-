import java.util.Scanner;

public class Edades {
	public static void main(String[] args) {
		int edad = 16;
		
		Scanner user_input = new Scanner(System.in);
		
		edad = user_input.nextInt();
		System.out.println(edad);
		
		System.out.println(edad/2 + 7);
		
		if(edad>=18){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println(18-edad);
		
		}
	}
}
