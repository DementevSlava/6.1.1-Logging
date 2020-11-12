package com.dementev.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LIFECYCLE = "lifecycle";
private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LIFECYCLE, "onCreate");
        textView = findViewById(R.id.textView);
        textView.append("\n" + "onCreate");
        if (savedInstanceState != null){
            textView.append(savedInstanceState.getString("textView"));
            Log.d(LIFECYCLE, "Bundle not null");
            textView.append("\n" + "Bundle not null");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LIFECYCLE, "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LIFECYCLE, "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LIFECYCLE, "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LIFECYCLE, "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LIFECYCLE, "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LIFECYCLE, "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LIFECYCLE, "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LIFECYCLE, "onPostResume");
        textView.append("\n" + "onPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(LIFECYCLE, "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);

    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LIFECYCLE, "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LIFECYCLE, "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("textView", textView.getText().toString());
        Log.d(LIFECYCLE, "onSaveInstanceState");
        textView.append("\n" + "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LIFECYCLE, "onRestoreInstanceState");
        textView.append("\n" + "onRestoreInstanceState" + savedInstanceState.getString("textView"));
    }
}