package hou;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeTxt {

	JFrame frame;
	/**
	 * Create the application.
	 */
	public ChangeTxt(String txtName) {
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
		ReadFromFp reFrom= new ReadFromFp();
		textArea.setText(reFrom.ReadFp(txtName));
		
		JButton btnNewButton = new JButton("Comfirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtIn=textArea.getText();
				WriteInFp wri= new WriteInFp();
				wri.WriteFp(txtName,txtIn);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(105, 213, 185, 38);
		frame.getContentPane().add(btnNewButton);
	}


}
