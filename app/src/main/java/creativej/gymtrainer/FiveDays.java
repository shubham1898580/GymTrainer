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


public class FiveDays extends Fragment {
    ListView listView_chest;
    String[] titel={"Day 1 - Abs","Day 2 - Chest","Day 3 - Back","Day 4 - OFF","Day 5 - Shoulder","Day 6 - Bicep & Tricep","Day 7 - OFF"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_five_days, container, false);
        listView_chest= (ListView)view. findViewById(R.id.listview_five_days);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_chest.setAdapter(arrayAdapter);
        return view;
    }

}
