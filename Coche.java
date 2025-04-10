public class Coche {
    String marca;
    String modelo;
    int velocidad;

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }   
    public static void main(String args[]){
        System.out.println("");
        Coche coche1 = new Coche();
        coche1.marca = "Ford";
        coche1.modelo = "Focus";
        coche1.velocidad = 150;

        Coche coche2 = new Coche();
        coche2.marca = "Toyota";
        coche2.modelo = "Corolla";
        coche2.velocidad = 120;

        coche1.mostrarInfo();
        System.out.println("");
        coche2.mostrarInfo();
    }
}