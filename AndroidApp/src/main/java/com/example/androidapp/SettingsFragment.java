package com.example.androidapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SettingsFragment extends Fragment {

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        Button btnSignOut = view.findViewById(R.id.btn_sign_out);
        Button btnBack = view.findViewById(R.id.btn_back);

        btnSignOut.setOnClickListener(v -> {
            // TODO: Implement sign out logic
        });

        btnBack.setOnClickListener(v -> {
            // TODO: Implement back navigation logic
        });

        return view;
    }
}
