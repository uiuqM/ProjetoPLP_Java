package Controller;

import java.util.ArrayList;

import Controller.Helper.AgendaHelper;
import model.Agendamento;
import model.DAO.AgendamentoDAO;
import view.Agenda;

public class AgendaController {
	private final Agenda view;
	private final AgendaHelper helper;
	
	public AgendaController(Agenda view) {
		this.view = view;
		this.helper = new AgendaHelper(view);
	}
	
	public void updateTable() {
		//pega lista com agendamento;
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> listaAgenda = agendamentoDAO.selectAll();
		
		//exibir lista na view;
		helper.fillTable(listaAgenda);
		
		
	}
}
