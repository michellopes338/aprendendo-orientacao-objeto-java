

/**
 * CriaConta
 */
public class CriaConta {

    public static void main(String[] args) {
        Conta minhaConta = new Conta(1337, 8082);
        Conta outraConta = new Conta(1337, 8083);
        Cliente michel = new Cliente();

        minhaConta.deposita(200);
        minhaConta.deposita(10);
        minhaConta.transfere(100, outraConta);

        michel.nome = "Michel Lopes Cruz";
        System.out.println(minhaConta.getNumero());
        minhaConta.setNumero(1337);
        System.out.println(minhaConta.getNumero());
        minhaConta.setTitular(michel);
        System.out.println(Conta.getTotalDeContas());
    }
}