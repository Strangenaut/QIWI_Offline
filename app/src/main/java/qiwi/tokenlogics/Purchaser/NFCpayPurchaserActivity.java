package qiwi.tokenlogics.Purchaser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import qiwi.tokenlogics.ConfirmPayment.ConfirmActivity;
import qiwi.tokenlogics.R;

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