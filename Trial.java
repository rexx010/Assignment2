public class Trial{
public static void main(String[] args){

int num = 11;

int variable0 = num / 2;
int variable1 = num % 2;
int variable2 = variable0 / 2;
int variable3 = variable0 % 2;
int variable4 = variable2 / 2;
int variable5 = variable2 % 2;
int variable6 = variable4 / 2;
int variable7 = variable4 % 2;


System.out.printf("%d%d%d%d%n", variable1, variable3, variable5, variable7);
}
}