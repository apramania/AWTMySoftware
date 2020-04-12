import java.awt.*;
import java.awt.event.*;
public class Home extends Panel
{
	Image img;
	Label l;
	public Home()
	{
		Frame f=new Frame("Home Page");
		// f.setBackground(Color.gray);
		img=Toolkit.getDefaultToolkit().createImage("F:/JavaNptel/Nptel/AWT/AWT_Project/calculator.jpeg");
		l=new Label("     WELCOME TO MY_SOFTWARE");
		
		l.setBounds(80,15,200,50);
		Button b1=new Button("Calculator");
		b1.setBounds(50,100,100,100);
		b1.setBackground(Color.cyan);
		
		Button b2=new Button("Writepad");
		b2.setBounds(180,100,100,100);
		b2.setBackground(Color.cyan);
		f.add(l);f.add(b1);f.add(b2);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new CalculatorEx();
				f.setVisible(false);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new NotepadEx();
				f.setVisible(false);
			}
		});
		
		f.setSize(350,300);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				
				
				f.dispose();
			}
		});
	}
	public void paint(Graphics g)
	{
		
		g.drawImage(img,0,0,null);
	}
	
	public static void main(String args[])
	{
		new Home();
	}
}

		
		// Button b2=new Button("Word Counter");