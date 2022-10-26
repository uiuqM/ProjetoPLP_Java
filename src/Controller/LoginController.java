package Controller;

import Controller.Helper.loginHelper;
import model.Usuario;
import model.DAO.UsuarioDAO;
import view.MenuPrincipal;
import view.login;

public class LoginController {
	private final login view;
	private final loginHelper helper;
	
	public LoginController(login view) {
		this.view = view;
		this.helper = new loginHelper(view);
	}
	
	public void ActionButton() {
		this.view.showMessage("clicou no botão");
	}
	
	public void loginSys() {
		//Recebe usuario view;
		Usuario usuario = helper.obterModelo();
		//Pesquisa usuario no banco;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuarioAut = usuarioDAO.selectPorNomeESenha(usuario);
		
		if(usuarioAut != null) {
			//entra menu principal.
			MenuPrincipal menu = new MenuPrincipal();
			menu.setVisible(true);
			this.view.dispose();
		} else {
			view.showMessage("Usuario ou senha invalidos!");
		}
		//usuario no banco vai p menu;
		//se não usuario inexistente.
		
	}
}
