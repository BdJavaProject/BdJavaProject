package com.capacity.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;

import sun.misc.BASE64Encoder;

public class MD5Util {

	public static String encryp(String s) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		// 确定计算方法
//		MessageDigest md5 = MessageDigest.getInstance("MD5");
//		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符串
//		String newstr = base64en.encode(md5.digest(s.getBytes("utf-8")));
		return DigestUtils.md5(s).toString();
	}

}
