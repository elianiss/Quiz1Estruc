public class carro extends vehiculo{


    public carro(String combustible, String marca, String modelo) {
        super(combustible, marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("el carro esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("el carro esta apagado .");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }

}
