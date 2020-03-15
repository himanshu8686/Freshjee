package com.yash.freshjee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ApplyVoucherActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ApplyVoucherAdapter applyVoucherAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_voucher);
        recyclerView= findViewById(R.id.rv_apply_voucher);
        LinearLayoutManager layoutManager = new LinearLayoutManager(ApplyVoucherActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        applyVoucherAdapter=new ApplyVoucherAdapter(ApplyVoucherActivity.this);
        recyclerView.setAdapter(applyVoucherAdapter);
    }
}
