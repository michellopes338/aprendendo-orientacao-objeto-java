

/**
 * CriaConta
 */
public class CriaConta {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(200);
        minhaConta.deposita(10);

        System.out.println(minhaConta.saldo);
    }
}