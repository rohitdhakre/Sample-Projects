package com.dhakre.rohit.demo;

interface CallBack {
	void methodToCallBack();
}

class CallBackImpl implements CallBack {
	public void methodToCallBack() {
		System.out.println("I've been called back");
	}
}

class Caller {

	public static void main(String[] args) {
		Caller caller = new Caller();
		CallBack callBack = new CallBackImpl();
		caller.register(callBack);
	}
	
	public void register(CallBack callback) {
		callback.methodToCallBack();
	}

}