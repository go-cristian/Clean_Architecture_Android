package co.iyubinest.weatherapp.domain.interactors;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface InteractorResponse <E> {
    void onFinish(E response);
}
