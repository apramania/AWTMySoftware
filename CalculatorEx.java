import java.awt.*;
import java.awt.event.*;
class CalculatorEx
{
	Button sum,minus,multi,div,equal,del;
	double cal=0.0;
	String data="",data1="";
	CalculatorEx()
	{
		Frame f=new Frame("Calculator");
		f.setBackground(Color.yellow);
		
		Image icon=Toolkit.getDefaultToolkit().getImage("calculator.png");
		f.setIconImage(icon);
		TextField tf1=new TextField();
		tf1.setBounds(50,50,50,20);
		tf1.setText(String.valueOf(cal));
		f.add(tf1);
		
		TextField tf2=new TextField();
		tf2.setBounds(120,50,50,20);
		tf2.setText("");
		f.add(tf2);
		
		sum = new Button("+");
		sum.setBackground(Color.orange);
		sum.setBounds(50,90,50,50);
		minus = new Button("-");
		minus.setBackground(Color.orange);
		minus.setBounds(120,90,50,50);
		multi = new Button("*");
		multi.setBackground(Color.orange);
		multi.setBounds(190,90,50,50);
		div = new Button("/");
		div.setBackground(Color.orange);
		div.setBounds(50,160,50,50);
		equal = new Button("=");
		equal.setBackground(Color.orange);
		equal.setBounds(120,160,50,50);
		del = new Button("C");
		del.setBackground(Color.orange);
		del.setBounds(190,160,50,50);
		
		f.add(sum);f.add(minus);f.add(multi);f.add(div);f.add(equal);f.add(del);
		
		sum.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double s = Double.parseDouble(tf1.getText());
				data1 = String.valueOf(cal) +"+"+ String.valueOf(s);
				data = data +"+"+ data1;
				cal = cal + s;
				
				tf2.setText(data1);
			}
		});
		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double s = Double.parseDouble(tf1.getText());
				data1 = String.valueOf(cal) +"-"+ String.valueOf(s);
				data = data +"-"+ data1;
				cal = cal - s;
				tf2.setText(data1);
			}
		});
		multi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double s = Double.parseDouble(tf1.getText());
				data1 = String.valueOf(cal) + String.valueOf(s);
				data = data + data1;
				cal = cal * s;
				tf2.setText(data1);
			}
		});
		div.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double s = Double.parseDouble(tf1.getText());
				data1 = String.valueOf(cal) + String.valueOf(s);
				data = data + data1;
				cal = cal / s;
				
				tf2.setText(data1);
			}
		});
		equal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				data = String.valueOf(cal);
				tf2.setText(data);
				tf1.setText(String.valueOf(cal));
			}
		});
		del.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				cal = 0.0;
				data1="";
				tf.setText(data1);
				tf1.setText(String.valueOf(cal));
			}
		});
		f.setSize(300,300);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				new Home();
				
				f.dispose();
			}
		});
		
	}
	public static void main(String args[])
	{
		new CalculatorEx();
	}
}
