package online.propaans.goodr.goodr;


import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent HomeIntent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(HomeIntent);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
