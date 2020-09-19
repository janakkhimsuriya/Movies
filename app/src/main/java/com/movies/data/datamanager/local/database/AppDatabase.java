package com.movies.data.datamanager.local.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.movies.data.datamanager.local.database.dao.MoviesDao;
import com.movies.data.model.movielist.Movie;
import com.movies.utils.StringArrayConverter;

@Database(entities = {Movie.class}, version = 1)
@TypeConverters(StringArrayConverter.class)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MoviesDao moviesDao();
}
