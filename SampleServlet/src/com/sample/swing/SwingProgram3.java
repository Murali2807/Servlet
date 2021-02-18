package com.sample.swing;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingProgram3{

	public static void main(String[] args) {
		try {
			File fontFile = new File(new URI("file:///E:/Test/Session1/Latha2.ttf"));
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			font = font.deriveFont(Font.PLAIN, 24f);
			
			JFrame jFrame =new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setSize(600,600);
			jFrame.setLayout(null);
			jFrame.setVisible(true);
			
			String redColor = "\u0B9A\u0BBF\u0BB5\u0BAA\u0B82\u0BAA\u0BC1";
			String redColorInTamil = "சிவப்பு";
			String blueColor = "\u0BFA\u0BB2\u0BAE\u0B82";
			String blueColorInTamil = "நீலம்";
			String greenColor = "\u0BAA\u0B9A\u0B82\u0B9A\u0BC8";
			String greenColorInTamil = "பச்சை";
			
			JButton redButton =new JButton(redColorInTamil);
			redButton.setBounds(50,250,120,60);
			redButton.setFont(font);
			redButton.setBackground(Color.RED);
			
			JButton blueButton =new JButton(blueColorInTamil);
			blueButton.setBounds(180,250,120,60);
			blueButton.setFont(font);
			blueButton.setBackground(Color.BLUE);
			
			JButton greenButton =new JButton(greenColorInTamil);
			greenButton.setBounds(310,250,120,60);
			greenButton.setFont(font);
			greenButton.setBackground(Color.GREEN);
			
			jFrame.add(redButton);
			jFrame.add(blueButton);
			jFrame.add(greenButton);
			
		}catch(Exception e) {
			System.out.println("Exception due to : "+e);
		}
		
	}
	
	

}
