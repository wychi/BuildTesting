package com.example.wychi.buildtesting;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.wychi.mylibrary.MyClass;
import com.example.wychi.mylibrary.MyClass2;
import com.example.wychi.mylibrary.MyClass3;
import com.example.wychi.mylibrary.MyClass4;
import com.example.wychi.mylibrary.NoOneUseClass;


public class MainActivity extends Activity {

    MyClass c = new MyClass();
    MyClass2 c2 = null;
    MyClass4 c4 = new MyClass4();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        c.func1();
//        MyClass3 c3 = new MyClass3();
    }

    public void unused() {
        c.func1();
        MyClass3 c3 = new MyClass3();

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
}
