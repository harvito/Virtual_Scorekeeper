package ca.hornyelgin.virtualscorekeeper;

/**
 * Created by Jusitn on 2015-12-04.
 */
import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

public class liveInfoPop extends Activity {

    PopupWindow popUp;
    LinearLayout layout;
    TextView tv;
    LayoutParams params;
    LinearLayout mainLayout;
    Button but;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_date_vs_place_pop);
        populateSpinner(R.id.teamSpinner1);
        populateSpinner(R.id.teamSpinner2);
        addSpinnerListener(R.id.teamSpinner1);
        addSpinnerListener(R.id.teamSpinner2);


    }

    public void populateSpinner(int id) {
        Spinner teamsSpinner = (Spinner) findViewById(id);
        ArrayAdapter<CharSequence> teamsSpinnerAdapter = ArrayAdapter.createFromResource
                (this, R.array.listOfAllTeams, android.R.layout.simple_spinner_item);
        teamsSpinnerAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        teamsSpinner.setAdapter(teamsSpinnerAdapter);

    }

    public void addSpinnerListener(int id) {
        Spinner teamsSpinner = (Spinner) findViewById(id);
        teamsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelectedInSpinner = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onPopOK(View view) {
        Spinner team1Spinner = (Spinner) findViewById(R.id.teamSpinner1);
        String team1 = String.valueOf(team1Spinner.getSelectedItem());
        Spinner team2Spinner = (Spinner) findViewById(R.id.teamSpinner2);
        String team2 = String.valueOf(team2Spinner.getSelectedItem());
        EditText dateET = (EditText) findViewById(R.id.datePop);
        String date = String.valueOf(dateET.getText());
        EditText locationET = (EditText) findViewById(R.id.locationPop);
        String location = String.valueOf(locationET.getText());

        if (!team1.equals(team2)) {
            Intent startMatch = new Intent();

            startMatch.putExtra("date", date);
            startMatch.putExtra("location", location);
            startMatch.putExtra("team1", team1);
            startMatch.putExtra("team2", team2);
            Toast.makeText(this, "er1", Toast.LENGTH_SHORT).show();
            setResult(RESULT_OK, startMatch);
            Toast.makeText(this, "er2", Toast.LENGTH_SHORT).show();
            finish();
        }
        else Toast.makeText(this, "Teams must differ", Toast.LENGTH_SHORT).show();
    }
}