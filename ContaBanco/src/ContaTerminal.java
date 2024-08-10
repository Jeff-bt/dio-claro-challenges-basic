public class ContaTerminal {
    private int numero;
    private String agencia;
    private String NomeCliente;
    private Double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.NomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  """
                \nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.
                """
                .formatted(NomeCliente, agencia, numero, saldo);

    }



    
}
