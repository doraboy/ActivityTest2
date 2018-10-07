package tw.dora.activitytest2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //private BradApp bradApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bradApp = (BradApp) getApplication();
    }

    public void gotoPage2(View view){
        int rand = (int)(Math.random()*49+1);
        Log.d("brad","Main rand =" + rand);

        Intent intent = new Intent(this,Page2Activity.class);
        intent.putExtra("rand",rand);
        //startActivity(intent);
        //編號2代表來回Page2
        startActivityForResult(intent,2);
    }

    public void gotoPage3(View view){
        int rand = 333;
        Intent intent = new Intent(this,Page3Activity.class);
        intent.putExtra("rand",rand);
        //編號3代表來回Page3
        startActivityForResult(intent,3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("brad","onActivityResult():來源編號"+requestCode+":回傳結果"+resultCode);

        if (requestCode == 2) {
            String username = data.getStringExtra("username");
            boolean isPass = data.getBooleanExtra("isPass", false);
            Log.d("brad", "Page2 back"+ username + ":" + isPass);
        }else if (requestCode == 3){
            Log.d("brad", "Page3 back");
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("brad","onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brad","onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brad","onStart()");

        Log.d("brad","before a = "+BradApp.a);
        BradApp.a = 222;
        Log.d("brad","after a = "+BradApp.a);
    }
}
