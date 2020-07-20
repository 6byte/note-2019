package com.jym.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
/**
 * 
 * @param string	������ַ���
 * @param regx		�����������ʽ
 * @return ������ʽ��ƥ����ַ���
 */

	public static String regx(String string ,String regx) {

		Pattern pattern = Pattern.compile(regx);

		Matcher matcher = pattern.matcher(string);

		
		if(matcher.find())
			return matcher.group(0);
		else {
			return null;
		}
	}
	
	public enum REGX{
		mail("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"),//�����ַ
		phone("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$"),//�ֻ�����
		idcard("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)"), //���֤����
		password("^[a-zA-Z]\\w{5,17}$"),//����
		qq("[1-9][0-9]{4,}"),//qq�˺�
		postalCode("[1-9]\\d{5}(?!\\d)"),//��������
		charactor("^[\\u4e00-\\u9fa5]{0,}$");//����
		
		private String tmp;
		private  REGX(String regx) {
			tmp = regx;
		}
		@Override
		public String toString() {
			
			return tmp;
			
		}
	}
}
