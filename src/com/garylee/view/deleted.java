package com.garylee.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class deleted extends JFrame{
	private JButton delete = new JButton();
	private JButton transpond = new JButton();
	private JButton restore = new JButton();
	private JTable table = new JTable(13,3);
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();
	
	public deleted(){
		ImageIcon img = new ImageIcon("deleted.png");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		bg.setBounds(0, 0, 1092, 600);
		bg.setBackground(Color.white);
		
		panel.setBounds(0, 0, 1092, 600);
		panel.add(imgLabel);
		panel.setOpaque(false);
		
		delete.setBounds(6, 56, 102, 35);
		delete.setBorderPainted(false);
		delete.setBackground(Color.white);
		delete.setOpaque(false);
		
		transpond.setBounds(121, 56, 69, 35);
		transpond.setBorderPainted(false);
		transpond.setBackground(Color.white);
		transpond.setOpaque(false);
		
		restore.setBounds(203, 56, 69, 35);
		restore.setBorderPainted(false);
		restore.setBackground(Color.white);
		restore.setOpaque(false);
		
		table.setBounds(5,105, 885, 455);
		table.setRowHeight(35);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setBorder(new LineBorder(new Color(0,0,0), 1, false));
		
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
		this.add(restore);
		this.add(table);
		this.add(panel);
		this.add(bg);
	}
	public static void main(String[] args) {
		new deleted();
	}
}
