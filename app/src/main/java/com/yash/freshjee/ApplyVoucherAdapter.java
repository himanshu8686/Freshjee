package com.yash.freshjee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ApplyVoucherAdapter extends RecyclerView.Adapter<ApplyVoucherAdapter.ApplyVoucherViewHolder>
{
    Context context;

    public ApplyVoucherAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ApplyVoucherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_apply_voucher_item,parent,false);
       ApplyVoucherViewHolder applyVoucherViewHolder =new ApplyVoucherViewHolder(view);
        return applyVoucherViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ApplyVoucherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ApplyVoucherViewHolder extends RecyclerView.ViewHolder {

        public ApplyVoucherViewHolder(View itemView) {
            super(itemView);


        }
    }
}
