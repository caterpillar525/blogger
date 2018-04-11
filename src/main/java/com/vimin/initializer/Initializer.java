package com.vimin.initializer;

import com.vimin.configuration.RedisSessionConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class Initializer extends AbstractHttpSessionApplicationInitializer {
    public Initializer() {
        super(RedisSessionConfig.class);
    }
}
