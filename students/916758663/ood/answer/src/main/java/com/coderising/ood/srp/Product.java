package com.coderising.ood.srp;

/**
 * Created by qilei on 17/6/25.
 */
public class Product {
  private String id;
  private String desc;

  public Product(String id, String desc) {
    this.id = id;
    this.desc = desc;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
