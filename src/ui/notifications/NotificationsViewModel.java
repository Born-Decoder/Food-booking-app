package com.example.edible.p006ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* renamed from: com.example.edible.ui.notifications.NotificationsViewModel */
public class NotificationsViewModel extends ViewModel {
    private MutableLiveData<String> mText = new MutableLiveData<>();

    public NotificationsViewModel() {
        this.mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return this.mText;
    }
}
