package MDIFromGUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MDIFromGUI
{
	public MDIFromGUI(){
		JFrame			window = new JFrame("SubmenuItem Demo");
		JDesktopPane	deskpane = new JDesktopPane();
		JInternalFrame	app1 = new JInternalFrame("Application1", true, true, true, true);
		JInternalFrame	app2 = new JInternalFrame("Application2", true, true, true, true);
		JInternalFrame	app3 = new JInternalFrame("Application3", true, true, true, true);
		JMenuBar		bar = new JMenuBar();
		JMenu			File_btn = new JMenu("File");
		JMenu			New_sub = new JMenu("New");
		JMenu			Edit_btn = new JMenu("Edit");
		JMenu			View_btn = new JMenu("View");

		bar.add(File_btn);	bar.add(Edit_btn);	bar.add(View_btn);

		New_sub.add(new JMenuItem("Window"));	New_sub.add(new JMenuItem("Message"));

		File_btn.add(New_sub);
		File_btn.add(new JMenuItem("Open"));
		File_btn.add(new JMenuItem("Save"));
		File_btn.add(new JMenuItem("Exit"));

		bar.add(File_btn);	bar.add(Edit_btn);	bar.add(View_btn);
		window.setJMenuBar(bar);

		app1.getContentPane().add(new JLabel("."));	app1.pack();
		app1.setSize(100, 100);
		app3.setLocation(0, 0);
		app1.setVisible(true);
		window.add(app1);
		
		app2.getContentPane().add(new JLabel("."));	app2.pack();
		app2.setSize(100, 100);
		app2.setLocation(200, 0);
		app2.setVisible(true);
		window.add(app2);
		
		app3.getContentPane().add(new JLabel("."));	app3.pack();
		app3.setSize(100, 100);
		app3.setLocation(300, 200);
		app3.setVisible(true);
		deskpane.setBackground(new Color(0x0));
		window.add(app3);

		window.add(deskpane, BorderLayout.CENTER);
		window.pack();

        window.setSize(720, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
	}

	public static void main(String[] args) {
		new MDIFromGUI();
	}
}
