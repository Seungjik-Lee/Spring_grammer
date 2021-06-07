package sj_0607.cls;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * sj_0607.cls.*.*(..))")
	private void publicTarget() {
	}

	@Around("publicTarget()")
	public Object doASC(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			System.out.println("����");
			//doA ����
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
//			System.out.printf("%s.%s(%s) ���� �ð� : %d ns\n",
//			joinPoint.getTarget().getClass().getSimpleName(),
//			sig.getName(), Arrays.toString(joinPoint.getArgs()),
//			(finish - start));
	
			System.out.println("�ش� Ŭ����"+joinPoint.getTarget().getClass().getSimpleName());
			System.out.println("�ش� �޼���"+sig.getName());
			System.out.println("�ش� �Ķ��Ÿ"+Arrays.toString(joinPoint.getArgs()));
		}
	} 
}
