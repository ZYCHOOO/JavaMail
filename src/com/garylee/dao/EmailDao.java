package com.garylee.dao;

import com.garylee.domain.Email;
import com.garylee.domain.User;
import com.garylee.util.DateUtil;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailDao {
    public List<Email> list(){
        List<Email> emails = new ArrayList<>();
        String sql = "select * from mail";
        try (Connection c = Jdbc.getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
//                Email email = new Email(null, resultSet.getString("1"));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }
    public void add(Email email) throws ParseException {

        String sql = "insert into email values(null,?,?,?,?,?)";
        try (Connection c = Jdbc.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            ps.setString(1, email.getTitle());
            ps.setString(2, email.getContent());
            ps.setString(3, email.getTime());
//            ps.setDate(3, new java.sql.Date(new Date().getTime()));
            ps.setString(4, email.getFrom());
            ps.setString(5, "To");

            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
