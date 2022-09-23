import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Supermercado {

	private JFrame frame;
	private JTextField tf_qntd;
	private JLabel lb_qntd;
	private JComboBox combo_produto;
	private JButton bt_comprar, bt_cancelar;
	
	public Supermercado() {
		frame = new JFrame();
		frame.setTitle("Supermercado");
		frame.setSize(450,200);
		frame.setLocation(200,200);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel vazio = new JLabel();
		lb_qntd = new JLabel("Quantidade");
		tf_qntd = new JTextField(5);
		
		String [] produtos = {"Batata", "Cenoura", "Carne", "Frango", "Peixe", "Cadernos"};
		combo_produto = new JComboBox(produtos);
		
		bt_comprar = new JButton("Comprar");
		bt_cancelar = new JButton("Cancelar");
		
		frame.add(combo_produto);
		frame.add(vazio);
		frame.add(lb_qntd);
		frame.add(tf_qntd);
		frame.add(bt_comprar);
		frame.add(bt_cancelar);
		
	}
	
	public static void main(String [] args) {
		new Supermercado();
	}
	
	
}
