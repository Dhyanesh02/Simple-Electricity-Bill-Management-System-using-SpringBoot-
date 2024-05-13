package com.example.demo.model;

import org.bson.types.ObjectId;

import java.util.List;

public record MovieModel(
        ObjectId id,
        String imdbId,
        String title,
        String releaseDate,
        String trailerLink,
        List<String> genres,
        String poster,
        List<String>backdrops
) {
}
