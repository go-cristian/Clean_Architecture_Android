package co.iyubinest.weatherdata;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface WeatherService {

    @GET("/weather")
    void geWeather(Callback<Weather> weatherCallback);
}
