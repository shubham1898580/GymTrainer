package creativej.gymtrainer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splesh_Activity extends AppCompatActivity {
    private static int spleshtimeout=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh_);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splesh_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },spleshtimeout);
    }
}
