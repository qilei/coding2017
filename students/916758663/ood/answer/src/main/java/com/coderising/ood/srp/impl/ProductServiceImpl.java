package com.coderising.ood.srp.impl;

import com.coderising.ood.srp.Product;
import com.coderising.ood.srp.ProductService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qilei on 17/6/25.
 */
public class ProductServiceImpl implements ProductService {

  @Override
  public List<Product> loadProducts(File file) throws IOException {
    List<Product> r = new ArrayList<>();
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(file));
      String temp = br.readLine();
      String[] data = temp.split(" ");
      r.add(new Product(data[0], data[1]));
      return r;
    } catch (IOException e) {
      return new ArrayList<>();
    } finally {
      if (br != null) {
        br.close();
      }
    }
  }
}
