package com.imooc.test;

import java.io.File;
import java.io.IOException;

import com.imooc.io.IOUtil;

public class Test3 {
	public static void main(String[] args) throws IOException {
		IOUtil.copyFile(new File("F:\\慕课Java专用\\123.txt"),
				new File("F:\\慕课Java专用\\11.txt"));
	}
}
