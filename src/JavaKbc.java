import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class JavaKbc {
public static void main(String[] args) {
		int n,flag=0;
		
		System.out.println("Welcome to KBC" + "\nChoose one option \n 1:Play 2:Quit");
		Scanner in = new Scanner(System.in);
		int op = in.nextInt();
		if(op==1) {
			int count=0;
			Display a = new Display();
			a.Questions();
			while(flag==0) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i=0; i<10; i++) {
					list.add(new Integer(i));
				}
				Collections.shuffle(list);
			
				for(int i=0;i<10;i++) {
			
					System.out.println("Question:" + (i+1));
					a.DispQues(list.get(i));
					char ans = in.next().charAt(0);
					if(ans == a.Answers(list.get(i))) {
						System.out.println("Correct ans\n");
						count++;
						continue;
					}
					else {
						System.out.println("Afsoos Ye Galat Jawab Hai,"+ " Sahi Uttar hai option " + (char)a.Answers(list.get(i)) + "\n");
						break;
					}
				}
		
				System.out.println("You Scored: "+ count + " outof 10");
				System.out.println("Do you want to play again,\n Y:yes N:no\n");
				
				if(in.next().charAt(0) == 'Y') {
					flag=0;
					continue;
				}
				else {
					flag=1;
					break;
				}
			}
		}
	}
}
