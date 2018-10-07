package tw.dora.activitytest2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        int rand = intent.getIntExtra("rand",-1);
        Log.d("brad","Page2 rand = " + rand);
    }

    public void gotoPage1(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
