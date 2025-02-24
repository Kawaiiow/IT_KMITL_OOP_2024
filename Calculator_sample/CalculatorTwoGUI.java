package Calculator_sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorTwoGUI implements ActionListener {
	private JFrame		window;
	private JPanel		p1;
	private Double		n1 = null;
	private Double		n2 = null;
	private char		ops = 0;
	public JButton		btn[];
	public JTextField	Tip;


	public CalculatorTwoGUI(){
		window = new JFrame("My Calculator");

		Tip = new JTextField();
		Tip.setBounds(0, 0, 500, 100);
		window.add(Tip);

		p1 = new JPanel();

		btn = new JButton[16];
		for (int j = 0; j < 10; j++)
			btn[j] = new JButton(j + "");

		btn[10] = new JButton("+");		btn[11] = new JButton("-");
		btn[12] = new JButton("x");		btn[13] = new JButton("/");
		btn[14] = new JButton("=");		btn[15] = new JButton("c");

		for (int j = 0; j < 16; j++)
			btn[j].addActionListener(this);

		p1.add(btn[7]);		p1.add(btn[8]);		p1.add(btn[9]);		p1.add(btn[10]);
		p1.add(btn[4]);		p1.add(btn[5]);		p1.add(btn[6]);		p1.add(btn[11]);
		p1.add(btn[1]);		p1.add(btn[2]);		p1.add(btn[3]);		p1.add(btn[12]);
		p1.add(btn[0]);		p1.add(btn[15]);	p1.add(btn[14]);	p1.add(btn[13]);
		p1.setLayout(new GridLayout(4, 4));
		p1.setBounds(0, 100, 500, 400);
		window.add(p1);

		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setVisible(true);
	}

	private void	cal_event(char c)
	{
		if (Tip.getText() == null || Tip.getText().equals(""))
			return ;
		if (c != '='){
			ops = c;
			if (n1 == null)
			{
				try {
					n1 = Double.parseDouble(Tip.getText());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			else{
				try {
					n2 = Double.parseDouble(Tip.getText());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			Tip.setText("");
		}
		else{
			if (n1 == null)
				return ;
			n2 = Double.parseDouble(Tip.getText());
			if (ops == '+')
				n1 = n1 + n2;
			else if (ops == '-')
				n1 = n1 - n2;
			else if (ops == '*')
				n1 = n1 * n2;
			else if (ops == '/')
				n1 = n1 / n2;
			n2 = null;
			ops = 0;
			Tip.setText(n1.toString());
		}
		return ;
	}

	@Override
	public void	actionPerformed(ActionEvent ae){
		if (ae.getSource().equals(btn[0]))
			Tip.setText(Tip.getText() + "0");
		else if (ae.getSource().equals(btn[1]))
			Tip.setText(Tip.getText() + "1");
		else if (ae.getSource().equals(btn[2]))
			Tip.setText(Tip.getText() + "2");
		else if (ae.getSource().equals(btn[3]))
			Tip.setText(Tip.getText() + "3");
		else if (ae.getSource().equals(btn[4]))
			Tip.setText(Tip.getText() + "4");
		else if (ae.getSource().equals(btn[5]))
			Tip.setText(Tip.getText() + "5");
		else if (ae.getSource().equals(btn[6]))
			Tip.setText(Tip.getText() + "6");
		else if (ae.getSource().equals(btn[7]))
			Tip.setText(Tip.getText() + "7");
		else if (ae.getSource().equals(btn[8]))
			Tip.setText(Tip.getText() + "8");
		else if (ae.getSource().equals(btn[9]))
			Tip.setText(Tip.getText() + "9");
		else if (ae.getSource().equals(btn[10]))
			cal_event('+');
		else if (ae.getSource().equals(btn[11]))
			cal_event('-');
		else if (ae.getSource().equals(btn[12]))
			cal_event('*');
		else if (ae.getSource().equals(btn[13]))
			cal_event('/');
		else if (ae.getSource().equals(btn[14]))
			cal_event('=');
		else if (ae.getSource().equals(btn[15]))
		{
			if (n1 != null && ops == 0) {
				n1 = null;
			}
			Tip.setText("");
		}
	}
}
