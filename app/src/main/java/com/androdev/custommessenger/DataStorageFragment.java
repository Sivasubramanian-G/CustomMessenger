package com.androdev.custommessenger;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataStorageFragment extends Fragment {

    private static final String TAG = "DataStorageFragment";
    private ArrayList<String> set_topics = new ArrayList<>();
    private ArrayList<String> set_sub_items = new ArrayList<>();
    private ArrayList<String> set_check_boxes = new ArrayList<>();
    private ArrayList<String> set_popups = new ArrayList<>();
    private ArrayList<String> set_head = new ArrayList<>();
    private SetRecyclerAdapter adapter;

    public DataStorageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArrayLists();
        adapter = new SetRecyclerAdapter(getContext(), set_topics, set_sub_items, set_check_boxes, set_popups, set_head);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_data_storage, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.ds_set_recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }

    private void initArrayLists() {

        Log.d(TAG,"initiating array lists.");

        set_topics.add("Data and Storage Usage");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Network Usage");
        set_sub_items.add("Click to view full details");
        set_check_boxes.add("");
        set_popups.add("networkfragment");
        set_head.add("");

        set_topics.add("Storage Usage");
        set_sub_items.add("Click to view full details");
        set_check_boxes.add("");
        set_popups.add("storagefragment");
        set_head.add("");

        set_topics.add("Auto Media Download");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Mobile Data");
        set_sub_items.add("Click to view full details");
        set_check_boxes.add("yes");
        set_popups.add("mobiledatausage");
        set_head.add("");

        set_topics.add("Wifi");
        set_sub_items.add("Click to view full details");
        set_check_boxes.add("yes");
        set_popups.add("wifiusage");
        set_head.add("");

        set_topics.add("Roaming");
        set_sub_items.add("Use mobile data for auto download");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Autoplay");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("GIF");
        set_sub_items.add("autoplay gif files");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Videos");
        set_sub_items.add("autoplay video files");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Call Usages");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Voice Call");
        set_sub_items.add("Use less data for voice call");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Video call");
        set_sub_items.add("use less data for video call");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

    }

}
