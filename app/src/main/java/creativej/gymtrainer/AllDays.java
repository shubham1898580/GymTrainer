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


public class AllDays extends Fragment {
    ListView listView_chest;
    String[] titel={"Day 1 - Bicep","Day 2 - Chest","Day 3 - Back","Day 4 - Shoulders","Day 5 - Squats","Day 6 - Tricep","Day 7 - Abs"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_all_days, container, false);
        listView_chest= (ListView)view. findViewById(R.id.listview_all_days);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_chest.setAdapter(arrayAdapter);

        return view;
    }

}

