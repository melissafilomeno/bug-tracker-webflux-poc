package com.myorg.bugTrackerWebFluxPoc.router;

import com.myorg.bugTrackerWebFluxPoc.handler.BugHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class BugRouter {

    @Bean
    public RouterFunction<ServerResponse> route(BugHandler bugHandler){
        return RouterFunctions
                .route(GET("/bugs")
                .and(accept(MediaType.APPLICATION_JSON)), bugHandler::getBugs);

    }
}
