package hou;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Read {

	JFrame frame;



	/**
	 * Create the application.
	 */
	public Read() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 57, 267, 67);
		frame.getContentPane().add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText("Please entry file name");


		JButton btnNewButton = new JButton("Comfirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String txtName=textArea.getText();
					String name = txtName+".txt";
					File file=new File(name);
					if (file.exists() && file.isFile()) {
						ShowTxt window = new ShowTxt(txtName);
						window.frame.setVisible(true);
						frame.setVisible(false);}
					else{
						WarnWin window = new WarnWin();
						window.frame.setVisible(true);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(70, 175, 107, 51);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(225, 175, 112, 51);
		frame.getContentPane().add(btnNewButton_1);
	}

}

