package com.garylee.util;

import com.garylee.domain.Email;

import javax.mail.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class OutBoxUtil{
    private Store store = null;
    private Folder folder = null;
    public OutBoxUtil(){
        Properties properties = new Properties();
        properties.put("mail.pop3.ssl.enable",true);
        properties.put("mail.pop3.host","pop.qq.com");
        properties.put("mail.pop3.port",995);
        Session session = Session.getDefaultInstance(properties);
        try {
            store = session.getStore("pop3");
            store.connect("664306561@qq.com", "hcytmmtlmzvjbeeb");
            folder = store.getFolder("inbox");
            folder.open(Folder.READ_ONLY);//在这一步，收件箱所有邮件将被下载到本地
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取list
    public List<Email> getEmails(){
        List<Email> emails = new ArrayList<>();
        try {
            for (int i = 1; i <= getTotal(); i++) {
                Email email = new Email();
                email.setTitle(getTitle(i));
                email.setContent(getContent(i).toString());
                email.setFrom(getFrom(i));
                email.setTime(getTime(i));
                emails.add(email);
            }
        }catch (Exception e){

        }
        return emails;
    }
    //获取邮件数量
    public int getTotal() throws MessagingException {
       return folder.getMessageCount();
    }
    //获取第n封邮件标题
    public String getTitle(int num) throws MessagingException {
        return folder.getMessage(num).getSubject();
    }
    //获取内容
    public Object getContent(int num) throws MessagingException, IOException {
        return folder.getMessage(num).getContent();
    }
    //获取时间
    public String getTime(int num) throws MessagingException, ParseException {
        Date date = folder.getMessage(num).getSentDate();
        return new DateUtil().format(date);
    }

    public String getFrom(int num) throws MessagingException {
        Address address = folder.getMessage(num).getFrom()[0];
        String s = String.valueOf(address);
        if(s.contains("<")&&s.contains(">")){
            int start = s.indexOf("<")+1;
            int end = s.indexOf(">");
            s = s.substring(start,end);
        }

        return s;
    }

}
