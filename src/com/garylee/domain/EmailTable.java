package com.garylee.domain;

import com.garylee.util.OutBoxUtil;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class EmailTable extends AbstractTableModel{
    String[] columnNames = new String[] { "title","content","time"};

    public List<Email> emails = new OutBoxUtil().getEmails();

    public EmailTable(){
    }

    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }

    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Email course = emails.get(rowIndex);
        if (0 == columnIndex)
            return course.getTitle();
        if (1 == columnIndex)
            return course.getContent();
        if (2 == columnIndex)
            return course.getTime();

        return null;
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return emails.size();
    }

}
