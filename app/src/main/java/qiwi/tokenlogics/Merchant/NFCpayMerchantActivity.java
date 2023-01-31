package qiwi.tokenlogics.Merchant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import qiwi.tokenlogics.R;

public class   NFCpayMerchantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfcpay_merchant);
    }

    public void onClickNFC(View view) {
        Intent intent = new Intent(this, WaitingForPurchaserPaymentActivity.class);
        startActivity(intent);
        finish();
    }
}