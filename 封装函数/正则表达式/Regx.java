package com.jym.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
/**
 * 
 * @param string	传入的字符串
 * @param regx		传入的正则表达式
 * @return 正则表达式所匹配的字符串
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
		mail("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"),//邮箱地址
		phone("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$"),//手机号码
		idcard("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)"), //身份证号码
		password("^[a-zA-Z]\\w{5,17}$"),//密码
		qq("[1-9][0-9]{4,}"),//qq账号
		postalCode("[1-9]\\d{5}(?!\\d)"),//邮政编码
		charactor("^[\\u4e00-\\u9fa5]{0,}$");//汉字
		
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
