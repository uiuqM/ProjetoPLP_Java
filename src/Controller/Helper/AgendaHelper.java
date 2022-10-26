package Controller.Helper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Agendamento;
import view.Agenda;

public class AgendaHelper {
	private final Agenda view;
	
	public AgendaHelper(Agenda view) {
		this.view = view;
	}

	public void fillTable(ArrayList<Agendamento> listaAgenda) {
		DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
		
		tableModel.setNumRows(0);
		
		//percorre lista preenche tableModel;
		
		for (Agendamento agendamento : listaAgenda) {
			tableModel.addRow(new Object[]{
				agendamento.getId(),
				agendamento.getCliente().getNome(),
				agendamento.getServico().getDescricao(),
				agendamento.getValor(),
				agendamento.getData(),
				agendamento.getData(),
				agendamento.getObservacao()
			});
		}
	}
	
}
