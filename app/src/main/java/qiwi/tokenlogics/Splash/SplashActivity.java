package qiwi.tokenlogics.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import qiwi.tokenlogics.Password.PasswordEnterActivity;
import qiwi.tokenlogics.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this, PasswordEnterActivity.class);
        startActivity(intent);
        finish();
    }
}