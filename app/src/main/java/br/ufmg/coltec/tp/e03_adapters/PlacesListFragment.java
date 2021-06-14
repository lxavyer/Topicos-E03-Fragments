package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class PlacesListFragment extends ListFragment {

    private Place[] lugares = {
        new Place("Machu Picchu", "Cidade histórica do povo Inca", R.drawable.ic_machu_picchu, 3133.98, 4.f),
        new Place("Alhambra", "Palácio árabe na cidade de Granada, ESP.", R.drawable.ic_alhambra, 7626.22, 5.f),
        new Place("Bariloche", "Cidade turística ao sudoeste da Argentina", R.drawable.ic_bariloche, 3498.84, 4.f),
        new Place("Coliseu", "Lugar de grandes espetáculos na época do Império Romano", R.drawable.ic_coliseu, 9318.41, 5.f),
        new Place("Muralha da China", "Simplesmente a maior muralha do mundo!", R.drawable.ic_muralha_china, 17105.55, 3.5f)
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places_list, container, false);
        PlaceAdapter adapter = new PlaceAdapter(this.getActivity(), lugares);
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Place lugarSelecionado = this.lugares[position];

        // TODO[4]: Recuperar PlaceFragment e atualizar o lugar
    }
}
