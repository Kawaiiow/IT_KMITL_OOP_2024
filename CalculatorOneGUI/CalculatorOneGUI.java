package CalculatorOneGUI;

import javax.swing.*;

public class CalculatorOneGUI {
	public CalculatorOneGUI()
	{
		JFrame 		window;
		JTextField	prmt1;
		JTextField	prmt2;
		JTextField	prmt3;
		JButton		add_btn;
		JButton		min_btn;
		JButton		mul_btn;
		JButton		div_btn;
		
		window = new JFrame("เครื่องคิดเลข");
		window.setSize(750, 350);
		
		prmt1 = new JTextField();
		prmt1.setBounds(0, 0, 750, 70);
		
		prmt2 = new JTextField();
		prmt2.setBounds(0, 70, 750, 70);
		
		prmt3 = new JTextField();
		prmt3.setBounds(0, 210, 750, 70);
		
		window.add(prmt1);
		window.add(prmt2);
		window.add(prmt3);
		
		add_btn = new JButton("บวก");
		add_btn.setBounds(165, 150, 100, 50);
		window.add(add_btn);
		
		min_btn = new JButton("ลบ");
		min_btn.setBounds(270, 150, 100, 50);
		window.add(min_btn);
		
		mul_btn = new JButton("คูณ");
		mul_btn.setBounds(375, 150, 100, 50);
		window.add(mul_btn);

		div_btn = new JButton("หาร");
		div_btn.setBounds(480, 150, 100, 50);
		window.add(div_btn);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new CalculatorOneGUI();
	}
}
