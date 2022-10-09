package TP5;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JList;

public class PanelListar extends JPanel {
	@SuppressWarnings("rawtypes")
	JList list;
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("rawtypes")
	public PanelListar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(28, 108, 88, 28);
		add(lblNewLabel);
		list = new JList();
		list.setBounds(102, 33, 298, 184);
		add(list);
		
		
	}
	
	@SuppressWarnings("unchecked")
	public void setListModel(DefaultListModel<Pelicula> ListModel) 
	{
		ArrayList <String> lista = new ArrayList();
		
		for (int i=0;i<ListModel.getSize();i++) {
			lista.add(ListModel.get(i).toString());
		}
		
		Collections.sort(lista);
		
		DefaultListModel<String> listaOrdenada = new DefaultListModel();
		
		for (String p: lista) {
			
			listaOrdenada.addElement(p); 
		}
		
		list.setModel(listaOrdenada);
		
	}
}
