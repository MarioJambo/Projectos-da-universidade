
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exercicio4  implements ActionListener extends JFrame{

	private JRadioButton rbG1,rbFLow;
	private JButton bt1, bt2, bt3;
	private ButtonGroup group;
	private JPanel panelFlow, panelGrid;
	
	public Exercicio4() {
		// TODO Auto-generated constructor stub
	
	this.setTitle("Exercio 4 Tela Dinamica");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(150,150);
		this.setLayout(new BorderLayout());
		
		rbFLow = new JRadioButton("FLowLayout");
		rbG1 = new JRadioButton("GridLayout");
		
		group =new ButtonGroup();
		group.add(rbFLow);
		group.add(rbG1);
		
		bt1 = new JButton("Botao 1");
		bt2 = new JButton("Botao 2");
		bt3 = new JButton("Botao 3");
		
		
		panelFlow = new JPanel();
		panelFlow.setLayout(new FlowLayout());
		panelFlow.add(bt1);
		panelFlow.add(bt2);
		panelFlow.add(bt3);
		
		
		panelGrid = new JPanel();
		panelGrid.setLayout(new FlowLayout());
		panelGrid.add(rbFLow);
		panelGrid.add(rbG1);
		
		this.add("South",panel1);
		this.add("North",panel2);
		
		
		this.setVisible(true);
		
		rbFLow.addActionListener(this);
		rbG1.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercicio4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(rbG1.isSelected()) {
			panelFlow.setLayout(new GridLayout(3,1));
			panelFlow.updateUI();
		}
		if(rbFLow.isSelected()) {
			panelFlow.setLayout(new FlowLayout());
			panelFlow.updateUI();
		}
		
	}

}
