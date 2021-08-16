package com.team.underscore.agent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@RestController
public class AgentController {

    @GetMapping("/agent")
    CompletionStage<String> agent() {
        return CompletableFuture.completedFuture("Hello!");
    }
}
