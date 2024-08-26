package com.example.springsec1.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthenticationEvent {
    @EventListener
    public void onSuccess(AuthenticationSuccessEvent successEvent) {
        log.info("Login successfully for the user:{}", successEvent.getAuthentication().getName());
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failureEvent) {
        log.error("Login failure for the user:{}, due too {}", failureEvent.getAuthentication().getName(),
                failureEvent.getException().getMessage());
    }
}
