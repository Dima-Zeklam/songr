package com.example.songr.repository;

import com.example.songr.models.Album;
import com.example.songr.models.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.function.Supplier;

public interface SongRepository extends CrudRepository<Songs,Integer> {
// It represents a function which does not take in any argument but produces a value of type T.
Supplier<Album> findById(Album album);

}
