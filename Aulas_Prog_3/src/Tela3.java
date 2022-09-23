
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Tela3 {
    
    private JButton bt1, bt2, bt3;//CRIA BUTOES
    private JPanel pn1, pn2 , pn3;//CRIA PAINEIS[CAIXINHAS ONDE FICAM COMPONENTES]
    private JFrame fr; //CRIA A TELA 

    public Tela3() {
        fr = new JFrame();//INSTANCIA A TELA
        fr.setTitle("Tela Elisangela");
        fr.setSize(800, 600);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);//E PRA DECIDIR COMO VAI TERMINAR O PROGRAMA 
        fr.setBackground(Color.pink);
        fr.setLayout(new GridLayout(3,1));
         fr.setResizable(false);
        
        //criacao dos botoes
        
        ImageIcon img = new ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Aulas_Prog_3\\src\\img\\newimgjava.jpg");
        
        bt1 = new JButton("Botao 1",img);
        bt1.addActionListener(new ActionListener() {//dar acao aos bts

            @Override
            public void actionPerformed(ActionEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
                 new Tela2semDesign(); 
            }
        });
        pn1 = new JPanel();
        
        pn1.add(bt1);
        
        bt2 = new JButton("Botao 2", img);
        pn2 = new JPanel();
        pn2.add(bt2);
                
        bt3 = new JButton("Botao 3", img);
        pn3 = new JPanel();
        pn3.add(bt3);
        
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        
        
        fr.setVisible(true);// define visualizacao
        
        
    }
    
    
  public static void main(String []args){
     new Tela3(); //fazer rodar
    }
              
    
}
