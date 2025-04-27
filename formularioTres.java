import javax.swing.*;//Esta libreria me permite importar los elementos para formar mi interfaz
import java.awt.event.*;//Esta libreria me permite dar funcionalidad a esos elementos

//con "implements" "ActionListener" le digo al programa que este atento a los eventos que se van a dar en el programa
public class formularioTres extends JFrame implements ActionListener{
    JButton button1;//creo el botón
    //los botones se diseñan en dos partes:
    //Primero: la interfaz gráfica del botón
    public formularioTres(){
        setLayout(null);
        button1 = new JButton("Cerrar");
        button1.setBounds(300, 250, 100, 30);
        add(button1);
        button1.addActionListener(this);//"this", este es el objeto que va a ser el evento 
        }
    //Segundo: la funcionalidad asignada al botón
    public void actionPerformed(ActionEvent e){//el evento se guarde en el espacio en memoria "e"
        //se recupera el valor de "e" con el metodo "getSource()" y se compara con el evento asignado a nuestro boton
        if (e.getSource() == button1){//si coincide,
            System.exit(0);//al pulsar en el boton se cierra la interfaz gráfica
        }
    }
    public static void main(String[] args){
        formularioTres formularioTres1 = new formularioTres();
        formularioTres1.setBounds(0, 0, 450, 350);
        formularioTres1.setVisible(true);
        formularioTres1.setResizable(false);
        formularioTres1.setLocationRelativeTo(null);

    }
}
