package com.androdev.custommessenger;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
public class PrivacySecurityFragment extends Fragment {

    private static final String TAG = "PrivacySecurityFragment";
    private ArrayList<String> set_topics = new ArrayList<>();
    private ArrayList<String> set_sub_items = new ArrayList<>();
    private ArrayList<String> set_check_boxes = new ArrayList<>();
    private ArrayList<String> set_popups = new ArrayList<>();
    private ArrayList<String> set_head = new ArrayList<>();

    public PrivacySecurityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_privacy_security, container, false);
        initArrayLists();
        Log.d(TAG, "initRecyclerView: initiated");
        RecyclerView recyclerView = v.findViewById(R.id.ps_set_recycler_view);
        SetRecyclerAdapter adapter = new SetRecyclerAdapter(getContext(),set_topics,set_sub_items,set_check_boxes, set_popups, set_head);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }

    private void initArrayLists() {

        Log.d(TAG,"initiating array lists.");

        set_topics.add("Privacy");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Last Seen");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Profile Picture");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("About");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Call");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Video Call");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Groups");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Channels");
        set_sub_items.add("Everyone");
        set_check_boxes.add("");
        set_popups.add("who");
        set_head.add("");

        set_topics.add("Customized users lists");
        set_sub_items.add("Lists selected users for seperate privacies");
        set_check_boxes.add("");
        set_popups.add("who_list");
        set_head.add("");

        set_topics.add("Blocked users lists");
        set_sub_items.add("Number of blocked users");
        set_check_boxes.add("");
        set_popups.add("blocked");
        set_head.add("");

        set_topics.add("Security");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("App Lock");
        set_sub_items.add("Method to lock the app");
        set_check_boxes.add("");
        set_popups.add("lock");
        set_head.add("");

        set_topics.add("Locked Chats");
        set_sub_items.add("Method to lock some chats");
        set_check_boxes.add("");
        set_popups.add("locked");
        set_head.add("");

        set_topics.add("Chat Lock");
        set_sub_items.add("Method to lock some chats");
        set_check_boxes.add("");
        set_popups.add("lock");
        set_head.add("");

        set_topics.add("2StepAuthentication");
        set_sub_items.add("Pin");
        set_check_boxes.add("yes");
        set_popups.add("lock");
        set_head.add("");

        set_topics.add("Active Sessions");
        set_sub_items.add("Control Sessions on other devices");
        set_check_boxes.add("");
        set_popups.add("sessions");
        set_head.add("");

        set_topics.add("Contacts Sync");
        set_sub_items.add("nothing");
        set_check_boxes.add("yes");
        set_popups.add("nothing");
        set_head.add("");

        set_topics.add("Change to other account");
        set_sub_items.add("Copy this session to another account");
        set_check_boxes.add("");
        set_popups.add("change");
        set_head.add("");

        set_topics.add("Delete Account if inactive for");
        set_sub_items.add("Deletes account after some inactivity");
        set_check_boxes.add("");
        set_popups.add("delete_inactive");
        set_head.add("");

        set_topics.add("Delete Cloud Data");
        set_sub_items.add("Deletes data stored in cloud");
        set_check_boxes.add("");
        set_popups.add("delete_cloud_data");
        set_head.add("");

        set_topics.add("Delete Account");
        set_sub_items.add("Deletes account right away");
        set_check_boxes.add("");
        set_popups.add("delete");
        set_head.add("");

        set_topics.add("Request Account info");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("request");
        set_head.add("");

    }

}
