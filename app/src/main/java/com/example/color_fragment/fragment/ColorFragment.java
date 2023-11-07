package com.example.color_fragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.color_fragment.R;

public class ColorFragment extends Fragment {

    private static Integer textColor;


    public ColorFragment() {}

    public static ColorFragment newInstance(Integer color) {
        
        Bundle args = new Bundle();
        args.putInt("color", color);
        textColor = color;
        ColorFragment fragment = new ColorFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.color);
        Bundle args = getArguments();
        if (args != null) {
            textView.setTextColor(args.getInt("color", 0));
        }
    }

    public static Integer getTextColor() {
        return textColor;
    }
}
