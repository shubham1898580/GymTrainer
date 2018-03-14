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


public class Tricep extends Fragment {
    ListView listView_tricep;
    String[] titel={"Dumbell Extension","Incline Tricep Extension","Cable Tricep Extension","Close Grip Bench Press","Narrow Grip Push Ups","Machine Tricep Extension"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_tricep, container, false);
        listView_tricep= (ListView)view. findViewById(R.id.listview_tricep);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_tricep.setAdapter(arrayAdapter);
        listView_tricep.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",40);
                    startActivity(intent);
                }
                if(position==1){
                    intent.putExtra("key",41);
                    startActivity(intent);
                }
                if(position==2){
                    intent.putExtra("key",42);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",43);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",44);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",45);
                    startActivity(intent);
                }
                if(position==6){
                    intent.putExtra("key",46);
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
