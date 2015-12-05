package ca.hornyelgin.virtualscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Jusitn on 2015-12-03.
 */
public class liveMatch extends android.support.v7.app.AppCompatActivity {

    private Spinner matchPlayersSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_live_layout);
        Intent popMatchDateVsPlace = new Intent(this, liveInfoPop.class);
        final int result = 1;
        startActivityForResult(popMatchDateVsPlace, result);
        addPlayersToSpinner();
        addListenertoSpinner();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView team1 = (TextView) findViewById(R.id.team1);
        TextView team2 = (TextView) findViewById(R.id.team2);
        TextView date = (TextView) findViewById(R.id.autoDate);
        TextView location = (TextView) findViewById(R.id.autoLocation);

        String team1Returned = data.getStringExtra("team1");
        String team2Returned = data.getStringExtra("team2");
        String dateReturned = data.getStringExtra("date");
        String locationReturned = data.getStringExtra("location");

        team1.setText(team1Returned);
        team2.setText(team2Returned);
        date.setText(dateReturned);
        location.setText(locationReturned);

    }

    public void addPlayersToSpinner() {
        matchPlayersSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> matchPlayersSpinnerAdapter = ArrayAdapter.createFromResource
                (this, R.array.teamAPlayersLiveInput, android.R.layout.simple_spinner_item);
        matchPlayersSpinnerAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        matchPlayersSpinner.setAdapter(matchPlayersSpinnerAdapter);
    }

    public void addListenertoSpinner() {
        matchPlayersSpinner = (Spinner) findViewById(R.id.spinner);
        matchPlayersSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelectedInSpinner = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onAddShot() {

    }

    public void onLiveMatchFinish(View view) {

    }
}
