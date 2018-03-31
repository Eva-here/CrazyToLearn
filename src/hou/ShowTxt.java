package hou;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowTxt {

	JFrame frame;
	/**
	 * Create the application.
	 */
	public ShowTxt(String txtName) {
		initialize(txtName);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String txtName) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 414, 193);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(105, 213, 185, 38);
		frame.getContentPane().add(btnNewButton);
		ReadFromFp reFrom= new ReadFromFp();
		textArea.setText(reFrom.ReadFp(txtName));
	}

}
