package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("F:\\慕课Java专用\\1.txt");
		out.write('A');
		out.write('B');

		int a = 10;
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);

		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();

		IOUtil.printHex("F:\\慕课Java专用\\123.txt");
	}
}
