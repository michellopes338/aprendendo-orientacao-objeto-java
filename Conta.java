/**
 * Conta
 */
public class Conta {

    double saldo = 100;
    int agencia;
    int numero_conta;
    Cliente titular = new Cliente();

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        boolean deuCerto = this.saca(valor);
        if (deuCerto) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}