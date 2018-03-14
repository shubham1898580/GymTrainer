package creativej.gymtrainer;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.lang.reflect.Field;

import layout.Chest;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    com.google.firebase.analytics.FirebaseAnalytics object;
    Button alldays,fivedays,sixdays,sixpack,fourdays,abs,tipoftheday,basicbody;
    private FirebaseAnalytics mFirebaseAnalytics;

    AlertDialog alertDialog;

    ListView listView;
    String[] titel={"Chest","Shoulder","Back","Bicep","Tricep","Squats","Six Pack"};
    int[] imgid={R.drawable.chest,R.drawable.shoulder,R.drawable.back,R.drawable.bicep,R.drawable.tricep,R.drawable.squat1,R.drawable.sixpack};


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_exersices:

                    return true;
                case R.id.navigation_workouts:
Intent intent=new Intent(MainActivity.this,Workouts.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dailyUpdate:
                    Intent dailyintent=new Intent(MainActivity.this,TipOfThe.class);
                    startActivity(dailyintent);

                    return true;


                case R.id.navigation_more:
                    Intent moreintent=new Intent(MainActivity.this,MoreActivity.class);
                    startActivity(moreintent);
                    return true;
            }
            return false;
        }

    };

    public static void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            //Timber.e(e, "Unable to get shift mode field");
        } catch (IllegalAccessException e) {
            //Timber.e(e, "Unable to change value of shift mode");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        disableShiftMode(navigation);
// basic ex. activity content

        listView= (ListView) findViewById(R.id.listview);
        CustomListView customListView=new CustomListView(this,titel,imgid);


        listView.setAdapter(customListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });


        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

/*

        basicbody= (Button) findViewById(R.id.basicbodyex);
        basicbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BasicEx.class);
                startActivity(intent);
            }
        });
        tipoftheday= (Button) findViewById(R.id.tipoftheday);
        tipoftheday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TipOfThe.class);
                startActivity(intent);
            }
        });
   abs= (Button) findViewById(R.id.abs);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",7);
                startActivity(intent);
            }
        });
        sixpack= (Button) findViewById(R.id.sixpack);
        sixpack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",8);
                startActivity(intent);
            }
        });
        fourdays= (Button) findViewById(R.id.fourdays);
        fourdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",9);
                startActivity(intent);
            }
        });
        fivedays= (Button) findViewById(R.id.fivedays);
        fivedays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",10);
                startActivity(intent);
            }
        });
        sixdays= (Button) findViewById(R.id.sixdays);
        sixdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",11);
                startActivity(intent);
            }
        });
        alldays= (Button) findViewById(R.id.alldays);
        alldays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,One_Activity.class);
                intent.putExtra("position",12);
                startActivity(intent);
            }
        });*/

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Are you sure?").setTitle("Exit");
            builder1.setCancelable(false);

            builder1.setPositiveButton(
                    "yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();

                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();





        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.send) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + "jaini654321@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Gym Trainer");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "  ");

            try {
                startActivity(Intent.createChooser(emailIntent, "Send email using..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(MainActivity.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
            }

        }else if(id==R.id.disclaimer){







            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("All the content of this app are collected from internet as is.Owner of this app do not have any rights on the content present in this" +
                    " app and do not provide any kind of guarantee of this content.").setTitle("Disclaimer");
            builder1.setCancelable(true);



            AlertDialog alert11 = builder1.create();
            alert11.show();






        } else {
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

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent=new Intent(MainActivity.this,BasicEx.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent=new Intent(MainActivity.this,TipOfThe.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow) {
            Intent intent=new Intent(MainActivity.this,One_Activity.class);
            intent.putExtra("position",7);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Intent intent=new Intent(MainActivity.this,One_Activity.class);
            intent.putExtra("position",8);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
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

        } else if (id == R.id.nav_send) {

            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + "jaini654321@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Gym Trainer");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "My email's body");

            try {
                startActivity(Intent.createChooser(emailIntent, "Send email using..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(MainActivity.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
            }



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;


    }



}
