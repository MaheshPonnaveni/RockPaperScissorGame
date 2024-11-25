import java.util.*;
public class Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int draw=0;
		int user=0;
		int system=0;
		int upperbound=3;
		int choice;
		//0--->Rock
		//1--->paper
		//2--->Sccisor
		do {
			int random=rd.nextInt(upperbound);
			System.out.println("Enter your input number between 0 and 2 where as \n 0=rock \n 1=paper \n 2=sccisor");
			int input=sc.nextInt();
				System.out.println("user input is:"+input);
				System.out.println("system input value from 0 to"+(upperbound-1)+":"+random);
					
			if(input==random) { 
				System.out.println("Draw");
			draw++;
				}
			else if(((input==0)&& (random==2))||((input==1)&&(random==0))||(((input==2)&&(random==1)))) {
				System.out.println("user won");
			user++;
				}
			else
			{
				System.out.println("computer won");
				system++;
			}
			
		
			System.out.println("Enter your choice 1-->continue/n0-->terminate");
		choice=sc.nextInt();
			//choice=0;
			//choice++;
		
		}
		while(choice==1);
		System.out.println("no.of times Draw  is:"+draw);
		System.out.println("no.of times user win is:"+user);
		System.out.println("no.of times system win is:"+system);	
		if(user>system) {
			System.out.println("no.of times user win is:"+user);
		}
		else if(user<system) {
			System.out.println("no.of times system win is:"+system);	
		}
		else {
			System.out.println("no.of times Draw  is:"+draw);
		}
	}	
}