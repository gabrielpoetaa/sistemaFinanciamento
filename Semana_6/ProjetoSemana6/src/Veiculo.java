public abstract class Veiculo {

    // Atributos

    protected String marca;
    protected String motor;

    // Contrutor

    public Veiculo (String marcaDoVeiculo, String motorDoVeiculo){
        this.marca = marcaDoVeiculo;
        this.motor = motorDoVeiculo;
    }

    // Metodos

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public abstract void getDetalhes();

}
