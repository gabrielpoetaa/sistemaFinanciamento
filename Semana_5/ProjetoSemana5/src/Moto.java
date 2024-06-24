public class Moto extends Veiculo{

    // Atributos
    public String marca;
    private int cilindradas;

    // Construtor

    public Moto(String marcaDaMoto, String motorDaMoto, int cilindradas){
        super( marcaDaMoto,motorDaMoto);
        this.marca = marcaDaMoto;
        this.cilindradas = cilindradas;
    }

    // Metodos

    public int getCilindradas() {
        return cilindradas;
    }



}
