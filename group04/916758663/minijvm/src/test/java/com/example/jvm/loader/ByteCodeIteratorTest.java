package com.example.jvm.loader;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by qilei on 17/4/16.
 */
public class ByteCodeIteratorTest {
  static String path1 = "/Users/qilei/idea/coding2017/coding2017/group04/916758663/minijvm/target/test-classes";
  private ByteCodeIterator iter;

  @Before
  public void setup(){
    ClassFileLoader loader = new ClassFileLoader();
    loader.addClassPath(path1);
    String className = "com.example.jvm.loader.EmployeeV1";

    byte[] byteCodes = loader.readBinaryCode(className);
    iter = new ByteCodeIterator(byteCodes);
  }

}