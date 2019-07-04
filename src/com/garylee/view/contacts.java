package com.garylee.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class contacts extends JFrame{
	private JButton writebtn = new JButton();
	private JButton deletebtn = new JButton();
	private JButton searchbtn = new JButton();
	private JTextField searchtxt = new JTextField(10);
	private JTable table = new JTable(12,2);    //名字,邮箱
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();
	
	public contacts(){
		//设置背景
		ImageIcon img = new ImageIcon("contacts.png");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		bg.setBounds(0, 0, 800, 600);
		bg.setBackground(Color.white);
		//
		panel.setBounds(0, 0, 800, 600);
		panel.add(imgLabel);
		panel.setOpaque(false);
		
		
		writebtn.setBounds(8, 15, 56, 30);
		writebtn.setBorderPainted(false);
		writebtn.setBackground(Color.white);
		writebtn.setOpaque(false);
		
		deletebtn.setBounds(67, 15, 56, 30);
		deletebtn.setBorderPainted(false);
		deletebtn.setBackground(Color.white);
		deletebtn.setOpaque(false);
		
		searchbtn.setBounds(756, 18, 36, 25);
		searchbtn.setBorderPainted(false);
		searchbtn.setBackground(Color.white);
		searchbtn.setOpaque(false);
		
		searchtxt.setBounds(566, 18, 190, 26);
		
		table.setBounds(5,90, 785, 420);
		table.setRowHeight(35);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
//		table.getTableHeader().setBackground(Color.LIGHT_GRAY);
		table.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		
		this.setLayout(null);
		this.setSize(800, 600);
		this.setLocation(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		this.add(writebtn);
		this.add(deletebtn);
		this.add(searchbtn);
		this.add(searchtxt);
		this.add(table);
		this.add(panel);
		this.add(bg);
	}
	public static void main(String[] args) {
		new contacts();
	}
}
