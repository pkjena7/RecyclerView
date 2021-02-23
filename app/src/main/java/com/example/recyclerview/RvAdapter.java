package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {


    ArrayList<String> dataList = new ArrayList<>();

    public RvAdapter() {
        addDataToList();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String data = dataList.get(position);
        holder.tvText.setText(data);

        String upperCaseData = data.toUpperCase();

        holder.tvText2.setText(upperCaseData);
        String lowerCaseData = data.toLowerCase();
        holder.tvText3.setText(lowerCaseData);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView tvText;
        public TextView tvText2;
        public TextView tvText3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvText = itemView.findViewById(R.id.tv_text);
            tvText2 = itemView.findViewById(R.id.tv_text_2);
            tvText3 = itemView.findViewById(R.id.tv_text_3);

        }

    }


    private void addDataToList() {
        dataList.add("Value 1");
        dataList.add("Value 2");
        dataList.add("Value 3");
        dataList.add("Value 4");
        dataList.add("Value 5");
        dataList.add("Value 6");
        dataList.add("Value 7");
        dataList.add("Value 8");
        dataList.add("Value 9");
        dataList.add("Value 10");

    }


}
