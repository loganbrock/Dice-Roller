import java.util.Random;
import javax.swing.*;

public class Legend {
	static String player1;
	static String player2;
	static String player3;
	static int p1hp, p2hp, p3hp, round = 1;
	static int Oloss, Tloss, Thloss;
	static String tempO, tempT, tempTh;
	static boolean p1=false, p2=false, p3=false;
	public static void main	(String[] args)	{
		String[] die = { "d20", "d12", "d10", "d8", "d6", "d4", "d100" };
		
		String player1hp, player2hp, player3hp;
		
		String choice;
		int chosen=1;
		player1 = JOptionPane.showInputDialog(null,"Character 1: ");
		player1hp = JOptionPane.showInputDialog(null, player1+"'s hit points: ");
		p1hp = Integer.parseInt(player1hp);
		player2 = JOptionPane.showInputDialog(null,"Character 2: ");
		player2hp = JOptionPane.showInputDialog(null, player2+"'s hit points: ");
		p2hp = Integer.parseInt(player2hp);
		player3 = JOptionPane.showInputDialog(null,"Character 3: ");
		player3hp = JOptionPane.showInputDialog(null, player3+"'s hit points: ");
		p3hp = Integer.parseInt(player3hp);
		
		while(chosen>0&&chosen<9)	{
		
		if(!p1&&!p2&&!p3)
			JOptionPane.showMessageDialog(null, "Round "+round+":\n"+player1+": "+p1hp+"\n"+player2+": "+p2hp+"\n"+player3+": "+p3hp+"\n");
		else if(!p1&&!p2)
			JOptionPane.showMessageDialog(null, "Round "+round+":\n"+player1+": "+p1hp+"\n"+player2+": "+p2hp);
		else if(!p1&&!p3)
			JOptionPane.showMessageDialog(null, "Round "+round+":\n"+player1+": "+p1hp+"\n"+player3+": "+p3hp);
		else if(!p2&&!p3)
			JOptionPane.showMessageDialog(null, "Round "+round+":\n"+player2+": "+p2hp+"\n"+player3+": "+p3hp);
		
		choice  = JOptionPane.showInputDialog(null, " 1: d20\n 2: d12\n 3: d10\n 4: d8\n 5: d6\n 6: d4\n 7: d100\n 8: Health loss.\n 9: Quit.");
		chosen = Integer.parseInt(choice);
		
		if(chosen==1)
			d20();
		
		if(chosen==2)
			d12();
		
		if(chosen==3)
			d10();
		
		if(chosen==4)
			d8();
		
		if(chosen==5)
			d6();
		
		if(chosen==6)
			d4();
		
		if(chosen==7)
			d100();
		
		if(chosen==8)
			HealthLoss();
		
		if(chosen==9)
			JOptionPane.showMessageDialog(null, "Thank you!");
		}
	}

	public static void d100()	{
		Random generator = new Random();
		int ohRand = generator.nextInt(100)+1;
		JOptionPane.showMessageDialog(null, "d100 roll: \t"+ohRand);
	}
	
	public static void d20()	{
		Random generator = new Random();
		int twenRand = generator.nextInt(20)+1;
		JOptionPane.showMessageDialog(null, "d20 roll: \t"+twenRand);
	}
	
	public static void d12()	{
		Random generator = new Random();
		int twRand = generator.nextInt(12)+1;
		JOptionPane.showMessageDialog(null, "d12 roll: \t"+twRand);
	}
	
	public static void d10()	{
		Random generator = new Random();
		int tRand = generator.nextInt(10)+1;
		JOptionPane.showMessageDialog(null, "d10 roll: \t"+tRand);
	}
	
	public static void d8()	{
		Random generator = new Random();
		int eRand = generator.nextInt(8)+1;
		JOptionPane.showMessageDialog(null, "d8 roll: \t"+eRand);
	}
	
	public static void d6()	{
		Random generator = new Random();
		int sRand = generator.nextInt(6)+1;
		JOptionPane.showMessageDialog(null, "d6 roll: \t"+sRand);
	}
	
	public static void d4()	{
		Random generator = new Random();
		int fRand = generator.nextInt(4)+1;
		JOptionPane.showMessageDialog(null, "d4 roll: \t"+fRand);
	}
	
	public static void HealthLoss()	{
		JButton f = new JButton("On Fire");
		JButton b = new JButton("Bleeding");
		
		if(p1==false)	{
			tempO = JOptionPane.showInputDialog(null, player1+"'s lost healthpoints: ");
			Oloss = Integer.parseInt(tempO);
			p1hp-=Oloss;
			if(p1hp <= 0)
				kill(1);
		}
		
		if(p2==false)	{
		tempT = JOptionPane.showInputDialog(null, player2+"'s lost healthpoints: ");
		Tloss = Integer.parseInt(tempT);
		p2hp-=Tloss;
			if(p2hp <= 0)
				kill(2);
		}
		
		if(p3==false)	{
		tempTh = JOptionPane.showInputDialog(null, player3+"'s lost healthpoints: ");
		Thloss = Integer.parseInt(tempTh);
		p3hp-=Thloss;
			if(p3hp <= 0)
				kill(3);
		}
		round++;
	}

	public static void kill(int number)	{
		if(number==1)
			p1=true;
		if(number==2)
			p2=true;
		if(number==3)
			p3=true;
	}
}