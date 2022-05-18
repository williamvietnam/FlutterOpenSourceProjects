package com.rikkeisoft.project_training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.rikkeisoft.project_training.adapters.ParentAdapter;
import com.rikkeisoft.project_training.databinding.FragmentMainBinding;
import com.rikkeisoft.project_training.models.ParentModel;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    private ParentAdapter parentAdapter;
    private ArrayList<ParentModel> parentModels;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        parentModels = new ArrayList<>();
        parentModels.add(new ParentModel("List songs"));
        parentModels.add(new ParentModel("New songs"));
        parentModels.add(new ParentModel("Favorite songs"));
        parentAdapter = new ParentAdapter(parentModels, requireContext());
        binding.rcvMain.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        binding.rcvMain.setAdapter(parentAdapter);
    }
}
