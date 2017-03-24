package com.example.rub.githubtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.homemenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int itemThatSelect = item.getItemId();
            if(itemThatSelect == R.id.gobar){
                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                startActivity(intent);
                return true;
            }
        return super.onOptionsItemSelected(item);
        }

}
