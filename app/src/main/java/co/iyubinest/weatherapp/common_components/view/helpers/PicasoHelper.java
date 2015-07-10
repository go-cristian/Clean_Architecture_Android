package co.iyubinest.weatherapp.common_components.view.helpers;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by cristiangomez on 10/07/15.
 */
public class PicasoHelper implements ImageLoader {


    @Override
    public void load(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }
}
