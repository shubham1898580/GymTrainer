package layout;

import android.content.Intent;
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


public class Chest extends Fragment {

    ListView listView_chest;
    String[] titel={"Push Ups","Pull Ups","Incline Dumbell Press","Decline Press","Incline Bench Dumbell Fly","Chest Dips","Dumbell Bent arm Pullover"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chest, container, false);
        listView_chest= (ListView)view. findViewById(R.id.listview_chest);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_chest.setAdapter(arrayAdapter);
        listView_chest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",0);
                    startActivity(intent);


                }
                if(position==1){
                    intent.putExtra("key",1);
                    startActivity(intent);

                }
                if(position==2){
                    intent.putExtra("key",2);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",3);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",4);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",5);
                    startActivity(intent);
                }
                if(position==6){
                    intent.putExtra("key",6);
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
