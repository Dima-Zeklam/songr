package com.example.songr.repository;

import com.example.songr.models.Album;
import com.example.songr.models.Songs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongsRepository extends CrudRepository<Songs,Integer> {
}