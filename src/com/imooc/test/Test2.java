package com.imooc.test;

import java.io.IOException;

import com.imooc.io.IOUtil;

public class Test2 {
	public static void main(String[] args) {
		try {
			IOUtil.printByByteArray("F:\\2017暑假项目实训（李星皓）\\2017暑假项目实训@20170728@科目管理@internalFrame\\src\\com\\mec\\view\\MainView.java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
