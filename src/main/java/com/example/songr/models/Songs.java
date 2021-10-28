package com.example.songr.models;

import javax.persistence.*;

@Entity
public class Songs {
    public Songs() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String title;
    private int lengths;
    private int trackNumber;
    private String album;
    @ManyToOne
    private Album albumsSong;



    public Album getAlbumsSong() {
        return albumsSong;
    }

    public void setAlbumsSong(Album albumsSong) {
        this.albumsSong = albumsSong;
    }

    public Songs(String title, int lengths, int trackNumber, String album) {
        this.title = title;
        this.lengths = lengths;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public int getLengths() {
        return lengths;
    }

    public void setLengths(int lengths) {
        this.lengths = lengths;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return lengths;
    }

    public void setLength(int lengths) {
        this.lengths = lengths;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }


}
