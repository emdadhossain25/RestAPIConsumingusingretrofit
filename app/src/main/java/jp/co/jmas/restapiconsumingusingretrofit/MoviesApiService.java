package jp.co.jmas.restapiconsumingusingretrofit;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Administrator on 4/8/2017.
 */

public interface  MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
