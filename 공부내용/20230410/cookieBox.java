package util;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class cookieBox {
	private Map<String, Cookie> cookiemap = new java.util.HashMap<String, Cookie>();

	public cookieBox(HttpServletRequest request) {// cookieBox의 생성자 ->해당쿠키들을 cookiemap에 동기화 시켜줘야한다
		Cookie[] cookies = request.getCookies();
		if (cookies != null ) {
			for (int i = 0; i < cookies.length; i++) {
				cookiemap.put(cookies[i].getName(), cookies[i]);
			}
		} else {
			// cookies가 비어있음
			cookiemap = null;
		}
	}

	public static Cookie createCookie(String name, String value) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
		return cookie;
	}

	public static Cookie createCookie(String name, String value, String path) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
		cookie.setPath(path);
		return cookie;
	}

	public static Cookie createCookie(String name, String value, String path, int maxage) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxage);
		return cookie;
	}

	public static Cookie createCookie(String name, String value, String domain, String path, int maxage)
			throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxage);
		return cookie;
	}

	public Cookie getCookie(String name) {
		return cookiemap.get(name);// 이게쿠키
	}

	public String getValue(String name) throws IOException  {
		Cookie cookie = cookiemap.get(name);
				if(cookie ==null) {
					return null;
				}else {
				return URLDecoder.decode(cookie.getValue(),"UTF-8");
				}
	}

	public boolean exist(String name) {
		return cookiemap.get(name) != null;
	}

}
