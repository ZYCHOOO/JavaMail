package com.garylee.util;

import com.garylee.dao.EmailDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public String format(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        return s;
    }
    public Date formatDate(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(time);
        return d;
    }
    public static void main(String[] args) throws ParseException {
        System.out.println(new DateUtil().format(new Date()));
    }
}
