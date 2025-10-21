package com.example.doccore;

public final class Document {
    private final String title;
    private final String content;

    public Document(String title, String content) {
        this.title = title == null ? "" : title;
        this.content = content == null ? "" : content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Document{title=\"" + title + "\", content=\"" + content + "\"}";
    }
}
