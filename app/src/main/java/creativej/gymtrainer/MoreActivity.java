package creativej.gymtrainer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MoreActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private static final String TAG = "MainActivity";

    private AdView mAdView;
    ListView listView;
    String[] titel={"Rate Us","Send Feedback","Tell a Friend","Join us on Facebook","Our other apps"};
    int[] imgid={R.drawable.rating,R.drawable.feedback,R.drawable.users,R.drawable.facebook,R.drawable.playstore};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mToolbar= (Toolbar) findViewById(R.id.app_bar_more);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("More");




        listView= (ListView) findViewById(R.id.listview_more);
        CustomListView customListView=new CustomListView(this,titel,imgid);

        listView.setAdapter(customListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0){

                   Uri uri = Uri.parse("market://details?id=" + getPackageName());
                   Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                   // To count with Play market backstack, After pressing back button,
                   // to taken back to our application, we need to add following flags to intent.
                   goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                           Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                           Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                   try {
                       startActivity(goToMarket);
                   } catch (ActivityNotFoundException e) {
                       startActivity(new Intent(Intent.ACTION_VIEW,
                               Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                   }
               }

               if(position==1){
                   Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                   emailIntent.setData(Uri.parse("mailto:" + "jaini654321@gmail.com"));
                   emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Gym Trainer");
                   emailIntent.putExtra(Intent.EXTRA_TEXT, "  ");

                   try {
                       startActivity(Intent.createChooser(emailIntent, "Send email using..."));
                   } catch (android.content.ActivityNotFoundException ex) {
                       Toast.makeText(MoreActivity.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
                   }
               }
                if(position==2){

                    try {
                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("text/plain");
                        i.putExtra(Intent.EXTRA_SUBJECT, " Gym Trainer ");
                        String sAux = "\nLet me recommend you this application\n" +
                                "this is one of the best app i ever use so plz downloade and use it.\n";
                        sAux = sAux + "https://play.google.com/store/apps/details?id=creativej.gymtrainer \n\n";
                        i.putExtra(Intent.EXTRA_TEXT, sAux);
                        startActivity(Intent.createChooser(i, "choose one"));
                    } catch(Exception e) {
                        //e.toString();
                    }

                }

                if(position==3){
                    Intent facebookIntent = getOpenFacebookIntent(MoreActivity.this);
                    startActivity(facebookIntent);
                }
                if(position==4){

                    Uri uri = Uri.parse("https://play.google.com/store/search?q=creativej&hl=en" );
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/search?q=creativej&hl=en" )));
                    }
                }

            }
        });






    }
    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://Gym-Trainer-Fitness-Bodybuilding-495978977436811/")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/Gym-Trainer-Fitness-Bodybuilding-495978977436811/")); //catches and opens a url to the desired page
        }
    }
}
