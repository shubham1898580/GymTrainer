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


public class Shoulder extends Fragment {
    ListView listView_shoulder;
    String[] titel={"Military Press","Dumbell Press","Seated Military Press Machine","Dumbell lateral Raise","Cable Front Raise","Up Right Rows",};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_shoulder, container, false);
        // Inflate the layout for this fragment
        listView_shoulder= (ListView)view. findViewById(R.id.listview_shoulder);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(super.getActivity(),android.R.layout.simple_list_item_1,titel);
        listView_shoulder.setAdapter(arrayAdapter);
        listView_shoulder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), FinalPage.class);
                if(position==0){
                    intent.putExtra("key",10);
                    startActivity(intent);
                }
                if(position==1){
                    intent.putExtra("key",11);
                    startActivity(intent);
                }
                if(position==2){
                    intent.putExtra("key",12);
                    startActivity(intent);
                }
                if(position==3){
                    intent.putExtra("key",13);
                    startActivity(intent);
                }
                if(position==4){
                    intent.putExtra("key",14);
                    startActivity(intent);
                }
                if(position==5){
                    intent.putExtra("key",15);
                    startActivity(intent);
                }
                if(position==6){
                    intent.putExtra("key",16);
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
