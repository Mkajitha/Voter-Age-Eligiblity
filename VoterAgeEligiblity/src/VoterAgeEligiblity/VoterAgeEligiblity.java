package VoterAgeEligiblity;
import java.util.Scanner;

public class VoterAgeEligiblity {
    
    public static void main(String[] args) {
        
        int age ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=s.nextInt();
        
        if(age<18 ){
            System.out.println("You Are Not Eligible for Voting!");
        }
        
        else if(age>=18&&age<=100){
            System.out.println("You Are Eligible for Voting!");
        }
        
        else{
            System.out.println("Invalid!");
        }
    }
    
}
