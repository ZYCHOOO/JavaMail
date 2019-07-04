package com.garylee.view;

import com.garylee.domain.SmailTable;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class outbox extends JFrame{
	private JButton delete = new JButton();
	private JButton transpond = new JButton();
//	private JTable table = new JTable(13,3);  //
	SmailTable smailTable = new SmailTable();
	private JTable table = new JTable(smailTable);  //
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();
	
	public outbox(){
		ImageIcon img = new ImageIcon("outbox.png");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		bg.setBounds(0, 0, 1097, 600);
		bg.setBackground(Color.white);
		
		panel.setBounds(0, 0, 1097, 600);
		panel.add(imgLabel);
		panel.setOpaque(false);
		
		delete.setBounds(5, 59, 68, 32);
		delete.setBorderPainted(false);
		delete.setBackground(Color.white);
		delete.setOpaque(false);
		
		transpond.setBounds(86, 59, 68, 32);
		transpond.setBorderPainted(false);
		transpond.setBackground(Color.white);
		transpond.setOpaque(false);
		
		table.setBounds(5,105, 885, 455);
		table.setRowHeight(35);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		
		this.setLayout(null);
		this.setSize(900, 600);
		this.setLocation(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		this.add(delete);
		this.add(transpond);
		this.add(table);
		this.add(panel);
		this.add(bg);
	}
	public static void main(String[] args) {
		new outbox();
	}
}
