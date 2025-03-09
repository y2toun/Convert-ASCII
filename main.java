import java.util.Scanner;
public class main
{
// First entering the char and get the ASCII value :+)
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter a character:");
char x1 = input.next().charAt(0);
int x2 = (int)x1;
System.out.println("ASCII value of '"+x1+"' is: " +x2);

// Second entering the ASCII value and get the char :)
System.out.println("Enter an integer (0-127) :");
int y1 = input.nextInt();
char y2 = (char)y1;
System.out.println("Character for ASCII value '"+y1+"' is: "+y2);

// This program by Ahmed Mohamed Yakout for dr hager <3
}
}