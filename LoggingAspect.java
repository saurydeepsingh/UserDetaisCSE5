package com.User.details.User.Details.AOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* Spring.data.job.User-Details.service.UserService.getAlljobs(. .))")
    public void logmethodcall(JoinPoint jp){
        LOGGER.info("Method call"+ jp.getSignature().getName());
    }
    @After("execution(* Spring.data.job.User-Details.service.UserService.getAlljobs(. .))")
    public void logExecution(JoinPoint jp){
        LOGGER.info("Method Execute"+ jp.getSignature().getName());
    }
    @AfterThrowing("execution(* Spring.data.job.User-Details.service.UserService.getAlljobs(. .) )")
    public void logAfterThrowing(JoinPoint jp){
        LOGGER.info("Method has some issue"+ jp.getSignature().getName());
    }
    @AfterReturning("execution(* Spring.data.job.User-Details.service.UserService.getAlljobs(. .))")
    public void logafterreturning(JoinPoint jp){
        LOGGER.info("Method has Run SuccesFull"+ jp.getSignature().getName());
    }
}
