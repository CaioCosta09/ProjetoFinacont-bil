package model;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class DadosDoUsuario extends JFrame{

 String NomeCompleto;
 String Cpf;
 String Telefone;
 String NomeDeUsuario;
 String Senha;
 
	
	
	
	public String getNomeCompleto() {
	return NomeCompleto;
}




public void setNomeCompleto(String nomeCompleto) {
	NomeCompleto = nomeCompleto;
}




public String getCpf() {
	return Cpf;
}




public void setCpf(String cpf) {
	Cpf = cpf;
}




public String getTelefone() {
	return Telefone;
}




public void setTelefone(String telefone) {
	Telefone = telefone;
}




public String getNomeDeUsuario() {
	return NomeDeUsuario;
}




public void setNomeDeUsuario(String nomeDeUsuario) {
	NomeDeUsuario = nomeDeUsuario;
}




public String getSenha() {
	return Senha;
}




public void setSenha(String senha) {
	Senha = senha;
}




	public DadosDoUsuario(String nomeCompleto, String cpf, String telefone, String nomeDeUsuario, String senha)
		throws HeadlessException {
	super();
	NomeCompleto = nomeCompleto;
	Cpf = cpf;
	Telefone = telefone;
	NomeDeUsuario = nomeDeUsuario;
	Senha = senha;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
