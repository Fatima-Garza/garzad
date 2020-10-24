package puzzleswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.*;  
import java.awt.*;  
import javax.swing.JOptionPane; 
public class puzzle extends Frame implements ActionListener
{  
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;  









puzzle()
{  
    super("Juego Rompecabezas");  
    btn1=new Button("1");  
    btn1.setBounds(50,100,40,40);  
    btn2=new Button("2");  
    btn2.setBounds(100,100,40,40);  
    btn3=new Button("3");  
    btn3.setBounds(150,100,40,40);  
    btn4=new Button("4");  
    btn4.setBounds(50,150,40,40);  
    btn5=new Button("5");  
    btn5.setBounds(100,150,40,40);  
    btn6=new Button("6");  
    btn6.setBounds(150,150,40,40);  
    btn7=new Button("7");  
    btn7.setBounds(50,200,40,40);  
    btn8=new Button("");  
    btn8.setBounds(100,200,40,40);  
    btn9=new Button("8");  
    btn9.setBounds(150,200,40,40);  
   
   
     
      
    btn1.addActionListener(this);  
    btn2.addActionListener(this);  
    btn3.addActionListener(this);  
    btn4.addActionListener(this);  
    btn5.addActionListener(this);  
    btn6.addActionListener(this);  
    btn7.addActionListener(this);  
    btn8.addActionListener(this);  
    btn9.addActionListener(this);  
      
    add(btn1);add(btn2);add(btn3);add(btn4);add(btn5);add(btn6);add(btn7);add(btn8);add(btn9);  
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e)
{  
    if(e.getSource()==btn1){  
        String label=btn1.getLabel();  
        if(btn2.getLabel().equals(""))
        {  
            btn2.setLabel(label);  
            btn1.setLabel("");  
        }  
        if(btn4.getLabel().equals(""))
        {  
            btn4.setLabel(label);  
            btn1.setLabel("");  
        }  
    }  
    if(e.getSource()==btn2){  
        String label=btn2.getLabel();  
      if(btn1.getLabel().equals(""))
      {  
            btn1.setLabel(label);  
            btn2.setLabel("");  
        }  
        if(btn3.getLabel().equals(""))
        {  
            btn3.setLabel(label);  
            btn2.setLabel("");  
        }  
        if(btn5.getLabel().equals(""))
        {  
            btn5.setLabel(label);  
            btn2.setLabel("");  
        }  
    }  
    if(e.getSource()==btn3)
    {  
        String label=btn3.getLabel();  
        if(btn2.getLabel().equals(""))
        {  
            btn2.setLabel(label);  
            btn3.setLabel("");  
        }  
        if(btn6.getLabel().equals(""))
        {  
            btn6.setLabel(label);  
            btn3.setLabel("");  
        }  
    }  
    if(e.getSource()==btn4)
    {  
        String label=btn4.getLabel();  
        if(btn1.getLabel().equals(""))
        {  
            btn1.setLabel(label);  
            btn4.setLabel("");  
        }  
        if(btn7.getLabel().equals(""))
        {  
            btn7.setLabel(label);  
            btn4.setLabel("");  
        }  
        if(btn5.getLabel().equals(""))
        {  
            btn5.setLabel(label);  
            btn4.setLabel("");  
        }  
    }  
    if(e.getSource()==btn5){  
        String label=btn5.getLabel();  
        if(btn2.getLabel().equals(""))
        {  
            btn2.setLabel(label);  
            btn5.setLabel("");  
        }  
        if(btn6.getLabel().equals(""))
        {  
            btn6.setLabel(label);  
            btn5.setLabel("");  
        }  
        if(btn4.getLabel().equals(""))
        {  
            btn4.setLabel(label);  
            btn5.setLabel("");  
        }  
        if(btn8.getLabel().equals(""))
        {  
            btn8.setLabel(label);  
            btn5.setLabel("");  
        }  
    }  
    if(e.getSource()==btn6){  
        String label=btn6.getLabel();  
        if(btn9.getLabel().equals(""))
        {  
            btn9.setLabel(label);  
            btn6.setLabel("");  
        }  
        if(btn3.getLabel().equals(""))
        {  
            btn3.setLabel(label);  
            btn6.setLabel("");  
        }  
        if(btn5.getLabel().equals(""))
        {  
            btn5.setLabel(label);  
            btn6.setLabel("");  
        }  
    }  
    if(e.getSource()==btn7){  
        String label=btn7.getLabel();  
        if(btn4.getLabel().equals(""))
        {  
            btn4.setLabel(label);  
            btn7.setLabel("");  
        }  
        if(btn8.getLabel().equals(""))
        {  
            btn8.setLabel(label);  
            btn7.setLabel("");  
        }  
    }  
    if(e.getSource()==btn8){  
        String label=btn8.getLabel();  
        if(btn9.getLabel().equals(""))
        {  
            btn9.setLabel(label);  
            btn8.setLabel("");  
        }  
        if(btn7.getLabel().equals(""))
        {  
            btn7.setLabel(label);  
            btn8.setLabel("");  
        }  
        if(btn5.getLabel().equals(""))
        {  
            btn5.setLabel(label);  
            btn8.setLabel("");  
        }  
    }  
    if(e.getSource()==btn9)
    {  
        String label=btn9.getLabel();  
        if(btn6.getLabel().equals(""))
        {  
            btn6.setLabel(label);  
            btn9.setLabel("");  
        }  
        if(btn8.getLabel().equals(""))
        {  
            btn8.setLabel(label);  
            btn9.setLabel("");  
        }  
        
        
    }  
      
    
    if(btn1.getLabel().equals("1")&&btn2.getLabel().equals("2")&&btn3.getLabel()    
            .equals("3")&&btn4.getLabel().equals("4")&&btn5.getLabel().equals("5")    
            &&btn6.getLabel().equals("6")&&btn7.getLabel().equals("7")&&btn8.getLabel()    
            .equals("8")&&btn9.getLabel().equals(""))
    {     
            JOptionPane.showMessageDialog(this,"Felicidades ganaste"); 
            JOptionPane.showMessageDialog(null, "Exit");
            System.exit(0);
    }    
}  
public static void main(String[] args) 
{  
    new puzzle();  
}

}
