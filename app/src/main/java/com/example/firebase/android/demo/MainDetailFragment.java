package com.example.firebase.android.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firebase.android.demo.databinding.FragmentMainDetailBinding;

public class MainDetailFragment extends BaseFragment{

    private static final String TAG = "MainDetailFragment";

    private FragmentMainDetailBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}
