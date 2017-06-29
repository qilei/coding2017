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
    boolean debug = false;
    for (User user : users) {
      Mail mail = buildMail(user);
      MailUtil.sendEmail(mail, debug);
    }

  }

  private Mail buildMail(User user) {
	  Mail mail = new Mail();
	  mail.setToAddr(user.getEmail());
	  mail.setSubject("您关注的产品降价了");
	  mail.setContent(buildMsg(user.getName(), user.getProductList().get(0)));
    return mail;
  }

  private String buildMsg(String userName, Product product) {
    String message = "尊敬的 "+ userName+", 您关注的产品 " + product.getDesc() + " 降价了，欢迎购买!" ;
    return message;
  }
}
