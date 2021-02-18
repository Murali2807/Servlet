package com.sample.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//https://www.fileformat.info/info/unicode/block/tamil/list.htm
//Simple CRUD without database

public class SwingProgram5 implements ActionListener{

	private Font font = null;
	private JFrame jFrame = null;
	private JButton insertButton = null;
	private JButton retrieveButton = null;
	private JButton deleteButton = null;
	
	
	//Two new fields
	private JTextField txtField = null;
	private JLabel jLable = null;
	
	//Data stored in java collection class for temporarily
	private List<String> data = null;
	
	SwingProgram5(){
		jFrame =new JFrame();
		insertButton =new JButton();
		retrieveButton =new JButton();
		deleteButton =new JButton();
		data = new ArrayList<>();
		txtField = new JTextField();
		jLable = new JLabel();
		
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
		
		//String insert = "\u0B9A\u0BBF\u0BB5\u0BAA\u0B82\u0BAA\u0BC1";
		String insertInTamil = "இன்செர்ட்";
		//String retrieve = "\u0BFA\u0BB2\u0BAE\u0B82";
		String retrieveInTamil = "மீட்டெடு";
		//String delete = "\u0BAA\u0B9A\u0B82\u0B9A\u0BC8";
		String deleteColorInTamil = "நீக்கு";
		
		
		
		//inject value in frame
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(800,800);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.getContentPane().setBackground(Color.DARK_GRAY);
		
		txtField.setBounds(100,50,200,80);
		txtField.setFont(font);
		
		jLable.setBounds(100,400,200,400);
		jLable.setFont(font);
		jLable.setBackground(Color.WHITE);
		jLable.setVisible(true);
		//inject value in button
		insertButton.setText(insertInTamil);
		insertButton.setBounds(50,250,140,60);
		insertButton.setFont(font);
		insertButton.setBackground(Color.WHITE);
		insertButton.addActionListener(this);
		
		retrieveButton.setText(retrieveInTamil);
		retrieveButton.setBounds(200,250,140,60);
		retrieveButton.setFont(font);
		retrieveButton.setBackground(Color.WHITE);
		retrieveButton.addActionListener(this);
		
		deleteButton.setText(deleteColorInTamil);
		deleteButton.setBounds(330,250,120,60);
		deleteButton.setFont(font);
		deleteButton.setBackground(Color.WHITE);
		deleteButton.addActionListener(this);
		
		jFrame.add(jLable);
		jFrame.add(txtField);
		jFrame.add(insertButton);
		jFrame.add(retrieveButton);
		jFrame.add(deleteButton);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel label = new JLabel();
		
		if(e.getSource() == insertButton) {
			if(!txtField.getText().isEmpty()) {
				System.out.println("add ===========>"+txtField.getText());
				data.add(txtField.getText());
				label.setText("சேமிக்கப்பட்டது");
				label.setFont(font);
				JOptionPane.showMessageDialog(null, label, "InfoBox: " + "Info", JOptionPane.INFORMATION_MESSAGE);
			}else {
				
			}
		}else if(e.getSource() == retrieveButton) {
			System.out.println("Retrieve ===========>"+data.toString());
			jLable.setText(data.toString());
			jLable.setBackground(Color.WHITE);
		}else if(e.getSource() == deleteButton) {
			if(!txtField.getText().isEmpty() && data.contains(txtField.getText())) {
				data.remove(txtField.getText());
				label.setText("நீக்கப்பட்டது");
				label.setFont(font);
				JOptionPane.showMessageDialog(null, label, "InfoBox: " + "Info", JOptionPane.INFORMATION_MESSAGE);
			}else {
				label.setText("டேடா இல்லை");
				label.setFont(font);
				JOptionPane.showMessageDialog(null, label, "InfoBox: " + "Info", JOptionPane.INFORMATION_MESSAGE);
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		new SwingProgram5();
	}
}
