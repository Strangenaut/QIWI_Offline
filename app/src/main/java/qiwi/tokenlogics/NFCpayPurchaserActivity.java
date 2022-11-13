package qiwi.tokenlogics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NFCpayPurchaserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfcpay_purchaser);
    }

    public void onClickNFC(View view) {
        Intent intent = new Intent(this, ConfirmActivity.class);
        startActivity(intent);
        finish();
    }
}