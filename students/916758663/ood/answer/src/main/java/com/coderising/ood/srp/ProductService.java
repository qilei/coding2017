package com.coderising.ood.srp;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by qilei on 17/6/25.
 */
public interface ProductService {
  List<Product> loadProducts(File file) throws IOException;
}
