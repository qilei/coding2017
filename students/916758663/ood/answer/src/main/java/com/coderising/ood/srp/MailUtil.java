package com.coderising.ood.srp;

public class MailUtil {

	private static String smtpHost = Configuration.getProperty(Configuration.SMTP_SERVER);
	private static String altSmtpHost = Configuration.getProperty(Configuration.ALT_SMTP_SERVER);
	private static String adminEmail = Configuration.getProperty(Configuration.EMAIL_ADMIN);

	public static void sendEmail(String toAddress, String fromAddress, String subject, String message, String smtpHost,
			boolean debug) {
		//假装发了一封邮件
		StringBuilder buffer = new StringBuilder();
		buffer.append("From:").append(fromAddress).append("\n");
		buffer.append("To:").append(toAddress).append("\n");
		buffer.append("Subject:").append(subject).append("\n");
		buffer.append("Content:").append(message).append("\n");
		System.out.println(buffer.toString());
		
	}


  public static void sendEmail(Mail mail, boolean debug) {

		try
		{
			sendEmail(mail.getToAddr(), adminEmail, mail.getSubject(), mail.getContent(), smtpHost,
					debug);
		}
		catch (Exception e)
		{

			try {
				sendEmail(mail.getToAddr(), adminEmail, mail.getSubject(), mail.getContent(), altSmtpHost,
						debug);

			} catch (Exception e2)
			{
				System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage());
			}
		}
  }
}
