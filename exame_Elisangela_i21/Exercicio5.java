
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Romano {
	private JFrame frame;
	private JPanel panel;
	private JTextField txt_valor;
	private JLabel lbl_valor;
	
	public Romano() {
		
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Layout");
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JLabel lbl_valor= new JLabel("Numero");
		lbl_valor.setBounds(38, 22, 46, 14);
		frame.add(lbl_valor);
	
		txt_valor = new JTextField();
		txt_valor.setBounds(86, 19, 169, 20);
		frame.add(txt_valor);
		txt_valor.setColumns(10);
		
		JButton btn_roma = new JButton("Converter para romano");
		btn_converter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=txt_valor.getString();
				 int numeroConvertido = Integer.parseInt(numero);
				 toRoman(numeroConvertido);
				 JOptionPane.showMessageDialog("Numero Convertido Sere"+numeroConvertido,null);
		
		});
		JButton btn_decimal= new JButton("Converter para Decimmal");
		btn_converter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				  int number = Integer.parseInt(txt_valor.getString());
				 toNumberd(number);
				 JOptionPane.showMessageDialog("Numero Convertido Sere"+numeroConvertido,null);
			}
		});
		btn_converter.setBounds(290, 18, 89, 23);
		frame.add(btn_converter);
		
	}
	
	public static void main(String[] args) {
		
		new Romano ();
	}
	
	public String toRoman(int numberInput) {

        if (numberInput < 0 || numberInput > 10000) {

            return "O número inserido não é valido";
        }
        String returnValue = "";

        while (numberInput >= 1000) {
            returnValue += "M";
            numberInput = numberInput - 1000;
        }
        while (numberInput >= 900) {
            returnValue += "CM";
            numberInput = numberInput - 900;
        }
        while (numberInput >= 500) {
            returnValue += "D";
            numberInput = numberInput - 500;
        }
        while (numberInput >= 400) {
            returnValue += "CD";
            numberInput = numberInput - 400;
        }
        while (numberInput >= 100) {
            returnValue += "C";
            numberInput = numberInput - 100;
        }
        while (numberInput >= 90) {
            returnValue += "XC";
            numberInput = numberInput - 90;
        }
        while (numberInput >= 50) {
            returnValue += "L";
            numberInput = numberInput - 50;
        }
        while (numberInput >= 40) {
            returnValue += "XL";
            numberInput = numberInput - 40;
        }
        while (numberInput >= 10) {
            returnValue += "X";
            numberInput = numberInput - 10;
        }
        while (numberInput >= 9) {
            returnValue += "IX";
            numberInput = numberInput - 9;
        }
        while (numberInput >= 5) {
            returnValue += "V";
            numberInput = numberInput - 5;
        }
        while (numberInput >= 4) {
            returnValue += "IV";
            numberInput = numberInput - 4;
        }
        while (numberInput >= 1) {
            returnValue += "I";
            numberInput = numberInput - 1;
        }

        return returnValue;
    }


    public String toNumber (String roman) {

        int decimal;
        decimal = 0;
        roman.toUpperCase();
        String romanNumeral = roman.toUpperCase();
        for (int x = 0; x < romanNumeral.length(); x++) {

            char convertToDecimal = roman.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal += 1000;
                    break;

                case 'D':
                    decimal += 500;
                    break;

                case 'C':
                    decimal += 100;
                    break;

                case 'L':
                    decimal += 50;
                    break;

                case 'X':
                    decimal += 10;
                    break;

                case 'V':
                    decimal += 5;
                    break;

                case 'I':
                    decimal += 1;
                    break;

                default:
                    System.out.println("Numero romano invalido!!");
            }
        }
        if (romanNumeral.contains("IV")) {
            decimal -= 2;
        }
        if (romanNumeral.contains("IX")) {
            decimal -= 2;
        }
        if (romanNumeral.contains("XL")) {
            decimal -= 10;
        }
        if (romanNumeral.contains("XC")) {
            decimal -= 10;
        }
        if (romanNumeral.contains("CD")) {
            decimal -= 100;
        }
        if (romanNumeral.contains("CM")) {
            decimal -= 100;
        }

        return String.valueOf(decimal);
    }
	

}

