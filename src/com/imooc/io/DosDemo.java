package com.imooc.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {
	public static void main(String[] args) throws IOException{
		String file = "demo/dos.dat";
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(66.6);
		dos.writeUTF("ÖÐ¹ú");
		
		dos.close();
		
		IOUtil.printHex(file);
	}
}
