package sumith.pacasian.pacy.pybot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splash = new Thread(){
            public void run(){
                try {
                    Thread.sleep(5000);
                    startActivity(new Intent(SplashScreen.this,Main2Activity.class));
                    finish();
                }catch(Exception e)
                {
                    Toast.makeText(SplashScreen.this, "Error in Loading..!", Toast.LENGTH_SHORT).show();
                }
            }
        };
        splash.start();
    }
}
