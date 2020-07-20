package com.myself.text;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRW {
    //��д����·���������ı�����
    public static String readFile(String path) throws IOException {
	RandomAccessFile raf = new RandomAccessFile(path, "r");
	byte[] flush = new byte[1024];
	int len = -1;
	String text = null;
	while ((len = raf.read(flush)) != -1) {
	    text = new String(flush, 0, len);
	}
	raf.close();
	return text;
    }


}
