public class Veiculo {

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

    public void getDetalhes() {
        System.out.println("A marca do veiculo e " + getMarca() + ", e o motor e " + getMotor());
    }

    public void getSom(){
        System.out.println("Os veiculos podem ser bem berulhentos ou bem silencionsos. Depende do que voce quer");
    }
}
