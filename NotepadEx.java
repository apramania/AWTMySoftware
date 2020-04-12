import java.awt.*;
import java.awt.event.*;
import java.io.*;
class NotepadEx
{
	TextField tf;
	TextArea ta;
	NotepadEx()
	{
		Frame f=new Frame("Writepad");
		ta=new TextArea();
		ta.setBounds(20,60,680,640);
		MenuBar mb=new MenuBar();
		Menu m=new Menu("File");
		MenuItem i1=new MenuItem("Save");
		MenuItem i2=new MenuItem("Close");
		m.add(i1);
		m.add(i2);
		mb.add(m);
		
		
		
		
		f.setMenuBar(mb);f.add(ta);
		f.setSize(720,720);
		f.setResizable(false);
		f.setLayout(null);
		f.setVisible(true);
		
		i2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if("Close".equals(e.getActionCommand()))
				{
					new Home();
					f.dispose();
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				new Home();
				
				f.dispose();
			}
		});
		
		i1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if("Save".equals(e.getActionCommand())){
					
					String s = ta.getText();
					String name = s.split(" ")[0];
					String data = s;
					name=name+".txt";
					try
					{
						FileOutputStream fout=new FileOutputStream(name);
						byte b[]=data.getBytes();
						fout.write(b);
					}catch(Exception c){}
				}
			}
		});
					
		
	}
	public static void main(String args[])
	{
		new NotepadEx();
	}
}

		