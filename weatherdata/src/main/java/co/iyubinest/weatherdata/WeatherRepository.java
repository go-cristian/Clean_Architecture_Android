package co.iyubinest.weatherdata;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface WeatherRepository {

    void getWeather(WeatherRepositoryCallback weatherRepositoryCallback);
}
