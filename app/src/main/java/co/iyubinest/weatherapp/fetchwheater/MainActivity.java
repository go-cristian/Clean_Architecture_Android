package co.iyubinest.weatherapp.fetchwheater;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import co.iyubinest.weatherapp.R;
import co.iyubinest.weatherapp.common_components.BaseActivity;
import co.iyubinest.weatherapp.common_components.view.helpers.PicasoHelper;
import co.iyubinest.weatherapp.fetchwheater.entities.Weather;

public class MainActivity extends BaseActivity implements WeatherView {

    @Bind(R.id.fetchwheater_button)
    Button fetchWheaterButton;

    @Bind(R.id.fetchwheater_label)
    TextView fetchWheaterLabel;

    @Bind(R.id.fetchwheater_header)
    ImageView fetchWheaterHeader;

    private WeatherPresenter weatherPresenter = new WeatherPresenter();
    private PicasoHelper imageLoader = new PicasoHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        weatherPresenter.onCreate();
        weatherPresenter.setView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        weatherPresenter.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        weatherPresenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        weatherPresenter.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        weatherPresenter.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        weatherPresenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        weatherPresenter.onDestroy();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        weatherPresenter.onAttachedToWindow();
    }

    @Override
    @OnClick(R.id.fetchwheater_button)
    public void onWeatherFetchButtonClick() {
        weatherPresenter.onWheaterFetchButtonClick();
    }

    @Override
    public void onWeatherFetched(Weather weather) {
        fetchWheaterLabel.setText(weather.getWeather());
        imageLoader.load(fetchWheaterHeader, weather.getCoverUrl());
    }

}
