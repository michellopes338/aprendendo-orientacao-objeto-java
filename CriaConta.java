

/**
 * CriaConta
 */
public class CriaConta {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        Cliente michel = new Cliente();

        minhaConta.deposita(200);
        minhaConta.deposita(10);
        minhaConta.transfere(100, outraConta);

        michel.nome = "Michel Lopes Cruz";
        System.out.println(minhaConta.getNumero());
        minhaConta.setNumero(1337);
        System.out.println(minhaConta.getNumero());
        minhaConta.setTitular(michel);
    }
}