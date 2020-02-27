package com.example.SpringExample;


public class Quatation {
    private String testName;
    private String content;
    private String author;

    public Quatation(String content, String author, String testName) {
        this.content = content;
        this.author = author;
        this.testName = testName;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
