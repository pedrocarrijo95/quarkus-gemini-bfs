package com.pcarrijo.project.quarkusgeminibfs.model;

public class IslandRequest {

    private char[][] grid;
    private String language;

    public IslandRequest() {}

    public IslandRequest(char[][] grid, String language) {
        this.grid = grid;
        this.language = language;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }
    public char[][] getGrid() {
        return grid;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

}
