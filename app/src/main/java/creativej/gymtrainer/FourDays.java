package creativej.gymtrainer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FourDays extends Fragment {
    ListView listView_chest;
    String[] titel={"Day 1 - Back and Biceps","Day 2 - Chest and Triceps","Day 3 - OFF","Day 4 - Squads","Day 5 - OFF","Day 6 - Shoulders","Day 7 - OFF"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_four_days, container, false);
        listView_chest= (ListView)view. findViewById(R.id.listview_four_days);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_chest.setAdapter(arrayAdapter);

        return view;}


}
