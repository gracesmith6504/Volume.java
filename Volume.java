import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		System.out.println("What is the length of your box?");
		Double Length = input.nextDouble();
		System.out.println("What is the width of your box?");
		Double Width = input.nextDouble();
		System.out.println("What is the height of your box?");
		Double Height = input.nextDouble();
		input.close();
		
		double SurfaceArea = (Length*Width*2) + (Length*Height*2) + (Width*Height*2);
		double Volume = Length*Width*Height;
		
		System.out.println("The surface area of a " + Length + " X " + Width + " X " + Height + " box is " + SurfaceArea );
		System.out.println("The volume of a " + Length + " X " + Width + " X " + Height + " box is " + Volume );
	}

}
