package com.androdev.custommessenger;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SetRecyclerAdapter extends RecyclerView.Adapter<SetRecyclerAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> set_topics = new ArrayList<>();
    private ArrayList<String> set_sub_items = new ArrayList<>();
    private ArrayList<String> set_check_boxes = new ArrayList<>();
    private ArrayList<String> set_popups = new ArrayList<>();
    private ArrayList<String> set_heads = new ArrayList<String>();
    private Context context;
    private Dialog dialog;
    private TextView who_head;

    public SetRecyclerAdapter(Context context, ArrayList<String> set_topics, ArrayList<String> set_sub_items, ArrayList<String> set_check_boxes, ArrayList<String> set_popups, ArrayList<String> set_heads) {
        this.set_topics = set_topics;
        this.set_sub_items = set_sub_items;
        this.set_check_boxes = set_check_boxes;
        this.set_popups = set_popups;
        this.set_heads = set_heads;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_settings, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        if(!set_topics.get(position).equals("")){
            holder.set_topic.setText(set_topics.get(position));
            if(set_heads.get(position).equals("yes")){
                Log.d(TAG,"head: yes");
                holder.set_topic.setTextSize(25);
                holder.set_line.setVisibility(View.INVISIBLE);
            }else{
                holder.set_topic.setTextSize(18);
                holder.set_line.setVisibility(View.VISIBLE);
            }
        }

        if(set_sub_items.get(position).equals("nothing")){
            holder.set_sub_item.setVisibility(View.GONE);
        }else if(!set_sub_items.get(position).equals("nothing")){
            holder.set_sub_item.setVisibility(View.VISIBLE);
            holder.set_sub_item.setText(set_sub_items.get(position));
        }

        if(set_check_boxes.get(position).equals("yes")){
            holder.set_check_box.setVisibility(View.VISIBLE);
        }else{
            holder.set_check_box.setVisibility(View.GONE);
        }

       holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, set_topics.get(position), Toast.LENGTH_SHORT).show();
               /*if(!set_heads.get(position).equals("yes") && set_heads.get(position).equals("")){
                   Toast.makeText(context, set_popups.get(position), Toast.LENGTH_SHORT).show();
                   if(set_popups.get(position).equals("who")){
                      dialog = new Dialog(context);
                      dialog.setContentView(R.layout.who_dialog);
                      who_head = (TextView) dialog.findViewById(R.id.who_head);
                      who_head.setText(set_topics.get(position));
                      Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                      dialog.show();
                   }
               }*/
            }
        });

    }

    @Override
    public int getItemCount() {
        return set_topics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView set_topic, set_sub_item, set_check_box;
        RelativeLayout parentLayout;
        View set_line;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            set_line = itemView.findViewById(R.id.set_line);
            set_topic = itemView.findViewById(R.id.set_topic);
            set_sub_item = itemView.findViewById(R.id.set_sub_item);
            set_check_box = itemView.findViewById(R.id.set_check_box);
            parentLayout = itemView.findViewById(R.id.settings_parent);
        }
    }

}
