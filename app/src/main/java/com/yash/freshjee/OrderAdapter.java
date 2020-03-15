package com.yash.freshjee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder>
{
    Context context;

    public OrderAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_items_layout,parent,false);
        OrderViewHolder orderViewHolder=new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, final int position) {
        holder.tvComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((OrdersActivity)context).GetCompleteClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView tvComplete;
        public OrderViewHolder(View itemView) {
            super(itemView);

            tvComplete = itemView.findViewById(R.id.tvComplete);
        }
    }
}
