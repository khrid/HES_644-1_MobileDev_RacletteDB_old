package ch.hevs.students.raclettedb;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private MenuItem muAdministration;
    private ImageView imDrawerHeaderLogo;
    private int adminClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //FloatingActionButton fab = findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        // Configuration des différents éléments du menu
        setup();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        //hideMenuAdministration();
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void setup() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_fromages, R.id.nav_alpages, R.id.nav_about, R.id.nav_admin)
                .setDrawerLayout(drawer)
                .build();

        muAdministration = navigationView.getMenu().findItem(R.id.nav_admin);
        hideMenuAdministration();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        imDrawerHeaderLogo = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.iv_header_logo);
        imDrawerHeaderLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(++adminClickCount >= 5) {
                    showMenuAdministration();
                    View parentLayout = findViewById(android.R.id.content);
                    imDrawerHeaderLogo.setOnClickListener(null);
                    Snackbar.make(parentLayout, R.string.admin_activated, Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }

    public void showMenuAdministration() {
        muAdministration.setVisible(true);
    }

    public void hideMenuAdministration() {
        muAdministration.setVisible(false);
    }
}