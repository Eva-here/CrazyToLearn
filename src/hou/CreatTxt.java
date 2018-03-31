package hou;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CreatTxt {

	JFrame frame;
	/**
	 * Create the application.
	 */
	public CreatTxt() {
		initialize();
	}
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 575, 384);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 58, 544, 200);
			frame.getContentPane().add(scrollPane);
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBounds(151, 0, 236, 48);
			frame.getContentPane().add(textArea_1);
			textArea_1.setText("Please entry file name");
			
			JTextArea textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			
			JButton btnNewButton = new JButton("Comfirm");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String txtIn=textArea.getText();
					String txtName=textArea_1.getText();
					WriteInFp wri= new WriteInFp();
					wri.WriteFp(txtName,txtIn);
					frame.setVisible(false);
				}
			});
			btnNewButton.setBounds(95, 281, 101, 40);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
				}
			});
			btnNewButton_1.setBounds(242, 281, 101, 40);
			frame.getContentPane().add(btnNewButton_1);
			

		}
	}
