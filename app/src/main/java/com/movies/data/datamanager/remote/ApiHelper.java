package com.movies.data.datamanager.remote;

import com.movies.data.model.MoviesResponse;

import io.reactivex.Single;

public interface ApiHelper {
    Single<MoviesResponse> getMovies();
}