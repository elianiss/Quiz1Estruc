public class carroElectrico extends vehiculo implements vehiculoelectrico {

    private int bateria;

    public carroElectrico(String combustible, String marca, String modelo, int bateria) {
        super(combustible, marca, modelo);
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
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

    @Override
    public int nivelBateria() {
        return bateria;
    }

    @Override
    public double cargarbateria() {
        System.out.println("la bateria esta cargada al 100%");
        return 0 ;
    }

}



