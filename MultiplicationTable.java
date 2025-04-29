import java.util.Scanner;

public class MultiplicationTable{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number for multiplication: ");
int num = input.nextInt();

for(int counter = 1; counter <= 12; counter++){
int output = num * counter;

System.out.printf("%d * %d = %d%n", num, counter, output);
}


}
}