package ca.hornyelgin.virtualscorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Jusitn on 2015-12-03.
 */
public class teamRank extends android.support.v7.app.AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_rank_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_team_rankings) {
            Intent teamRank = new Intent(this, teamRank.class);
            final int result = 1;
            startActivity(teamRank);
        }
        else if (id == R.id.action_player_rankings) {
            Intent playerRank = new Intent(this, MainActivity.class);
            final int result = 1;
            startActivity(playerRank);
        }
        else if (id == R.id.action_admin_login) {
            Intent adminLogin = new Intent(this, ca.hornyelgin.virtualscorekeeper.LoginActivity.class);
            final int result = 1;
            startActivity(adminLogin);
        }
        else if (id == R.id.action_live_input) {
            Intent liveInput = new Intent(this, liveMatch.class);
            final int result = 1;
            startActivityForResult(liveInput, result);
        }
        else if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
