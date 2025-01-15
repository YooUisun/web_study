package com.app.side;

import java.util.HashMap;
import java.util.Map;

public class SessionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JSESSIONID 쿠키값 -> 내 session 영역 접근 -> session.setAttribute 
		
		//key:jsessionId 값 , value : 저장공간(storage)
		Map<String, SessionStorage> sessionMap
							=new HashMap<String, SessionStorage>();
		sessionMap.put("123A123", new SessionStorage());
		
		SessionStorage session = sessionMap.get("123A123");
		session.setAttribute("sessionMsg", "여기다 세션 메세지");
		
		sessionMap.put("BBB222", new SessionStorage());
		
		sessionMap.get("123A123");
		sessionMap.get("BBB222");
		
		sessionMap.get("6A0C5BC5F0C03696182A59156F7A3F6F");
		//6A0C5BC5F0C03696182A59156F7A3F6F	<<다른 영역 어플리케이션 value 값

	}

}

class SessionStorage {
	
	Map<String, String> storage;
	
	public SessionStorage() {
		storage = new HashMap<String, String>();
	}
	
	public void setAttribute(String key, String value) {
			storage.put(key,value);
	}
	
	public void removeAttribute(String key) {
		storage.remove(key);
	}
	
	public void invalidate() {
		storage.clear();
	}
}