package com.yash.freshjee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.VoucherViewHolder>
{
    Context context;

    public VoucherAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public VoucherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.voucher_item_layout,parent,false);
       VoucherViewHolder voucherViewHolder =new VoucherViewHolder(view);
        return voucherViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class VoucherViewHolder extends RecyclerView.ViewHolder {

        public VoucherViewHolder(View itemView) {
            super(itemView);


        }
    }
}
