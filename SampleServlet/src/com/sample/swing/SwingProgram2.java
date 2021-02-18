package com.sample.swing;

import java.awt.Font;
import java.io.File;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingProgram2 {

	//Adding tamil font for our swing java application
	
	public static void main(String[] args) {
		try {
			File fontFile = new File(new URI("file:///E:/Test/Session1/Latha.ttf"));
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			font = font.deriveFont(Font.PLAIN, 24f);
			
			JFrame jFrame=new JFrame();
			jFrame.setSize(400,500);
			jFrame.setLayout(null);
			jFrame.setVisible(true);
			
			String welcomeTextInTamil = "\u0BB5\u0BA3\u0B95\u0B82\u0B95\u0BAE\u0B82";
			JLabel jLabel = new JLabel(welcomeTextInTamil);
			
			jLabel.setBounds(130,100,200, 80);
			jLabel.setFont(font);
			jFrame.add(jLabel);
			
			
		}catch(Exception e) {
			System.out.println("Exception due to : "+e);
		}
		
	}
}
