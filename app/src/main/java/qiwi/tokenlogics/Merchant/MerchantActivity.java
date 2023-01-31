package qiwi.tokenlogics.Merchant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import qiwi.tokenlogics.InputAmount.InputAmountActivity;
import qiwi.tokenlogics.InputAmount.InputAmountPerQRActivity;
import qiwi.tokenlogics.R;

public class MerchantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, SettingsMerchantActivity.class);
        startActivity(intent);
        return true;
    }

    public void onClickPayByNFC(View view) {
        Intent intent = new Intent(this, InputAmountActivity.class);
        startActivity(intent);
    }

    public void onClickPayByQR(View view) {
        Intent intent = new Intent(this, InputAmountPerQRActivity.class);
        startActivity(intent);
    }
}