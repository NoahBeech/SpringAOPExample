package com.noah;

public class ResourceMonitor {
	
	private long startTime;
	
	public void startTime() {
		System.out.println("Start monitoring resource use");
		startTime = System.nanoTime();
	}
	public void endTime() {
		System.out.println("Resources used - " + (System.nanoTime() - startTime));
	}
	
	public void issueUsageBill() {
		System.out.println("Calculate and Issue Bill");
	}
	
	public void cancelBilling() {
		System.out.println("Cancel billing");
	}

}
