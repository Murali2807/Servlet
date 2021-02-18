package com.sample.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

//Split the same concept by introducing methods and constructor to initialize the resource on initializing the instance
//implement action event
public class SwingProgram4 implements ActionListener{

	private Font font = null;
	private JFrame jFrame = null;
	private JButton redButton = null;
	private JButton blueButton = null;
	private JButton greenButton = null;
	
	SwingProgram4(){
		jFrame =new JFrame();
		redButton =new JButton();
		blueButton =new JButton();
		greenButton =new JButton();
		initializeFont();
		createSampleApp();
	}
	
	public void initializeFont() {
		try {
			File fontFile = new File(new URI("file:///E:/Test/Session1/Latha2.ttf"));
			font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			font = font.deriveFont(Font.PLAIN, 24f);
			
		}catch(Exception e) {
			System.out.println("Error due to : "+e);
		}
		
	}
	
	
	public void createSampleApp() {
		
		String redColor = "\u0B9A\u0BBF\u0BB5\u0BAA\u0B82\u0BAA\u0BC1";
		String redColorInTamil = "சிவப்பு";
		String blueColor = "\u0BFA\u0BB2\u0BAE\u0B82";
		String blueColorInTamil = "நீலம்";
		String greenColor = "\u0BAA\u0B9A\u0B82\u0B9A\u0BC8";
		String greenColorInTamil = "பச்சை";
		
		
		
		//inject value in frame
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(600,600);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.getContentPane().setBackground(Color.DARK_GRAY);
		
		//inject value in button
		redButton.setText(redColorInTamil);
		redButton.setBounds(50,250,120,60);
		redButton.setFont(font);
		redButton.setBackground(Color.RED);
		redButton.addActionListener(this);
		
		blueButton.setText(blueColorInTamil);
		blueButton.setBounds(180,250,120,60);
		blueButton.setFont(font);
		blueButton.setBackground(Color.BLUE);
		blueButton.addActionListener(this);
		
		greenButton.setText(greenColorInTamil);
		greenButton.setBounds(310,250,120,60);
		greenButton.setFont(font);
		greenButton.setBackground(Color.GREEN);
		greenButton.addActionListener(this);
		
		jFrame.add(redButton);
		jFrame.add(blueButton);
		jFrame.add(greenButton);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == redButton) {
			jFrame.getContentPane().setBackground(Color.RED);
		}else if(e.getSource() == blueButton) {
			jFrame.getContentPane().setBackground(Color.BLUE);
		}else if(e.getSource() == greenButton) {
			jFrame.getContentPane().setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		new SwingProgram4();
	}
	
}
