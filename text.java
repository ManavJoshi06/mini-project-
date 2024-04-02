import java.io.*;

import java.awt.*;

import java.awt.event.*;



public class text extends Frame implements ActionListener 
 
{ 
      
   TextArea tf1; 
 
   Button b1;

   
text()
   
 { 
         
   setLayout(new FlowLayout());
     
            tf1=new TextArea(100,80);
 
        add(tf1);
        

       b1=new Button("SAVE");
 
        add(b1);
      

    b1.addActionListener(this);

 }
 

 public void actionPerformed(ActionEvent e)
  
 {
      
File f1=new File("C:/manav/gaurav.txt");

try{
FileWriter fw=new FileWriter(f1);
 String data= tf1.getText();


for(int i=0;i<data.length();i++)
{
fw.write(data.charAt(i));

}
fw.close();
        }catch(Exception e1){}
}
public static void main(String args[])
{
text td=new text();
td.setSize(500,500);
td.setVisible(true);
}
 }