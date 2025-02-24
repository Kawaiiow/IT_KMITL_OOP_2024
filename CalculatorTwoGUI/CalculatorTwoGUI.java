package CalculatorTwoGUI;

import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
	public CalculatorTwoGUI(){
		JFrame		window;
		JPanel		p1;
		JTextField	Tip;
		
		window = new JFrame("My Calculator");

		Tip = new JTextField();
		Tip.setBounds(0, 0, 500, 100);
		window.add(Tip);

		p1 = new JPanel();
		p1.add(new JButton("7"));	p1.add(new JButton("8"));	p1.add(new JButton("9"));	p1.add(new JButton("+"));
		p1.add(new JButton("4"));	p1.add(new JButton("5"));	p1.add(new JButton("6"));	p1.add(new JButton("-"));
		p1.add(new JButton("1"));	p1.add(new JButton("2"));	p1.add(new JButton("3"));	p1.add(new JButton("x"));
		p1.add(new JButton("0"));	p1.add(new JButton("c"));	p1.add(new JButton("="));	p1.add(new JButton("/"));
		p1.setLayout(new GridLayout(4, 4));
		p1.setBounds(0, 100, 500, 400);
		window.add(p1);
		
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new CalculatorTwoGUI();
	}
}
