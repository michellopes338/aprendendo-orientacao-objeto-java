

/**
 * CriaConta
 */
public class CriaConta {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        minhaConta.deposita(200);
        minhaConta.deposita(10);
        minhaConta.transfere(100, outraConta);

        System.out.println(minhaConta.saldo);
        System.out.println(outraConta.saldo);
    }
}