package com.example.jvm.loader;

import com.example.jvm.util.Util;
import java.util.Arrays;

public class ByteCodeIterator {


//  private byte[] codes;
//  private int position;
//
//  public ByteCodeIterator(byte[] codes) {
//    this.codes = codes;
//  }
//
//  public int next2ByteToInt(){
//    byte b1 = codes[position++];
////    byte b2 = codes[position++];
//    byte b2 = codes[7];
//    return (int)b2;
//  }
  byte[] codes;
  int pos = 0;

  ByteCodeIterator(byte[] codes) {
    this.codes = codes;
  }



  public byte[] getBytes(int len) {
    if (pos + len >= codes.length) {
      throw new ArrayIndexOutOfBoundsException();
    }

    byte[] data = Arrays.copyOfRange(codes, pos, pos + len);
    pos += len;
    return data;
  }

  public int nextU1toInt() {

    return Util.byteToInt(new byte[] { codes[pos++] });
  }

  public int nextU2ToInt() {
    return Util.byteToInt(new byte[] { codes[pos++], codes[pos++] });
  }

  public int nextU4ToInt() {
    return Util.byteToInt(new byte[] { codes[pos++], codes[pos++], codes[pos++], codes[pos++] });
  }

  public String nextU4ToHexString() {
    return Util.byteToHexString((new byte[] { codes[pos++], codes[pos++], codes[pos++], codes[pos++] }));
  }

  public String nextUxToHexString(int len) {
    byte[] tmp = new byte[len];

    for (int i = 0; i < len; i++) {
      tmp[i] = codes[pos++];
    }
    return Util.byteToHexString(tmp).toLowerCase();

  }

  public void back(int n) {
    this.pos -= n;
  }
}
