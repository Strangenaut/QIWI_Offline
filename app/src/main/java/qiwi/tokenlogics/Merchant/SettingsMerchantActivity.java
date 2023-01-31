package qiwi.tokenlogics.Merchant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import qiwi.tokenlogics.JSON.JSONHelper;
import qiwi.tokenlogics.R;

public class SettingsMerchantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_merchant);
    }

    public void onClickExitApp(View view) {
        finishAffinity();
    }

    public void onClickChangeMode(View view) {
        JSONHelper.writeUserMode(this, "Purchaser");
        JSONHelper.writePasswordInputTime(this, String.valueOf(System.currentTimeMillis()));
        PackageManager packageManager = getPackageManager();
        Intent intent = packageManager.getLaunchIntentForPackage(this.getPackageName());
        ComponentName componentName = intent.getComponent();
        Intent mainIntent = Intent.makeRestartActivityTask(componentName);
        startActivity(mainIntent);
        Runtime.getRuntime().exit(0);
    }
}