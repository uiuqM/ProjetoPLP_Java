package Controller.Helper;

import model.Usuario;
import view.login;

public class loginHelper {
	private final login view;

	public loginHelper(login view) {
		this.view = view;
	}

	public Usuario obterModelo() {
		String nome = view.getCampoUusuario().getText();
		String senha = view.getCampoSenha().getText();

		Usuario usuario = new Usuario(0, nome, senha);
		
		return usuario;
	}
	
	public void setarModelo(Usuario usuario) {
		String nome = usuario.getNome();
		String senha = usuario.getSenha();
		
		view.getCampoUusuario().setText(nome);
		view.getCampoSenha().setText(senha);
	}
	
	public void limpaTela() {
		view.getCampoUusuario().setText("");
		view.getCampoSenha().setText("");
	}
}
