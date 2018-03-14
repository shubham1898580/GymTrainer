package creativej.gymtrainer;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import layout.Bicep;
import layout.Chest;
import layout.Lats;
import layout.Shoulder;
import layout.SixPack;
import layout.Squats;
import layout.Tricep;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class One_Activity extends AppCompatActivity {
    int position;
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4996416652632375/9094401133");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());







        Bundle bundle = getIntent().getExtras();
         position=bundle.getInt("position");
        if (position == 0) {
            Fragment fragment =new Chest();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 1) {
            Fragment fragment =new Shoulder();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 2) {
            Fragment fragment =new Lats();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 3) {
            Fragment fragment =new Bicep();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 4) {
            Fragment fragment =new Tricep();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 5) {
            Fragment fragment =new Squats();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 6) {
            Fragment fragment =new SixPack();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 7) {
            Fragment fragment =new Abs();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 8) {
            Fragment fragment =new SixPack();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 9) {
            Fragment fragment =new FourDays();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 10) {
            Fragment fragment =new FiveDays();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 11) {
            Fragment fragment =new SixDays();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }
        if (position == 12) {
            Fragment fragment =new AllDays();
            android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }



    }


    @Override
    public void onBackPressed() {
               int a= (int) ((Math.random())*1000);
        if(a%2==0){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

        }}
      finish();
        super.onBackPressed();
    }


}
