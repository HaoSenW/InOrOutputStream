package com.imooc.test;

import java.io.File;
import java.io.IOException;

import com.imooc.io.IOUtil;

public class Test3 {
	public static void main(String[] args) throws IOException {
		IOUtil.copyFile(new File("F:\\Ľ��Javaר��\\123.txt"),
				new File("F:\\Ľ��Javaר��\\11.txt"));
	}
}
