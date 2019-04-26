package com.noah;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class CalculationAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {
	
	private ResourceMonitor resourceMonitor;
	
	public ResourceMonitor getResourceMonitor() {
		return resourceMonitor;
	}

	public void setResourceMonitor(ResourceMonitor resourceMonitor) {
		this.resourceMonitor = resourceMonitor;
	}
	
	@Override
	public void before(Method m1, Object[] a2, Object o3) throws Throwable
	{
		this.getResourceMonitor().startTime();
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Allow user to use resources");
		invocation.proceed();
		System.out.println("Finish using resources");
		return null;
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		this.getResourceMonitor().endTime();
	}
	
	public void afterThrowing(Throwable t) throws Throwable {
		this.getResourceMonitor().cancelBilling();
	}
	

}


