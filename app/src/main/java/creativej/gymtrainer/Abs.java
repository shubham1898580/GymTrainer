package creativej.gymtrainer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Abs extends Fragment {
    ListView listView_abs;
    String[] titel={"Hanging Leg Circles","Hanging Side-to-Side Knees","Cable Isometric Hold","Side Plank With Cable Hold","Mountain Climbers","Side Crunch"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_abs, container, false);

        listView_abs= (ListView)view. findViewById(R.id.listview_abs);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_abs.setAdapter(arrayAdapter);
        listView_abs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",70);
                    startActivity(intent);
                }
                if(position==1){
                    intent.putExtra("key",71);
                    startActivity(intent);
                }
                if(position==2){
                    intent.putExtra("key",72);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",73);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",74);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",75);
                    startActivity(intent);
                }
                if(position==6){
                    intent.putExtra("key",76);
                    startActivity(intent);
                }
                if(position==7){

                }
                if(position==8){

                }
                if(position==9){

                }
                if(position==10){

                }
            }
        });


        return view;
    }

}
