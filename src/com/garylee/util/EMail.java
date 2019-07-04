package com.garylee.util;

import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EMail {
    /**
     * @param args
     */
    private MimeMessage message;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MultiPartEmail email = new MultiPartEmail();
        try {
            email.setHostName("smtp.qq.com"); // qq邮箱的发送邮件服务器
            email.addTo("664306561@qq.com"); //收件人
            email.setFrom("664306561@qq.com"); //发件人地址
            email.setAuthentication("664306561@qq.com", "wzxhddt291304732");  //发件人邮箱及密码
            email.setSubject("Test message");  //邮件主题
            email.setMsg("这只是一封测试邮件");  //邮件正文
//            EmailAttachment attachment =new EmailAttachment();
//            attachment.setPath("C:\\Users\\90489\\Desktop\\file.txt");// 本地文件
//            // attachment.setURL(new URL("http://xxx/a.gif"));//远程文件
//            attachment.setDisposition(EmailAttachment.ATTACHMENT);
//            attachment.setDescription("file.txt");
//            attachment.setName("file.txt");
//
//            email.attach(attachment);
            email.send();
        } catch (EmailException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}