import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public abstract class GUI2 implements ActionListener{
        
        private static JFrame frame;        
        private static JPanel panel;
        private static JLabel label;
        private static JButton button;
        private static JButton button2;
        private static JLabel label2;

        public static void main(String[] args){
        
        panel =new JPanel();

        frame =new JFrame("Password and Otp Generator");
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);

        label = new JLabel("");
        label.setBounds(10,200,80,45);
        panel.add(label);
        
        label2 = new JLabel("");
        label2.setBounds(180,200,80,45);
        panel.add(label2);

        button= new JButton("PASSWORD");
        button.setBounds(10,80,150,40);
        button.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Generating password using random() : "); 
                String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
                String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
                String numbers = "0123456789"; 
                String symbols = "!@#$%^&*_=+-/.?<>)"; 
  
                String values = Capital_chars + Small_chars + 
                                numbers + symbols; 
  
                Random rndm_method = new Random(); 
  
                char[] password = new char[8]; 
  
             for (int i = 0; i < 8; i++) 
             { 
                 password[i] = 
                     values.charAt(rndm_method.nextInt(values.length())); 
  
             }
                String s1=String.valueOf(password);
                label.setText(s1); 
        }
    }
);
            panel.add(button);

        button2= new JButton("OTP");
        button2.setBounds(180,80,150,40);
        button2.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){  
            System.out.println("Generating OTP using random() : "); 

      String numbers = "0123456789"; 
    
      Random rndm_method = new Random(); 

      char[] otp = new char[4]; 

      for (int i = 0; i < 4; i++) 
      { 
       otp[i] = 
       numbers.charAt(rndm_method.nextInt(numbers.length())); 
      }
            String s=String.valueOf(otp); 
      label2.setText(s);
        }
    }
);
            panel.add(button2);
        

            frame.setVisible(true);
            }
           }