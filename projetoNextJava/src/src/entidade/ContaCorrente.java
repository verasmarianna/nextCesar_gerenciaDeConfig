package entidade;

import java.io.Serializable;

public class ContaCorrente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numero;
    private Double saldo;
    private String nomeCorrentista;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, Double saldo, String nomeCorrentista) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }
        public String getNumero() {
            return numero;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }   
        public String getNomeCorrentista() {
            return nomeCorrentista;
        }
        public void setNomeCorrentista(String nomeCorrentista) {
            this.nomeCorrentista = nomeCorrentista;
        }
        public double getSaldo() {
            return saldo;
        }
        public void creditar(double valor) {
            saldo += valor;
        }
        public void debitar(double valor) {
            saldo -= valor;
        }
}

