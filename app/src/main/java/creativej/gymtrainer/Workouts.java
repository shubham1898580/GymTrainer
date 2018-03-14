package creativej.gymtrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Workouts extends AppCompatActivity {
    private Toolbar mToolbar;
    Button alldays,fivedays,sixdays,fourdays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);


        mToolbar= (Toolbar) findViewById(R.id.workout_app_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Workouts");



        fourdays= (Button) findViewById(R.id.fourdays);
        fourdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Workouts.this,One_Activity.class);
                intent.putExtra("position",9);
                startActivity(intent);
            }
        });
        fivedays= (Button) findViewById(R.id.fivedays);
        fivedays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Workouts.this,One_Activity.class);
                intent.putExtra("position",10);
                startActivity(intent);
            }
        });
        sixdays= (Button) findViewById(R.id.sixdays);
        sixdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Workouts.this,One_Activity.class);
                intent.putExtra("position",11);
                startActivity(intent);
            }
        });
        alldays= (Button) findViewById(R.id.alldays);
        alldays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Workouts.this,One_Activity.class);
                intent.putExtra("position",12);
                startActivity(intent);
            }
        });
    }
}
