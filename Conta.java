/**
 * Conta
 */
public class Conta {

    private double saldo = 100;
    private int agencia;
    private int numero_conta;
    private Cliente titular = new Cliente();
    private static int totalDeContas;

    public Conta(int agencia, int numero_conta) {
        this.setAgencia(agencia);
        this.setNumero(numero_conta);
        totalDeContas++;
        System.out.println(totalDeContas);
    }

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

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero_conta;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0) {
            return;
        }
        this.numero_conta = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }
}