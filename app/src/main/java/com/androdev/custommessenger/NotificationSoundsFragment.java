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
public class NotificationSoundsFragment extends Fragment {

    private static final String TAG = "DataStorageFragment";
    private ArrayList<String> set_topics = new ArrayList<>();
    private ArrayList<String> set_sub_items = new ArrayList<>();
    private ArrayList<String> set_check_boxes = new ArrayList<>();
    private ArrayList<String> set_popups = new ArrayList<>();
    private ArrayList<String> set_head = new ArrayList<>();

    public NotificationSoundsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_notification_sounds, container, false);
        initArrayLists();
        RecyclerView recyclerView = v.findViewById(R.id.ns_set_recycler_view);
        SetRecyclerAdapter adapter = new SetRecyclerAdapter(getContext(),set_topics,set_sub_items,set_check_boxes, set_popups, set_head);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }

    private void initArrayLists() {

        Log.d(TAG,"initiating array lists.");

        set_topics.add("Notifications and Sounds");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Chats");
        set_sub_items.add("");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Normal");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Private");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Groups");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Channels");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Badges and Counts");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Badges");
        set_sub_items.add("Show online users");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Count");
        set_sub_items.add("Show message count on Notifications");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Muted Chats");
        set_sub_items.add("Show notification for muted chats");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Voice Call");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Vibration");
        set_sub_items.add("Vibrates when someone calls");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Ring");
        set_sub_items.add("Click to select ringtone");
        set_check_boxes.add("yes");
        set_popups.add("ringtone");
        set_head.add("");

        set_topics.add("Video call");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Vibration");
        set_sub_items.add("Vibrates when someone calls");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Ring");
        set_sub_items.add("Click to select ringtone");
        set_check_boxes.add("yes");
        set_popups.add("ringtone");
        set_head.add("");

        set_topics.add("InApp Notifications");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("Conversations");
        set_sub_items.add("Sound while in a chat");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Important");
        set_sub_items.add("Important sound like pinned messages");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Vibraions");
        set_sub_items.add("Vibrate while using the app");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Special Notifications");
        set_sub_items.add("nothing");
        set_check_boxes.add("");
        set_popups.add("");
        set_head.add("yes");

        set_topics.add("New joined from contact");
        set_sub_items.add("When someone joined new from your contact (requires contact sync)");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Repeat Norifications");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("repeatnotify");
        set_head.add("");

        set_topics.add("Pinned Message");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

        set_topics.add("Mentions");
        set_sub_items.add("");
        set_check_boxes.add("yes");
        set_popups.add("");
        set_head.add("");

    }

}


