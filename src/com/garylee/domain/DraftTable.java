package com.garylee.domain;

import com.garylee.dao.DraftsDao;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DraftTable extends AbstractTableModel{
    String[] columnNames = new String[] {"收件人","标题","正文"};

    public List<Draft> drafts = new DraftsDao().listDrafts();

    public DraftTable(){
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
        Draft draft = drafts.get(rowIndex);
        if (0 == columnIndex)
            return draft.getTo();
        if (1 == columnIndex)
            return draft.getTitle();
        if (2 == columnIndex)
            return draft.getContent();

        return null;
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return drafts.size();
    }

}
