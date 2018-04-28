package corp.nxxl.mathhelper.fragments;


import android.app.ListFragment;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

public class FormulasFragment extends ListFragment{

    String teporems[] = new String[] {"Коши", "Коши буняковского"};

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);
    }
}
