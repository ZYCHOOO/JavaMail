package com.garylee.view;

import com.garylee.domain.UserTable;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class manager extends JFrame{
	private JButton add = new JButton("添加用户");
	private JButton alter = new JButton("修改用户");
	private JButton delete = new JButton("删除用户");
	private JButton search = new JButton();
	private JTextField searchtxt = new JTextField(10);
	private JLabel sum = new JLabel("统计邮件");
	private JLabel sent = new JLabel("已发送:");
	private JLabel received = new JLabel("已收到:");
//	private JTable table = new JTable(11,2);  //用户帐号,密码
	UserTable userTable = new UserTable();
	private JTable table = new JTable(userTable);  //用户帐号,密码
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();
	
	public manager(){
		ImageIcon img = new ImageIcon("admin.png");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		bg.setBounds(0, 0, 900, 540);
		bg.setBackground(Color.white);
		
		panel.setBounds(0, 0, 900, 540);
		panel.add(imgLabel);
		panel.setOpaque(false);
		
		add.setBounds(20, 55, 100, 30);
		add.setFont(new Font("微软雅黑",1,16));
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		alter.setBounds(130, 55, 100, 30);
		alter.setFont(new Font("微软雅黑",1,16));
		
		delete.setBounds(240, 55, 100, 30);
		delete.setFont(new Font("微软雅黑",1,16));
		
		sum.setFont(new   java.awt.Font("Dialog",1,25));
		sum.setBounds(720,120, 120, 50);
		
		sent.setFont(new   java.awt.Font("Dialog",1,18));
		sent.setBounds(690,170, 120, 50);
		
		received.setFont(new   java.awt.Font("Dialog",1,18));
		received.setBounds(690,205, 120, 50);
		
		searchtxt.setBounds(615, 40, 200, 34);
		
		search.setBounds(815, 40, 34, 34);
		search.setBorderPainted(false);
		search.setBackground(Color.white);
		search.setOpaque(false);
		
		table.setBounds(5, 100, 650, 385);
		table.setRowHeight(35);
		table.getColumnModel().getColumn(0).setPreferredWidth(250);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		
		this.setLayout(null);
		this.setSize(905, 520);
		this.setLocation(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		this.add(add);
		this.add(alter);
		this.add(delete);
		this.add(sum);
		this.add(sent);
		this.add(received);
		this.add(searchtxt);
		this.add(search);
		this.add(table);
		this.add(panel);
		this.add(bg);
	}
	
	public static void main(String[] args) {
		new manager();
	}
}
