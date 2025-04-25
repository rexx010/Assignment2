import java.util.Scanner;

public class Occurence{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int max = 0;
int count = 0;

for (int counter = 1; counter <= 10; counter++) {

System.out.print("Enter a number: ");
int num = input.nextInt();

if (num > max) count = 0;

if (num >= max){
max = num;
}

if (max == num) count++;

}

System.out.println("Largest is "+max);
System.out.print("Number of occurence is "+count);

}
}