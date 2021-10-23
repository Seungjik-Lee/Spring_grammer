package com.org.sjproject.aop;

import java.util.Arrays;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		HttpServletRequest request = null;
		HttpSession session = null;
		
		try {
			System.out.println("이전");
			Object[] obs = joinPoint.getArgs();
			for(Object o:obs) {
				if(o instanceof HttpServletRequest)
					request = (HttpServletRequest)o;
			}
			String a = request.getParameter("aaa");
			System.out.println("a = " + a);
			
			if(request != null) {
				session = request.getSession();
				String pw = (String) session.getAttribute("id");
				System.out.println("pw = " + pw);
				if(pw == null)
					return "redirect:/";
			}
				
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
