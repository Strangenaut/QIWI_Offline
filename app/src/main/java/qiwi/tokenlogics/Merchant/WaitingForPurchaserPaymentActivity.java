package qiwi.tokenlogics.Merchant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import qiwi.tokenlogics.PaymentSuccessfullActivity;
import qiwi.tokenlogics.R;

public class WaitingForPurchaserPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_for_purchaser_payment);
    }

    public void onClickConstraint(View view) {
        Intent intent = new Intent(this, PaymentSuccessfullActivity.class);
        startActivity(intent);
        finish();
    }
}