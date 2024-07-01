public class ContaCorrente {
    private double saldo;

    public double getSaldo (){
        return this.saldo;
    }
    public ContaCorrente (double saldoinicial){
        this.saldo = saldoinicial;
    }

    public void sacar(double valor){
        try{
            if (this.saldo - valor < 0) {
                throw new SaldoInsuficienteException(
                        String.format("Voce esta tentando sacar o " +
                                "valor R$ %.2f, mas voce tem R$ $ %.2f na conta", valor, this.saldo));
            }
        } catch (SaldoInsuficienteException e) {
        System.out.println(e.getMessage());
        valor = 0;
        return;
        } finally {
            this.saldo -= valor;
        }

    }
}
