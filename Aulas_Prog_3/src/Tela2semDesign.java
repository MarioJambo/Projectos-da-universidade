
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Tela2semDesign  {

    private JFrame fr;
    private JCheckBox cb1, cb2, cb3,cb5, cb4;
    private JLabel lb1;
    private JPanel pn1, pn2, pn3;
    
    
    public Tela2semDesign() {
        
        // initComponents();
        fr = new JFrame();
        fr.setTitle("tela2");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocation(400, 400);
        fr.setSize(400, 400);
      //fr.setLocation(0, 0);
        fr.setResizable(false);
        fr.setLayout(new FlowLayout());
       
        //Painel de titulo
        pn1 = new JPanel();
        pn1.setLayout(new FlowLayout());
        lb1 = new JLabel("Prato Favorito");
        lb1.setFont(new java.awt.Font("Tahoma", 1, 30));
        lb1.setForeground(new java.awt.Color(51, 51, 255));
        pn1.add(lb1);
        fr.add(pn1);
        
       // painel de botoes
        pn2 = new JPanel();
        pn2.setLayout(new GridLayout(0,2));
        cb1 = new JCheckBox("feijao");
        cb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(cb1.isSelected()){
                JOptionPane.showMessageDialog(null, "voce escolheu "+cb1.getText());
                }
            }
        });
        
        cb2 = new JCheckBox("Peixe");
        cb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cb2.isSelected()){
                JOptionPane.showMessageDialog(null, "voce escolheu "+cb2.getText());
                }
            }
        });
        cb3 = new JCheckBox("Camarao");
        cb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(cb3.isSelected()){
                JOptionPane.showMessageDialog(null, "voce escolheu "+cb3.getText());
                }
            }
        });
        
        cb4 = new JCheckBox("frango");
        cb4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cb4.isSelected()){
                JOptionPane.showMessageDialog(null, "voce escolheu "+cb4.getText());
                }
            }
        });
        cb5 = new JCheckBox("Caril de Amendoim");
        cb5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cb5.isSelected()){
                JOptionPane.showMessageDialog(null, "voce escolheu "+cb5.getText());
                }
            }
        });
        pn2.add(cb1);
         pn2.add(cb2);
          pn2.add(cb3);
           pn2.add(cb4);
            pn2.add(cb5);   
        fr.add(pn2);
      
        
        
         fr.setVisible(true);
    }
    
    
    
    
    public static void main(String []args){
     new Tela2semDesign(); 
    }
   
}
