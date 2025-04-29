import javax.swing.*;
import java.awt.event.*;

public class formularioCinco extends JFrame implements ActionListener{
    private JTextField textField1;
    private JLabel label1;
    private JButton button1;

    public formularioCinco(){
        setLayout(null);

        label1 = new JLabel("Usuario");
        label1.setBounds(20, 10, 100, 30);
        add(label1);
        
        textField1 = new JTextField();//creo el campo de texto
        textField1.setBounds(120,17,150,20);//le doy forma
        add(textField1);//y lo añado a mi objeto

        button1 = new JButton("Aceptar");
        button1.setBounds(20,70,100, 30);
        add(button1);
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        //se recupera el valor de "e" con el metodo "getSource()" y se compara con el evento asignado a nuestro boton
        if(e.getSource() == button1){//si coincide
            //creo una variable de tipo string con el valor de "textField1" con el metodo "getText()" recupero el texto
            //que el usuario ha escrito en el campo de texto "textField1"
            String texto = textField1.getText();
            setTitle(texto);//le digo que el valor de la variable la ponga como titulo de la ventana
        }
    }
    public static void main(String[] args) {
        formularioCinco formularioCinco1 = new formularioCinco();
        formularioCinco1.setBounds(0,0,300,150);
        formularioCinco1.setVisible(true);
        formularioCinco1.setResizable(false);
        formularioCinco1.setLocationRelativeTo(null);
    }
}
