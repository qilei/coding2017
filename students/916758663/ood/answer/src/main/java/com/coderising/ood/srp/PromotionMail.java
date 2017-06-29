package com.coderising.ood.srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PromotionMail {

	private UserService userService;

	private ProductService productService;

	public void sendMail(){
    List<User> users = userService.loadUsers();
    File f = new File("/Users/qilei/idea/coding2017/coding2017/students/916758663/ood/answer/src/main/java/com/coderising/ood/srp/product_promotion.txt");
    List<Product> products = null;
    try {
      products = productService.loadProducts(f);
    } catch (IOException e) {
      e.printStackTrace();
    }
    Product product = products.get(0);
    String subject = "您关注的产品降价了";
    String smtpHost = Configuration.getProperty(Configuration.SMTP_SERVER);
    String altSmtpHost = Configuration.getProperty(Configuration.ALT_SMTP_SERVER);
    String fromAddress = Configuration.getProperty(Configuration.EMAIL_ADMIN);
    boolean debug = false;
    for (User user : users) {
      String email = user.getEmail();
      String msg = buildMsg(user,product);
      try
      {
        if (email.length() > 0)
          MailUtil.sendEmail(email, fromAddress, subject, msg, smtpHost, debug);
      }
      catch (Exception e)
      {

        try {
          MailUtil.sendEmail(email, fromAddress, subject, msg, altSmtpHost, debug);

        } catch (Exception e2)
        {
          System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage());
        }
      }
    }

  }

  private String buildMsg(User user, Product product) {
    String message = "尊敬的 "+ user.getName()+", 您关注的产品 " + product.getDesc() + " 降价了，欢迎购买!" ;
    return message;
  }
}
