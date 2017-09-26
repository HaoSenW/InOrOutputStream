package com.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	public static void printHex(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);

		int b;
		int i = 1;

		while ((b = in.read()) != -1) {
			if (b <= 0xf) {
				System.out.print("0");
			}

			System.out.print(Integer.toHexString(b) + "  ");

			if (i++ % 10 == 0) {
				System.out.println();
			}
		}
		in.close();
	}

	public static void printByByteArray(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[8 * 1024];
		// int bytes = in.read(buf, 0, buf.length);
		// int j = 1;
		// for(int i = 0; i < bytes; i++) {
		// if(buf[i] <= 0xf) {
		// System.out.print("0");
		// }
		// System.out.print(Integer.toHexString(buf[i]) + " ");
		// if(j++ % 10 == 0) {
		// System.out.println();
		// }
		// }
		// in.close();

		int bytes = 0;
		int j = 1;
		while ((bytes = in.read(buf, 0, buf.length)) != -1) {
			for (int i = 0; i < bytes; i++) {
				System.out.print(Integer.toHexString(buf[i] & 0xff) + " ");
				if (j++ % 10 == 0) {
					System.out.println();
				}
			}
		}
		in.close();
	}

	public static void copyFile(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件：" + srcFile + "不存在");
		}

		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "不是文件");
		}

		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8 * 1024];
		int b;
		while ((b = in.read(buf, 0, buf.length)) != -1) {
			out.write(buf, 0, b);
			out.flush();
		}

		in.close();
		out.close();
	}
}
