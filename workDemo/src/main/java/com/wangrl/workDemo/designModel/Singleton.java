/**
 * 
 */
package com.wangrl.workDemo.designModel;

  
/**  
 * @Description: TODO 
 * @author wangrongli  
 * @date 2018年6月17日  
 */

public class Singleton {
	private Singleton() {
		System.out.println("singleton init...");
	}
	
	private static class SingletonHolder{
		private static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
	
	public static void main(String[] args) {
		Singleton.getInstance();
	}
}
