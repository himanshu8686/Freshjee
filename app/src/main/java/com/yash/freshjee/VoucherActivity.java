package com.yash.freshjee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class VoucherActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VoucherAdapter voucherAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);
        recyclerView= findViewById(R.id.rv_vouchers);
        LinearLayoutManager layoutManager = new LinearLayoutManager(VoucherActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        voucherAdapter=new VoucherAdapter(VoucherActivity.this);
        recyclerView.setAdapter(voucherAdapter);
    }
}
