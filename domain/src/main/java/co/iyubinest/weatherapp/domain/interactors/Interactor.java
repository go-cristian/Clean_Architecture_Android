package co.iyubinest.weatherapp.domain.interactors;

/**
 * Created by cristiangomez on 10/07/15.
 */
public interface Interactor<E> {
    void execute(InteractorResponse<E> interactorResponse);
}
