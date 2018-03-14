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


public class Bicep extends Fragment {
    ListView listView_bicep;
    String[] titel={"Chin Ups","Bicep Curls","Dumbell Curls","Preacher Curls","Cable Curls","Concentration Curls"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bicep, container, false);

        listView_bicep= (ListView)view. findViewById(R.id.listview_bicep);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_bicep.setAdapter(arrayAdapter);
        listView_bicep.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",30);
                    startActivity(intent);
                }
                if(position==1){
                    intent.putExtra("key",31);
                    startActivity(intent);
                }
                if(position==2){
                    intent.putExtra("key",32);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",33);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",34);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",35);
                    startActivity(intent);
                }
                if(position==6){

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
