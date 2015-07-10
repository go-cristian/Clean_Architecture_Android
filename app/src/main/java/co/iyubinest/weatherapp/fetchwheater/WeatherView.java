package co.iyubinest.weatherapp.fetchwheater;


import co.iyubinest.weatherdata.Weather;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface WeatherView {

    void onWeatherFetchButtonClick();

    void onWeatherFetched(Weather weather);

}
