package com.example.androidapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnScanAQ = view.findViewById(R.id.btn_scan_aq);
        Button btnScanIMO = view.findViewById(R.id.btn_scan_imo);

        btnScanAQ.setOnClickListener(v -> {
            // TODO: Open camera scanner for AQ number
        });

        btnScanIMO.setOnClickListener(v -> {
            // TODO: Open camera scanner for IMO number
        });

        return view;
    }
}
