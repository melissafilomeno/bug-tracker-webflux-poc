package com.myorg.bugTrackerWebFluxPoc.handler;

import com.myorg.bugTrackerWebFluxPoc.entity.Bug;
import com.myorg.bugTrackerWebFluxPoc.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class BugHandler {

    private final BugRepository bugRepository;

    public BugHandler(@Autowired BugRepository bugRepository){
        this.bugRepository = bugRepository;
    }

    public Mono<ServerResponse> getBugs(ServerRequest serverRequest){
        Flux<Bug> result = bugRepository.findAll();
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Bug.class);
    }

}
