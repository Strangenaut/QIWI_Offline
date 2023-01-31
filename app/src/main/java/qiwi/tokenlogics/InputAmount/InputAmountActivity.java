package qiwi.tokenlogics.InputAmount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import qiwi.tokenlogics.Merchant.NFCpayMerchantActivity;
import qiwi.tokenlogics.R;

public class InputAmountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_amount);
    }

    public void onClickReady(View view) {
        Intent intent = new Intent(this, NFCpayMerchantActivity.class);
        startActivity(intent);
        finish();
    }
}