package creativej.gymtrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BasicEx extends AppCompatActivity {
    ListView listView;
    String[] titel={"Chest","Shoulder","Back","Bicep","Tricep","Squats","Six Pack"};
    int[] imgid={R.drawable.chest,R.drawable.shoulder,R.drawable.back,R.drawable.bicep,R.drawable.tricep,R.drawable.squat1,R.drawable.sixpack};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_ex);

        listView= (ListView) findViewById(R.id.listview);
        CustomListView customListView=new CustomListView(this,titel,imgid);


        listView.setAdapter(customListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(BasicEx.this,One_Activity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}
