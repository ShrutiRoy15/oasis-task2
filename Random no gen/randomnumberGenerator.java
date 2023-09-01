package internship;
import java .util.Random;
import java .util.Scanner;
import javax.swing.JOptionPane;
public class randomnumberGenerator {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int c=0;
		JOptionPane.showMessageDialog(null,"Hello! This is random number guessing game \nHere you can guess the numbers from 0-9",null, JOptionPane.PLAIN_MESSAGE, null);
		JOptionPane.showMessageDialog(null,"The rules are simple\n1.If you guess the correct number,you get +1.\n2.If you guess the wrong number,you get -1.\n3.You get total 5 turns.\n4.At the end of 5th turn your total Score will be displayed.\n5.Press OK to start the game.",null, JOptionPane.INFORMATION_MESSAGE, null);
		for(int i=0;i<=4;i++)
		{
			String st=JOptionPane.showInputDialog("Please try your luck and enter any number between 0-9");
		int n= Integer.parseInt(st);
		
			int r=rand.nextInt(9);
			JOptionPane.showMessageDialog(null,"Random No. is \t"+r,null,JOptionPane.PLAIN_MESSAGE, null );
		
		if (n==r)		
			{c++;
			JOptionPane.showMessageDialog(null, "You Win!!", "The Result",JOptionPane.INFORMATION_MESSAGE, null);
		
		}
		else
			{
			c--;
			JOptionPane.showMessageDialog(null, "You Lose!!", "The Result", JOptionPane.INFORMATION_MESSAGE, null);
			}
		if(i==4)
				JOptionPane.showMessageDialog(null, "Sorry!!You have exhausted your turns","Warning", JOptionPane.WARNING_MESSAGE);
		}	
		
		JOptionPane.showMessageDialog(null, "\n\nYOUR SCORE IS ="+c,"The Final Result", JOptionPane.PLAIN_MESSAGE);
			
		sc.close();
	}}
