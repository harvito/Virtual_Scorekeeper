package ca.hornyelgin.virtualscorekeeper;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showPlayersTable(4, 4);

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

    public void showPlayersTable(int rows, int columns) {
        String stats[][] = new String[4][4];
        Integer k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                stats[i][j] = k.toString();
                k++;
            }
        }

        TableLayout table = (TableLayout) findViewById(R.id.playersTable);
        for (Integer i = 0; i < rows; i++) {
            TableRow tr = new TableRow(this);
            for (Integer j = 0; j < columns; j++) {
                TextView textview = new TextView(this);
                textview.setText(stats[i][j]);
                tr.addView(textview);
            }
            table.addView(tr);
        }

        /*for (int i = 0; i < rows; i++) {
            ArrayAdapter<CharSequence> playerTableAdapter = ArrayAdapter.createFromResource
                    (this, R.array.a1Stats, android.R.layout.simple_list_item_1);
            playerTableAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
            for (int j = 0; j < columns; j++) {

            }
        }*/

        /*Spinner teamsSpinner = (Spinner) findViewById(id);
        ArrayAdapter<CharSequence> teamsSpinnerAdapter = ArrayAdapter.createFromResource
                (this, R.array.listOfAllTeams, android.R.layout.simple_spinner_item);
        teamsSpinnerAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        teamsSpinner.setAdapter(teamsSpinnerAdapter);*/
    }
}
