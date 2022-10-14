/**
 * Conta
 */
public class Conta {

    double saldo;
    int agencia;
    int numero_conta;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }
}