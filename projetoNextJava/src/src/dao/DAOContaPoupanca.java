package dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;
import entidade.ContaPoupanca;

public class DAOContaPoupanca {
	private CadastroObjetos cadastro = new CadastroObjetos(ContaPoupanca.class);
	public boolean incluir(ContaPoupanca conta) {
		ContaPoupanca contaBusca = buscar(conta.getNumero());
		if (contaBusca != null) {
			return false;
		} else {
			cadastro.incluir(conta, conta.getNumero());
			return true;
		}		
	}
	public ContaPoupanca buscar (String codigo){
		return (ContaPoupanca) cadastro.buscar(codigo);
	}
	public boolean alterar(ContaPoupanca conta) {
		ContaPoupanca contaBusca = buscar(conta.getNumero());
		if (contaBusca == null) {
			return false;
		} else {
			cadastro.alterar(conta, conta.getNumero());
			return true;
		}		
	}

	public ContaPoupanca[] buscarTodos() {
		Serializable[] rets = cadastro.buscarTodos(ContaPoupanca.class);
		ContaPoupanca[] contas = new ContaPoupanca[rets.length];
		for(int i=0; i<rets.length; i++) {
			contas[i] = (ContaPoupanca)rets[i];
		}
		return contas;
	}
}
