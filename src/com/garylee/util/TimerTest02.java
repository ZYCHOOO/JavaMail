package com.garylee.util;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.*;

import static com.garylee.util.InBoxUtil.writeFiles;

public class TimerTest02 {
    Timer timer;
	private MimeMessage message;

	public TimerTest02() {
		Date time = getTime();
		System.out.println("指定时间time=" + time);
		timer = new Timer();
		timer.schedule(new TimerTaskTest02(), time);
	}

	public Date getTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 21);
		calendar.set(Calendar.MINUTE, 06);
		calendar.set(Calendar.SECOND, 00);
		Date time = calendar.getTime();
		return time;
	}

	public static void main(String[] args) {
		new TimerTest02();

	}
}
class TimerTaskTest02 extends TimerTask {
	@Override
	public void run() {
		try {
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.host", "smtp.qq.com");
			props.put("mail.smtp.port", "587");
			//
			props.put("mail.user", "664306561@qq.com");
			// 此处的密码就是前面说的16位STMP口令
			props.put("mail.password", "hcytmmtlmzvjbeeb");

			// 构建授权信息，用于进行SMTP进行身份验证
			Authenticator authenticator = new Authenticator() {

				protected PasswordAuthentication getPasswordAuthentication() {
					// 用户名、密码
					String userName = props.getProperty("mail.user");
					String password = props.getProperty("mail.password");
					return new PasswordAuthentication(userName, password);
				}
			};
			// 使用环境属性和授权信息，创建邮件会话
			Session mailSession = Session.getInstance(props, authenticator);
//    mailSession.setDebug(true);
			// 创建邮件消息
			MimeMessage message = new MimeMessage(mailSession);
			// 设置发件人
			InternetAddress form = new InternetAddress(
					props.getProperty("mail.user"));
			message.setFrom(form);

			// 设置收件人的邮箱
			InternetAddress to = new InternetAddress("664306561@qq.com");
			message.setRecipient(MimeMessage.RecipientType.TO, to);

			// 设置邮件标题
			message.setSubject("测试标题");

			// 设置邮件的内容体
			message.setText("这是javamail的测试邮件", "text/html;charset=UTF-8");

			//附件测试
        Multipart multipart = new MimeMultipart();
        List<String> list = new ArrayList<>();
        list.add("d:\\Users\\Administrator\\Desktop\\testimg\\测试.txt");
        list.add("d:\\Users\\Administrator\\Desktop\\testimg\\1.jpg");

        multipart.addBodyPart(writeFiles("d:\\Users\\Administrator\\Desktop\\testimg\\测试.txt"));

        message.setContent(multipart);

			Transport.send(message);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("任务完成");
	}
}