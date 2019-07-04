package com.garylee.view;

import com.garylee.domain.EmailTable;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class inbox extends JFrame{
	private JButton delete = new JButton();
	private JButton transpond = new JButton();
	EmailTable emailTable = new EmailTable();
//	private JTable table = new JTable(13,3);  //发件人,主题,时间
	private JTable table = new JTable(emailTable);  //发件人,主题,时间
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();


	public inbox(){
		ImageIcon img = new ImageIcon("inbox.png");
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
		
		table.setBounds(5,105, 785, 455);
		table.setRowHeight(35);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		
		this.setLayout(null);
		this.setSize(800, 600);
		this.setLocation(400, 300);
		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//只关闭当前窗体
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
		new inbox();
	}
}
