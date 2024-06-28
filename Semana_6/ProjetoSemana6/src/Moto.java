public class Moto extends Veiculo implements FuncoesUsuario, RegistroSistema {

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

    public void getDetalhes() {
        System.out.println("A moto tem " + this.cilindradas + " cilindradas");
    }

    public void mostrarResumoDoVeiculo () {
        System.out.println("Essa eh uma mensagem aleatoria de resumo do veiculo");
    }

    public int mostrarIdadeVeiulo () {
        return 1;
    }

    public String retornarMensagemResumoVeiculo () {
        return "Mensagem aleatoria de resumo";
    }

    public void mostrarMensagemConfirmacaoCadastroVeiculoSistema() {
        System.out.println("Mensagem aleatoria");
    }

    public void mostrarLogCadastroVeiculoSistema() {
        System.out.println("Mensagem aleatoria");
    }

    public void getSom (){
        System.out.println("As motos nao sao barulhentas");
    }


}
