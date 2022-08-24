import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
public class MiniQuiz  implements ActionListener
{
    
	    String q[]=new String[10];
	    String op1[]=new String[10];
	    String op2[]=new String[10];
	    String op3[]=new String[10];
	    String op4[]=new String[10];
	        
        int score=0;
	    int qno=0;
        int opno1=0,opno2=0,opno3=0,opno4=0;
	    JFrame f;
		JTextField t;
		JButton b1,b2,b3,b4,next,previous;
	
		MiniQuiz()
	{       
            q[0]="What is the capital of India?";
            q[1]=" Who was the first Indian woman in Space?";
            q[2]=" Who was the first Indian in space?";
            q[3]="Who was the first Man to Climb Mount Everest Without Oxygen";
            q[4]="Who built the Jama Masjid?";
            q[5]="Who is known as Mr.IPL?";
            q[6]="Who was the first Indian Scientist to win a Nobel Prize?";
            q[7]="Who was the first Indian woman to win the Miss World Title?";
            q[8]=" Who was the first President of India?";
            q[9]=" Who was the first Indian to win the Booker Prize?";
            
            op1[0]="Chandigarh";
            op2[0]="Delhi";
            op3[0]="Ambala";
            op4[0]="Mumbai";
            
            op1[1]="Kalpana Chawla";
            op2[1]="Sunita Williams";
            op3[1]="Koneru Humpy";
            op4[1]="None of Above";
            
            op1[2]="Vikram Ambalal";
            op2[2]="Ravish Malhotra";
            op3[2]="Rakesh Sharma";
            op4[2]="Nagapathi Bhat";
            
            op1[3]="Junko Tabei";
            op2[3]="Reinhold Messner";
            op3[3]="Peter Habeler";
            op4[3]="Phu Dorji";
            
            op1[4]="Jahangir";
            op2[4]="Akbar";
            op3[4]="Imam Bukhari";
            op4[4]="Shah Jahan";
            
            op1[5]="David Warner";
            op2[5]="Suresh Raina";
            op3[5]="Virat Kohli";
            op4[5]="Rohit Sharma";
            
            op1[6]="CV Raman";
            op2[6]="Amartya Sen";
            op3[6]="Hargobind Khorana";
            op4[6]="Abdul Kalam";
            
            op1[7]="Aishwarya Rai";
            op2[7]="Sushmita Sen";
            op3[7]="Reita Faria";
            op4[7]="Diya Mirza";
            
            
            op1[8]="Abdul Kalam";
            op2[8]="Lal Bahadur Shastri";
            op3[8]="Dr.Rajendra Prasad";
            op4[8]="Zakir Hussain";

            
            op1[9]="Dhan Gopal Mukerji";
            op2[9]="Arundhati Roy";
            op3[9]="Aravind Adiga";
            op4[9]="Nirad C.Chaudhuri";
                 
                
			f=new JFrame("Quiz Game");
			String name=JOptionPane.showInputDialog(f,"Enter your Name:-");
			JOptionPane.showMessageDialog(f,"Welcome "+name);
			t=new JTextField(q[0]);
			t.setBounds(20,20,350,30);
			t.setEditable(false);
			t.setBackground(Color.ORANGE);
			
			b1=new JButton(op1[0]);
			b1.setBounds(20,60,150,100);
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.YELLOW);
			
			b2=new JButton(op2[0]);
			b2.setBounds(190,60,150,100);
			b2.setBackground(Color.BLUE);
			b2.setForeground(Color.YELLOW);
			
			b3=new JButton(op3[0]);
			b3.setBounds(20,180,150,100);
			b3.setBackground(Color.BLUE);
			b3.setForeground(Color.YELLOW);
			
			b4=new JButton(op4[0]);
			b4.setBounds(190,180,150,100);
			b4.setBackground(Color.BLUE);
			b4.setForeground(Color.YELLOW);
			
			next=new JButton("Next");
			next.setBounds(230,300,100,30);
			next.setBackground(Color.CYAN);
			
			previous=new JButton("Previous");
			previous.setBounds(20,300,100,30);
			previous.setBackground(Color.CYAN);
			
			f.add(t);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(next);
			f.add(previous);
			
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
	        next.addActionListener(this);
	        previous.addActionListener(this);
			
			f.setSize(400,400);
			f.setLayout(null);
			f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(qno==0)
		{
			if(e.getSource()==b2)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
			}
		}
		
		if(qno==1)
		{
			if(e.getSource()==b1)
			{
				b2.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b1.setBackground(Color.GREEN);
				score++;
			}
			else
			{
				b2.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b1.setBackground(Color.GREEN);
			}
		}
		
		if(qno==2)
		{
			if(e.getSource()==b3)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==3)
		{
			if(e.getSource()==b4)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.GREEN);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.GREEN);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==4)
		{
			if(e.getSource()==b4)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.GREEN);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.GREEN);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==5)
		{
			if(e.getSource()==b2)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
			}
		}
		
		if(qno==6)
		{
			if(e.getSource()==b1)
			{
				b1.setBackground(Color.GREEN);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.GREEN);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==7)
		{
			if(e.getSource()==b3)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==8)
		{
			if(e.getSource()==b3)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.RED);
			}
		}
		
		if(qno==9)
		{
			if(e.getSource()==b2)
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
				score++;
			}
			else
			{
				b1.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b2.setBackground(Color.GREEN);
			}
		}
		
				
			
			if(e.getSource()==next)
            {
                qno++;
                if(qno==10)
                {
                    JOptionPane.showMessageDialog(f,"Test Completed ");
                    JOptionPane.showMessageDialog(f,"You Scored:"+score+" out of 10");
                    return;
                }
                            
                            
                t.setText(q[qno]); 
                opno1++;opno2++;
                opno3++;opno4++;
                
                b1.setText(op1[opno1]);
                b2.setText(op2[opno2]);
                b3.setText(op3[opno3]);
                b4.setText(op4[opno4]);
                
                b1.setBackground(Color.BLUE);
                b2.setBackground(Color.BLUE);
                b3.setBackground(Color.BLUE);
                b4.setBackground(Color.BLUE);
                            
                            
            }
			if(e.getSource()==previous)
			{
				qno--;
				t.setText(q[qno]); 
                opno1--;opno2--;
                opno3--;opno4--;
                
                b1.setText(op1[opno1]);
                b2.setText(op2[opno2]);
                b3.setText(op3[opno3]);
                b4.setText(op4[opno4]);
                
                b1.setBackground(Color.BLUE);
                b2.setBackground(Color.BLUE);
                b3.setBackground(Color.BLUE);
                b4.setBackground(Color.BLUE);
				if(qno<0)
				{
					JOptionPane.showMessageDialog(f,"This is very first Question.");
					return;
				}
				
			}
		
	}
	public static void main(String args[])
	{
		new MiniQuiz();
	}

}