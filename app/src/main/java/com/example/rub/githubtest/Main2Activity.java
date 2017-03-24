package com.example.rub.githubtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.submenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int itemTahtselected = item.getItemId();
        if(itemTahtselected == R.id.backto){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
