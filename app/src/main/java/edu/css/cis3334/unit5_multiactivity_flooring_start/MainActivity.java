//===============================================
// Project name: Unit5_MultiActivity_Flooring_Start
// Author: Trish Valeri
// Contributors: CIS 3334
// Date: 2/19/16, 2/20/16
// Purpose: calculate the flooring needed based on width and length. (pass into a second activity
//          by the use of an intent.
//===============================================

package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        //creates new intent
        Intent i = new Intent(this, ResultActivity.class);

        //assigns variable to etWidth
        final EditText editWidth = (EditText)
                findViewById(R.id.etWidth);
        //assigns variable to the text retrieved from etWidth edit text field.
        //also retrieves the user input and gets its string value.
        String str_width = editWidth.getText().toString();
        //puts the string into "extras" to get bundled.
        i.putExtra("wString", str_width);

        //assigns variable to etLength
        final EditText editLength = (EditText)
                findViewById(R.id.etLength);
        //assigns variable to the text retrieved from etLength edit text field.
        //also retrieves the user input and gets its string value.
        String str_length = editLength.getText().toString();
        //puts the string into "extras" to get bundled.
        i.putExtra("lString", str_length);

        //starts intent, passing the bundled object as argument
        startActivity(i);
    }
}
