import java.util.Scanner;

public class PrimeClass{
public static void main(String[] args){

boolean checker = false;
int counter = 2;
int num = 2;

while(counter <= num/2){

num++;

if(counter % 2 == 0){
checker = false;

System.out.print(counter); 
System.out.print(!checker); 

}
counter++;


}


}
}