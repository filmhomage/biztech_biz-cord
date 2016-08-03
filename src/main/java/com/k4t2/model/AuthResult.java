package com.k4t2.model;

/**
 * 認証結果を返す、Jsonオブジェクトです。
 * 
 * @author ken-kaiho
 */
public class AuthResult {
	String result ;

	public AuthResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	} 
}
