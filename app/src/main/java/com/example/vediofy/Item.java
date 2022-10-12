package com.example.vediofy;

public class Item {

    String videoname;
    String url;
    String length;
    int image;

    public Item(String videoname, String url, String length, int image) {
        this.videoname = videoname;
        this.url = url;
        this.length = length;
        this.image = image;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
