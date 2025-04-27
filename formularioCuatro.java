import javax.swing.*;
import java.awt.event.*;

public class formularioCuatro extends JFrame implements ActionListener{
    private JButton button1, button2, button3;
    private JLabel label1;

    public formularioCuatro(){

        setLayout(null);

        button1 = new JButton("1");
        button1.setBounds(10, 100, 90, 30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(115, 100, 90, 30);
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(220, 100, 90, 30);
        add(button3);
        button3.addActionListener(this);

        label1 = new JLabel("En espera...");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
        }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            label1.setText("Has presionado el botón1");
        }
        if(e.getSource() == button2){
            label1.setText("Has presionado el botón2");
        }
        if(e.getSource() == button3){
            label1.setText("Has presionado el botón3");
        }
    }
    public static void main(String[] args){
        formularioCuatro formularioCuatro1 = new formularioCuatro();
        formularioCuatro1.setBounds(0, 0, 350, 200);
        formularioCuatro1.setVisible(true);
        formularioCuatro1.setResizable(false);
        formularioCuatro1.setLocationRelativeTo(null);
    }
}

