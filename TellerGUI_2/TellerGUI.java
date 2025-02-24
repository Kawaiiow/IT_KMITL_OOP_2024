package TellerGUI_2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class TellerGUI implements ActionListener {
	private	Account		acct;
	private JFrame		window;
	private JTextField	prmpt1;
	private JTextField	prmpt2;
	private JButton		btn[];
	
	public TellerGUI(){
		JPanel		p1;
		JPanel		p2;

		acct = new Account(5000, "Bob");
		window = new JFrame("Teller GUI");
		window.setSize(400, 300);
		
		
		prmpt1 = new JTextField();
		prmpt1.setSize(150, 40);
		prmpt2 = new JTextField();
		prmpt2.setText(acct.getBalance() + "");	prmpt2.setEditable(false);
		prmpt2.setSize(150, 40);
		
		p1 = new JPanel();
		p1.add(new JLabel("Balance"));	p1.add(prmpt2);
		p1.add(new JLabel("Amount"));	p1.add(prmpt1);
		p1.setSize(400, 150);
		p1.setLayout(new GridLayout(2, 2));
		
		p2 = new JPanel();
		btn = new JButton[3];
		btn[0] = new JButton("Deposit");	btn[1] = new JButton("Withdraw");	btn[2] = new JButton("Exit");
		for (JButton btn : btn)
		{
			btn.addActionListener(this);
			p2.add(btn);
		}
		p2.setBounds(0, 150, 400, 100);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		window.add(p1);
		window.add(p2);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	private	void	update()
	{
		prmpt2.setText(acct.getBalance() + "");
		prmpt1.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(btn[0]))
			acct.deposit(Double.parseDouble(prmpt1.getText()));
		else if (ae.getSource().equals(btn[1]))
			acct.withdraw(Double.parseDouble(prmpt1.getText()));
		else if (ae.getSource().equals(btn[2]))
			System.out.println("On the top right!");
		update();
	}

	public static void main(String[] args) {
		new TellerGUI();
	}
}
