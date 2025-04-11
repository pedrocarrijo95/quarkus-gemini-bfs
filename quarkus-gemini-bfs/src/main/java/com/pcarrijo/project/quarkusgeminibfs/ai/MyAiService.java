package com.pcarrijo.project.quarkusgeminibfs.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(modelName="m1")
public interface MyAiService {
    @SystemMessage("You are a professional poet")
    String chat(@UserMessage String input);
}
