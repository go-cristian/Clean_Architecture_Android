package co.iyubinest.weatherapp.fetchwheater;

import android.util.Log;

import co.iyubinest.weatherapp.domain.interactors.Interactor;
import co.iyubinest.weatherapp.domain.interactors.InteractorResponse;
import co.iyubinest.weatherapp.domain.interactors.WeatherInteractor;
import co.iyubinest.weatherdata.Weather;

/**
 * Created by cristiangomez on 10/07/15.
 */
public class WeatherPresenter {

    private static final String PRESENTER_TAG = "Weather Presenter";

    private WeatherView view;

    private Interactor weatherInteractor = new WeatherInteractor();

    public void onCreate() {
        Log.v(PRESENTER_TAG, "Creating view");
    }

    public void setView(WeatherView view) {
        this.view = view;
    }

    public void onStop() {
        Log.v(PRESENTER_TAG, "Stoping view");
    }

    public void onStart() {
        Log.v(PRESENTER_TAG, "Starting view");
    }

    public void onResume() {
        Log.v(PRESENTER_TAG, "Resuming view");
    }

    public void onRestart() {
        Log.v(PRESENTER_TAG, "Restarting view");
    }

    public void onPause() {
        Log.v(PRESENTER_TAG, "Pausing view");
    }

    public void onDestroy() {
        Log.v(PRESENTER_TAG, "Destroying view");
    }

    public void onAttachedToWindow() {
        Log.v(PRESENTER_TAG, "Attaching view");
    }

    public void onWheaterFetchButtonClick() {
        Log.v(PRESENTER_TAG, "Button Clicked");
        weatherInteractor.execute(new InteractorResponse<Weather>() {
            @Override
            public void onFinish(Weather weather) {
                view.onWeatherFetched(weather);
            }
        });

    }
}
