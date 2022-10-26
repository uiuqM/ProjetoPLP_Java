package Controller;

import view.Agenda;
import view.MenuPrincipal;

public class menuPrincipalController {
	private final MenuPrincipal view;
	
	public menuPrincipalController(MenuPrincipal view) {
		this.view = view;
	}
	
	public void navigateSchedule() {
		Agenda agenda = new Agenda();
		agenda.setVisible(true);
		this.view.dispose();
	}
}
