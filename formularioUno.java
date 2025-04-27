import javax.swing.*;

public class formularioUno extends JFrame{
    
    public formularioUno(){
        setLayout(null);
    }
    public static void main(String[] args) {
        formularioUno formularioUno1 = new formularioUno();
        formularioUno1.setBounds(0, 0, 400, 550);
        formularioUno1.setVisible(true);
        formularioUno1.setLocationRelativeTo(null);
        formularioUno1.setResizable(false);//no permito que el usuario redimensione el frame
    }
}

