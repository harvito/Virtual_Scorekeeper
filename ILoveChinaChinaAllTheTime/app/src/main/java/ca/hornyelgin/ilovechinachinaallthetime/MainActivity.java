package ca.hornyelgin.ilovechinachinaallthetime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        });

        final ImageView firstImageView = (ImageView) findViewById(R.id.imageView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_chinaAllTheTime) {
            Toast.makeText(this, "CHINA ALL THE TIME", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.action_settings) {
            Toast.makeText(this, "I WILL BUILD A WALL", Toast.LENGTH_SHORT).show();;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onTrumpClick(View view) {
        final TextView textUnderTrump = (TextView) findViewById(R.id.textUnderTrump);
        Toast.makeText(this, "MAKE AMERICA GREAT AGAIN", Toast.LENGTH_SHORT).show();
        textUnderTrump.setText("I HAVE MANY MEXICAN FRIENDS.");
    }

    public void onSecondScreenClick(View view) {
        Intent secondScreenIntent = new Intent(this, secondScreen.class);

        final int result = 1;
        secondScreenIntent.putExtra("msgToSecondScreen","MainActivity");
        startActivityForResult(secondScreenIntent, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView userNameMsg = (TextView) findViewById(R.id.textUnderTrump);
        String nameSentBack = data.getStringExtra("userName");
        userNameMsg.append(" " + nameSentBack + " IS ONE OF THEM!");


    }
}
