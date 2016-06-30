package com.example.rbrazuk.espressojawn;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WrestlerAdapter extends RecyclerView.Adapter<WrestlerAdapter.ViewHolder> {

    private List<String> mList;

    private Context mContext;

    public WrestlerAdapter(Context context,List<String> list) {
        mList = list;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View wrestlerView = inflater.inflate(R.layout.list_item,parent,false);

        ViewHolder viewHolder = new ViewHolder(wrestlerView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String wrestler = mList.get(position);

        TextView textView = holder.tvName;
        textView.setText(wrestler);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName;


        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}
