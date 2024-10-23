public abstract class vehiculo {
    protected String marca;
    protected  String modelo;
    protected String combustible;

    public vehiculo(String combustible, String marca, String modelo) {
        this.combustible = combustible;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void abastecerCombustible(double litros){
        System.out.println( "El abastecimiento del combustible es de "+combustible );
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract  void mostrarInformacion();

}
