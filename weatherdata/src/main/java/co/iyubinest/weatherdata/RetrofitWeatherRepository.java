package co.iyubinest.weatherdata;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;

import java.util.Date;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;

/**
 * Created by cristiangomez on 10/07/15.
 */
public class RetrofitWeatherRepository implements WeatherRepository{

    private final WeatherService weatherService;

    public RetrofitWeatherRepository() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new DateTypeAdapter())
                .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://demo6339870.mockable.io")
                .setConverter(new GsonConverter(gson))
                .build();
        weatherService = restAdapter.create(WeatherService.class);
    }


    @Override
    public void getWeather(final WeatherRepositoryCallback weatherRepositoryCallback) {
        weatherService.geWeather(new Callback<Weather>() {
            @Override
            public void success(Weather weather, Response response) {
                weatherRepositoryCallback.onSuccess(weather);
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                weatherRepositoryCallback.onFailure(retrofitError);
            }
        });
    }
}
