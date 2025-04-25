import java.util.Scanner;

public class Pride{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = input.nextInt();

boolean prime = false;
int counter = 2;

while(counter <= num / 2){ 
if (num % counter == 0){
prime = true;
break;
}
counter++;
}

if (!prime)
System.out.print(num+" is a prime number ");

}
}