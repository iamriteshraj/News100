package com.example.news100;

import java.util.ArrayList;

public class MainNews {


    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelA> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelA> articles) {
        this.articles = articles;
    }

    private String totalResults;

    public MainNews(String status, String totalResults, ArrayList<ModelA> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    private ArrayList<ModelA> articles;
}
