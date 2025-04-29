import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class formularioSeis extends JFrame{//al no esperar eventos no pongo "inplements ActionListener"
    private JTextField textField1;
    private JTextArea textArea1;

    public formularioSeis(){
        setLayout(null);

        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);

        textArea1 = new JTextArea();
        textArea1.setBounds(10,50,400,300);
        add(textArea1);
    }
    public static void main(String[] args) {
        formularioSeis formularioSeis1 = new formularioSeis();
        formularioSeis1.setBounds(0,0,540,400);
        formularioSeis1.setVisible(true);
        formularioSeis1.setResizable(false);
        formularioSeis1.setLocationRelativeTo(null);
    }
}
