package com.example.edible.p006ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.example.edible.C0563R;

/* renamed from: com.example.edible.ui.account.AccountFragment */
public class AccountFragment extends Fragment {
    private AccountViewModel accountViewModel;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.accountViewModel = (AccountViewModel) ViewModelProviders.m8of((Fragment) this).get(AccountViewModel.class);
        return inflater.inflate(C0563R.layout.fragment_account, container, false);
    }
}
