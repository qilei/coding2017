package com.coderising.ood.srp;

import java.util.List;

/**
 * Created by qilei on 17/6/25.
 */
public class User {

  private String name;

  private String email;

  private List<Product> productList;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }
}
