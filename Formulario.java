import javax.swing.*;//Esta libreria me permite importar los elementos para formar mi interfaz
//uso la Herencia con "extends" para utilizar codigo ya hecho y que viene con el JDK
public class Formulario extends JFrame{//"JFrame" me permite crear el contenedor donde van a ir todos los elementos
    private JLabel label1;//Creo un nuevo objeto etiqueta y lo hago privado con el modificador de acceso "private"

    public Formulario(){//constructor del diseño de la etiqueta
        setLayout(null);//nos permite indicar las coordenadas donde queremos ubicar los elementos en la interfaz 
        //ponemos null para evitar que los ponga donde el programa quiera 
        label1 = new JLabel("La Geekpedia de Ernesto");//
        label1.setBounds(10, 20, 200, 300);//defino las coordenadas en ejes(x, y), anchura y altura de la etiqueta

        add(label1);
    }
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();//creo el objeto
        formulario1.setBounds(0, 0, 400, 300);//creo el frame en medio de la pantalla
        formulario1.setVisible(true);//le digo que sea visible con true
        formulario1.setLocationRelativeTo(null);//le digo que en el momento de ejecutarlo salga en medio de la pantalla

    }
}
    
