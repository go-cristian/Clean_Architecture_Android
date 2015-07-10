package co.iyubinest.weatherapp.domain.interactors;

import co.iyubinest.weatherdata.RetrofitWeatherRepository;
import co.iyubinest.weatherdata.Weather;
import co.iyubinest.weatherdata.WeatherRepository;
import co.iyubinest.weatherdata.WeatherRepositoryCallback;

/**
 * Created by cristiangomez on 10/07/15.
 */
public class WeatherInteractor implements Interactor<Weather> {


    private WeatherRepository wheaterRepository = new RetrofitWeatherRepository();

    @Override
    public void execute(final InteractorResponse<Weather> response) {
        wheaterRepository.getWeather(new WeatherRepositoryCallback() {
            @Override
            public void onSuccess(Weather weather) {
                response.onFinish(weather);
            }

            @Override
            public void onFailure(Exception e) {
                e.printStackTrace();
            }
        });
    }
}
