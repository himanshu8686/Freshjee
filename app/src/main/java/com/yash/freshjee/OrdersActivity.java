package com.yash.freshjee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class OrdersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OrderAdapter orderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
       recyclerView= findViewById(R.id.rv_orders);
        LinearLayoutManager layoutManager = new LinearLayoutManager(OrdersActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        orderAdapter=new OrderAdapter(OrdersActivity.this);
        recyclerView.setAdapter(orderAdapter);
    }
    public void GetCompleteClick(int postion)
    {
        Toast.makeText(OrdersActivity.this,""+postion,Toast.LENGTH_SHORT).show();
    }
}
