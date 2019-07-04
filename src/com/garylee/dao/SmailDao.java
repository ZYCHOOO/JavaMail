package com.garylee.dao;

import com.garylee.domain.Draft;
import com.garylee.domain.Email;
import com.garylee.view.drafts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SmailDao {
    public List<Email> listSmail(){
        List<Email> emails = new ArrayList<>();
        String sql = "select * from smail";
        try (Connection c = Jdbc.getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                Email email = new Email();
                email.setFrom(resultSet.getString(2));
                email.setTo(resultSet.getString(3));
                email.setTitle(resultSet.getString(4));
                email.setContent(resultSet.getString(5));
                emails.add(email);
            }
            return emails;
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }
    public void addSmail(Email email){

        String sql = "insert into smail values(null,?,?,?,?)";
        try (Connection c = Jdbc.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            ps.setString(1, email.getFrom());
            ps.setString(2, email.getTo());
            ps.setString(3, email.getTitle());
            ps.setString(4, email.getContent());

            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
