package ca.hornyelgin.ilovechinachinaallthetime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jusitn on 2015-12-02.
 */
public class secondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair_layout);
        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("msgToSecondScreen");
        TextView callingActivityMessage = (TextView) findViewById(R.id.callingActivityInfoTextView);
        callingActivityMessage.append("*ready?*... " + previousActivity);

    }

    public void onSendUserName(View view) {
        EditText userNameET = (EditText) findViewById(R.id.userName);
        String userName = String.valueOf(userNameET.getText());
        Intent goBack = new Intent();
        goBack.putExtra("userName", userName);
        Toast.makeText(this, "er1", Toast.LENGTH_SHORT).show();
        setResult(RESULT_OK, goBack);
        Toast.makeText(this, "er2", Toast.LENGTH_SHORT).show();
        finish();

    }
}
