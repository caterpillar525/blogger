package com.vimin.initializer;

import com.vimin.configuration.SecurityConfig;
import com.vimin.configuration.RedisSessionConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    public SecurityInitializer(){
        super(SecurityConfig.class, RedisSessionConfig.class);
    }
}
