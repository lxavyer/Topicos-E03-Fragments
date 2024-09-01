package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_place_details, container, false);
    }


    public void atualizaLugar(Place lugar) {

        if(getActivity() != null) {

            ImageView imgPlace = this.getActivity().findViewById(R.id.img_place);
            TextView txtPlace = this.getActivity().findViewById(R.id.txt_place);
            TextView txtDescription = this.getActivity().findViewById(R.id.txt_description);
            RatingBar ratingBar = this.getActivity().findViewById(R.id.rating_bar);
            TextView txtDistance = this.getActivity().findViewById(R.id.txt_distance);

            imgPlace.setImageResource(lugar.getPhotoId());
            txtPlace.setText(lugar.getName());
            txtDescription.setText(lugar.getDescription());
            ratingBar.setRating(lugar.getRate());
            txtDistance.setText(lugar.getDistance().toString() + " KM");
        }
    }

}
