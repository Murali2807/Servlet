package com.sample.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingProgram1 {

	public static void main(String[] args) {
		JFrame jFrame=new JFrame();
		jFrame.setSize(400,500);
		jFrame.setLayout(null);
		JLabel jLabel = new JLabel("Welcome");
		jLabel.setBounds(130,100,100, 40);
		jFrame.add(jLabel);
		jFrame.setVisible(true);
	}
}
