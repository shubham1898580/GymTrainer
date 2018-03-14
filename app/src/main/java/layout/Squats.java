package layout;

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

import creativej.gymtrainer.FinalPage;
import creativej.gymtrainer.R;


public class Squats extends Fragment {
    ListView listView_squats;
    String[] titel={"Barbell Squats","Front Barbell Squats","Calves Leg Press","Sumo Squat","Calf Machine","Calf Raiseon a Dumbell","Squats"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_squats, container, false);
        listView_squats= (ListView)view. findViewById(R.id.listview_squats);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_squats.setAdapter(arrayAdapter);
        listView_squats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",50);
                    startActivity(intent);
                }
                if(position==1){
                    intent.putExtra("key",51);
                    startActivity(intent);
                }
                if(position==2){
                    intent.putExtra("key",52);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",53);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",54);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",55);
                    startActivity(intent);
                }
                if(position==6){
                    intent.putExtra("key",56);
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



        return view;}


}
