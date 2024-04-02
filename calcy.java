/* 
   <applet code="calcy" Width="500" Height="500" />
   </applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class calcy extends Applet implements ActionListener 
 { 
    Label l1,l2,l3;
    TextField tf1,tf2,tf3; 
    Button b1,b2,b3,b4,b5,b6;
    
    public void init()
    { 
         setLayout(new FlowLayout());
         l1=new Label("fnum");
         add(l1);
        
         setLayout(new FlowLayout());
         tf1=new TextField(20);
         add(tf1);
          setLayout(new FlowLayout());
         l2=new Label("snum");
         add(l2);
         tf2=new TextField(20);
         add(tf2);
         l3=new Label("result");
         add(l3);
         tf3=new TextField(20);
         add(tf3);
         b1=new Button("+");
         add(b1);
         b2=new Button("-");
         add(b2);
         b3=new Button("*");
         add(b3);
         b4=new Button("/");
         add(b4);
         b5=new Button("%");
         add(b5);
         b6=new Button("clear");
         add(b6);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
         String name=tf1.getText();
         if(e.getSource()==b1)
         {
           int num1=Integer.parseInt(tf1.getText());
           int num2=Integer.parseInt(tf2.getText());
           int result=num1+num2;
           tf3.setText(Integer.toString(result));
          
         }
       else if(e.getSource()==b2)
         {
           int num1=Integer.parseInt(tf1.getText());
           int num2=Integer.parseInt(tf2.getText());
           int result=num1-num2;
           tf3.setText(Integer.toString(result));
          
         }
      else if(e.getSource()==b3)
         {
           int num1=Integer.parseInt(tf1.getText());
           int num2=Integer.parseInt(tf2.getText());
           int result=num1*num2;
           tf3.setText(Integer.toString(result));
          
         }
      else if(e.getSource()==b4)
         {
           int num1=Integer.parseInt(tf1.getText());
           int num2=Integer.parseInt(tf2.getText());
           int result=num1/num2;
           tf3.setText(Integer.toString(result));
          
         }
      else if(e.getSource()==b5) 
         {
           int num1=Integer.parseInt(tf1.getText());
           int num2=Integer.parseInt(tf2.getText());
           int result=num1%num2;
           tf3.setText(Integer.toString(result));
          
         }
         else
         {  
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");  
         }
     }
}