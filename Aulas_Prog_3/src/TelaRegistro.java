
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TelaRegistro {
 
    private JLabel jlnome, jlnum,jlmorada, jlcell, jlopcoes, jltipoconta, jlgenero, jllistaclientes;
    private JTextField txtnome, txtmorada, txtcell,txtnum, txtnumero;
    private JButton btNovo, btGravar, btRemover, btEstatistica;
    private JRadioButton rbCorrente, rbPrazo, rbFemenino, rbMasculino;
    private JList ListaClientes;
    private JPanel pnPrincipal, PnDados, pnBts, pnRadios, pnLista;
    
    private JFrame fr;

    public TelaRegistro() {
        
        fr = new JFrame();
        fr.setTitle("Registro de  clientes");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocation(400, 400);
        fr.setSize(400, 400);
      //fr.setLocation(0, 0);
        fr.setResizable(false);
        fr.setLayout(new BorderLayout(2,2));
        
        pnPrincipal = new JPanel();
        pnPrincipal.setLayout(new BorderLayout(2,2));
        
         //Criacao do Painel de Dados
        PnDados = new JPanel();
        PnDados.setLayout(new GridLayout(4,1));
        
        jlnum  = new JLabel("nmr");
        txtnum = new JTextField();
        txtnum.setEditable(false);
        
        jlnome = new JLabel("Nome");
        txtnome = new JTextField();
        
        jlmorada = new JLabel("Morada");
        txtmorada  = new JTextField();
        
        jlcell = new JLabel("Telemovel");
       txtcell = new JTextField();
       
      
       PnDados.add(jlnum);
       PnDados.add(txtnum);
       PnDados.add(jlnome);
       PnDados.add(txtnome);
       PnDados.add(jlmorada);
       PnDados.add(txtmorada);
       PnDados.add(jlcell);
       PnDados.add(txtcell);
       pnPrincipal.add(PnDados, BorderLayout.CENTER);
       
       //fim do painel de dados
       
       //criacao do painel de opcoes
       pnBts = new JPanel();
       pnBts.setLayout(new GridLayout(4,1));
       
       btNovo = new JButton("novo");
       btGravar = new JButton("gravar");
       btRemover = new JButton("Remover");
       btEstatistica = new JButton("Estatistica");
       pnBts.add(btNovo);
       pnBts.add(btGravar);
       pnBts.add(btRemover);
       pnBts.add(btEstatistica);
       pnPrincipal.add(pnBts, BorderLayout.EAST);
       //fim do painel de opcoes

       fr.add(pnPrincipal, BorderLayout.CENTER);
       
       fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new TelaRegistro();
    }
    
    
}
