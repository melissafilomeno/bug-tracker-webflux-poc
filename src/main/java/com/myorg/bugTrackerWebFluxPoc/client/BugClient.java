package com.myorg.bugTrackerWebFluxPoc.client;

import com.myorg.bugTrackerWebFluxPoc.model.Bug;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class BugClient {

    private final WebClient client;

    public BugClient(WebClient.Builder builder){
        this.client = builder.baseUrl("http://localhost:9090").build();
    }

    public Mono<String> getMessage(){
        return this.client.get().uri("/bugs").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Bug.class)
                .map(Bug::getDescription);
    }
}
