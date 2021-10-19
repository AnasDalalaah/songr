package com.songr.songr.repository;

import com.songr.songr.model.Album;

import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<Album, Long> {
}