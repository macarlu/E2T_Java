public class CocheClase {
    String marca;
    String modelo;
    int velocidad;

    public CocheClase(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public CocheClase(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }   
    public static void main(String args[]){

        CocheClase coche1 = new CocheClase("Ford", "Focus", 150);
        CocheClase coche2 = new CocheClase("Seat", "Ateca");
        coche1.mostrarInfo();
        System.out.println("");
        coche2.mostrarInfo();
        System.out.println(coche1);
    }

    @Override
    public String toString() {
        return "CocheClase [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
    }
}
