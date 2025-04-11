package com.pcarrijo.project.quarkusgeminibfs;


import com.pcarrijo.project.quarkusgeminibfs.ai.MyAiService;
import com.pcarrijo.project.quarkusgeminibfs.model.IslandRequest;
import com.pcarrijo.project.quarkusgeminibfs.service.NumberOfIslandsBFS;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/api/ai")
public class AppController {

    @Inject
    MyAiService myAiService;

    @POST

    @Path("/islands-count")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String islandscount(IslandRequest request) {
        char[][] grid = request.getGrid();
        String language = request.getLanguage();
        
        NumberOfIslandsBFS numberofislandsbfs = new NumberOfIslandsBFS();
        int islands_count = numberofislandsbfs.numIslands(grid);

        String prompt = "The total number of islands found was: " + islands_count + " | answer in "+language;
        return myAiService.chat(prompt);
    }

}
