package com.User.details.User.Details.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

//    @Around("execution(* Spring.data.job.Spring_jpa_job.service.JobService.getAlljobs(..))")
@Around("execution(* Spring.data.job.User-Details.service.*.*(..))")

public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {

        long start = System.currentTimeMillis(); 
        Object obj = jp.proceed();
        long end = System.currentTimeMillis();

        LOGGER.info("Time Taken: " + (end - start) + " ms");

        return obj;
    }
}