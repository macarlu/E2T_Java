import javax.swing.*;

public class formularioDos extends JFrame{
    private JLabel label1;
    private JLabel label2;

    public formularioDos(){
        setLayout(null);
        label1 = new JLabel("Interfaz gráfica");
        label1.setBounds(10,20, 300, 30);
        add(label1);//le digo que agregue a la etiqueta todo lo anterior
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100, 100, 30);
        add(label2);
    }

    public static void main(String[] args) {
        formularioDos formularioDos1 = new formularioDos();
        formularioDos1.setBounds(0, 0, 300, 200);
        formularioDos1.setResizable(false);
        formularioDos1.setVisible(true);
        formularioDos1.setLocationRelativeTo(null);
            }
    

}
