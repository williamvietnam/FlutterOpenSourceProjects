package com.rikkeisoft.project_training.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.rikkeisoft.project_training.adapters.ItemAdapter;
import com.rikkeisoft.project_training.data.mock.MainRepository;
import com.rikkeisoft.project_training.databinding.FragmentMainBinding;
import com.rikkeisoft.project_training.models.Item;
import com.rikkeisoft.project_training.models.SubItem;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    private ItemAdapter itemAdapter;
    private ArrayList<Item> items;
    MainRepository mainRepository;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = new ArrayList<>();
        mainRepository = new MainRepository();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<SubItem> subItems1 = new ArrayList<>();
        subItems1 = mainRepository.dataMockItemChildOne();
        items.add(new Item("List songs", subItems1));

        List<SubItem> subItems2 = new ArrayList<>();
        subItems2 = mainRepository.dataMockItemChildTwo();
        items.add(new Item("New songs", subItems2));

        List<SubItem> subItems3 = new ArrayList<>();
        subItems3 = mainRepository.dataMockItemChildThree();
        items.add(new Item("Favorite songs", subItems3));

        itemAdapter = new ItemAdapter(items, requireContext());
        binding.rcvMain.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        binding.rcvMain.setAdapter(itemAdapter);
    }
}
