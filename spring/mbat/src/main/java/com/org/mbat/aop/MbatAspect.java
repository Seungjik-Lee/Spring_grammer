package com.org.mbat.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MbatAspect {

	@Pointcut("execution(public * com.org.mbat.cls.*.*(..))")
	private void publicTarget() {
	}

	@Around("publicTarget()")
	public Object doASC(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			System.out.println("이전");
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			
			System.out.println("해당 클래스"+joinPoint.getTarget().getClass().getSimpleName());
			System.out.println("해당 메서드"+sig.getName());
			System.out.println("해당 파라메타"+Arrays.toString(joinPoint.getArgs()));
		}
	}
}
