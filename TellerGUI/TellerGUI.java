package TellerGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class TellerGUI {
	public TellerGUI(){
		JFrame		window;
		JPanel		p1;
		JPanel		p2;
		JTextField	prmpt1;
		JTextField	prmpt2;
		
		window = new JFrame("Teller GUI");
		window.setSize(400, 300);
		
		
		prmpt1 = new JTextField();
		prmpt1.setSize(150, 40);
		prmpt2 = new JTextField();
		prmpt2.setText("6000");	prmpt2.setEditable(false);
		prmpt2.setSize(150, 40);
		
		p1 = new JPanel();
		p1.add(new JLabel("Balance"));	p1.add(prmpt2);
		p1.add(new JLabel("Amount"));	p1.add(prmpt1);
		p1.setSize(400, 150);
		p1.setLayout(new GridLayout(2, 2));
		
		p2 = new JPanel();
		p2.add(new JButton("Deposit"));	p2.add(new JButton("Withdraw"));	p2.add(new JButton("Exit"));
		p2.setBounds(0, 150, 400, 100);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		window.add(p1);
		window.add(p2);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new TellerGUI();
	}
}
