package com.strongties.sanjeevan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    Locale myLocale;
    String currentLanguage = "en", currentLang;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentLanguage = getIntent().getStringExtra(currentLang);
        context = this;


        SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
        String savedlanguage = prefs.getString("language", "en");
        int runcount = prefs.getInt("runcount", 1);
        SharedPreferences.Editor editor = prefs.edit();

        //For Application First run only
        if (runcount == 1) {
            editor.putInt("runcount", 2);
            editor.apply();
        }

        if (runcount == 2){
            editor.putInt("runcount", 3);
            editor.apply();
            String[] languages = {getString(R.string.sel_en), getString(R.string.sel_or), getString(R.string.sel_hi), getString(R.string.sel_tam)};

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(R.string.sel_lang));
            builder.setItems(languages, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int selected) {
                    // the user clicked on languages[selected]
                    switch (selected) {
                        case 0:
                            setLocale("en");
                            break;
                        case 1:
                            setLocale("or");
                            break;
                        case 2:
                            setLocale("hi");
                            break;
                        case 3:
                            setLocale("tam");
                            break;
                    }
                }
            });
            builder.show();

        }


        new Thread() {
            public void run() {
                try {
                    sleep(500 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();



        // Cached Language Load
        if (!savedlanguage.equals(currentLanguage)) {
            setLocale(savedlanguage);
        }


        //Main Action
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));

        drawer = findViewById(R.id.draw_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_open);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        //Fragment on Open
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment(), "HomeFragment").commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                break;

            case R.id.nav_symptoms:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new SymptomFragment()).commit();
                break;

            case R.id.nav_covid19india:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new covid19IndiaFragment()).commit();
                break;

            case R.id.nav_mohfw:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new mohfwFragment()).commit();
                break;
            case R.id.nav_mohfw_state:
                SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
                String native_home = prefs.getString("homestate", "firstaccess");
                if(native_home.equals("firstaccess"))
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new selectStateFragment()).commit();
                else {
                    mohfwStateFragment stateFragment = new mohfwStateFragment();
                    Bundle args = new Bundle();
                    args.putString("url", native_home);
                    stateFragment.setArguments(args);
                    getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                            stateFragment).commit();
                }
                break;

            case R.id.nav_covid19world:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new covid19WorldFragment()).commit();
                break;

            case R.id.nav_covid19helpline:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new covid19HelplineFragment()).commit();
                break;

            case R.id.select_state:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        new selectStateFragment()).commit();
                break;

            case R.id.action_settings:
                context = getBaseContext();
                AlertDialog.Builder builder_ = new AlertDialog.Builder(this);
                builder_.setTitle(getString(R.string.support_head));
                String[] devs = {getString(R.string.support_dev1), getString(R.string.support_dev2)};
                builder_.setItems(devs, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selected) {
                        // the user clicked on languages[selected]
                        switch (selected) {
                            default:
                                Toast.makeText(context, getString(R.string.support_msg), Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });
                builder_.show();
                break;

            case R.id.nav_lang:
                String[] languages = {getString(R.string.sel_en), getString(R.string.sel_or), getString(R.string.sel_hi), getString(R.string.sel_tam)};

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(getString(R.string.sel_lang));
                builder.setItems(languages, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selected) {
                        // the user clicked on languages[selected]
                        switch (selected) {
                            case 0:
                                setLocale("en");
                                break;
                            case 1:
                                setLocale("or");
                                break;
                            case 2:
                                setLocale("hi");
                                break;
                            case 3:
                                setLocale("tam");
                                break;
                        }
                    }
                });
                builder.show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    public void setLocale(String localeName) {
        if (!localeName.equals(currentLanguage)) {
            SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("language", localeName);
            editor.commit();

            myLocale = new Locale(localeName);
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = myLocale;
            res.updateConfiguration(conf, dm);
            Intent refresh = new Intent(this, MainActivity.class);
            refresh.putExtra(currentLang, localeName);
           // finish();
            startActivity(refresh);
        } else {
            Toast.makeText(this, "Language already selected!", Toast.LENGTH_SHORT).show();
        }
    }

}
