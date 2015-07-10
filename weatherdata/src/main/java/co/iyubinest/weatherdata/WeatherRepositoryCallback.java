package co.iyubinest.weatherdata;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface WeatherRepositoryCallback {
    void onSuccess(Weather weather);

    void onFailure(Exception e);
}
