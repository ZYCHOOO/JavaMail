package com.garylee.view;

import com.garylee.domain.DraftTable;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class drafts extends JFrame{
	private JButton dedraft = new JButton();
	private JButton transpond = new JButton();
	private JButton write = new JButton();
	DraftTable draftTable = new DraftTable();
//	private JTable table = new JTable(13,3);  //
	private JTable table = new JTable(draftTable);  //
	private JPanel bg= new JPanel();
	private JPanel panel = new JPanel();

	public drafts(){
		ImageIcon img = new ImageIcon("draft.png");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		bg.setBounds(0, 0, 1040, 600);
		bg.setBackground(Color.white);

		panel.setBounds(0, 0, 1040, 600);
		panel.add(imgLabel);
		panel.setOpaque(false);

		dedraft.setBounds(6, 60, 105, 35);
		dedraft.setBorderPainted(false);
		dedraft.setBackground(Color.white);
		dedraft.setOpaque(false);

		transpond.setBounds(114, 60, 73, 35);
		transpond.setBorderPainted(false);
		transpond.setBackground(Color.white);
		transpond.setOpaque(false);

		write.setBounds(189, 60, 73, 35);
		write.setBorderPainted(false);
		write.setBackground(Color.white);
		write.setOpaque(false);

		table.setBounds(5,109, 885, 455);
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

		this.add(dedraft);
		this.add(transpond);
		this.add(write);
		this.add(table);
		this.add(panel);
		this.add(bg);
	}
	public static void main(String[] args) {
		new drafts();
	}
}
