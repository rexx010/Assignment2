import java.util.Scanner;

public class Palindrome{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a three digit number: ");
int number = input.nextInt();

int counter = number;
int reversalNum = 0;

while(counter != 0){
int individualNum = counter % 10;
reversalNum = reversalNum * 10 + individualNum;
counter = counter / 10;

}
if(number == reversalNum){
System.out.println("yes " + number + " is a palindrome number");
} else{
System.out.println("No " + number + " is not a palindrome number");
}

}
}