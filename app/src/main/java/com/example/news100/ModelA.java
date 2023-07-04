package com.example.news100;

public class ModelA {


    public String author;
    public String title;
    public String description;
    public String urlToImage;
    public String url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ModelA(String author, String title, String description, String urlToImage, String url, String publishedAt) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.urlToImage = urlToImage;
        this.url = url;
        this.publishedAt = publishedAt;
    }

    String publishedAt;
}
