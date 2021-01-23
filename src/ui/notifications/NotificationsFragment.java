package com.example.edible.p006ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.edible.C0563R;
import com.example.edible.noListAdapter;
import java.util.ArrayList;

/* renamed from: com.example.edible.ui.notifications.NotificationsFragment */
public class NotificationsFragment extends Fragment implements noListAdapter.OnItemListener {
    /* access modifiers changed from: private */
    public noListAdapter adapter;
    ItemTouchHelper.SimpleCallback itemtouchhelpercallback = new ItemTouchHelper.SimpleCallback(0, 12) {
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            return false;
        }

        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            NotificationsFragment.this.mnotes.remove(viewHolder.getAdapterPosition());
            NotificationsFragment.this.mnotimgs.remove(viewHolder.getAdapterPosition());
            NotificationsFragment.this.adapter.notifyDataSetChanged();
        }
    };
    /* access modifiers changed from: private */
    public ArrayList<String> mnotes = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> mnotimgs = new ArrayList<>();
    private NotificationsViewModel notificationsViewModel;
    RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.notificationsViewModel = (NotificationsViewModel) ViewModelProviders.m8of((Fragment) this).get(NotificationsViewModel.class);
        View root = inflater.inflate(C0563R.layout.fragment_notifications, container, false);
        this.recyclerView = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView);
        this.mnotes.add("Notification1");
        this.mnotes.add("Notification2");
        this.mnotes.add("Notification3");
        this.mnotes.add("Notification4");
        this.mnotes.add("Notification5");
        this.mnotes.add("Notification6");
        this.mnotes.add("Notification7");
        this.mnotes.add("Notification8");
        this.mnotes.add("Notification9");
        this.mnotes.add("Notification10");
        this.mnotes.add("Notification11");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        this.mnotimgs.add("https://www.vippng.com/png/detail/352-3529283_notifications-png-for-free-download-on-icon-youtube.png");
        initrecyclerview();
        return root;
    }

    public void initrecyclerview() {
        this.adapter = new noListAdapter(this.mnotes, this.mnotimgs, getContext(), this);
        new ItemTouchHelper(this.itemtouchhelpercallback).attachToRecyclerView(this.recyclerView);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public void onItemClickno(int position) {
    }
}
