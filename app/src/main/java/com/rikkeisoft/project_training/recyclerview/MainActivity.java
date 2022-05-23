package com.rikkeisoft.project_training.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rikkeisoft.project_training.databinding.ActivityMainBinding;
import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemOneAdapter;
import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemThreeAdapter;
import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemTwoAdapter;
import com.rikkeisoft.project_training.old.data.mock.MainRepository;
import com.rikkeisoft.project_training.old.models.SubItem;
import com.rikkeisoft.project_training.recyclerview.adapters.ItemRecyclerViewAdapter;
import com.rikkeisoft.project_training.recyclerview.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Item> items;
    MainRepository mainRepository;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mainRepository = new MainRepository();
        items = new ArrayList<>();

        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    private void initData() {
        //item position 0:
        items.add(new Item(0, "Preview Song"));
        //item position 1:
        ArrayList<SubItem> subItems1 = mainRepository.dataMockItemChildOne();
        SubItemOneAdapter subItemOneAdapter = new SubItemOneAdapter(subItems1);
        items.add(new Item(1, subItemOneAdapter));
        //item position 2:
        items.add(new Item(0, "List song"));
        //item position 3:
        ArrayList<SubItem> subItems2 = mainRepository.dataMockItemChildTwo();
        SubItemTwoAdapter subItemTwoAdapter = new SubItemTwoAdapter(subItems2);
        items.add(new Item(2, subItemTwoAdapter));
        //item position 4:
        items.add(new Item(0, "Album Song"));
        //item position 5:
        ArrayList<SubItem> subItems3 = mainRepository.dataMockItemChildThree();
        SubItemThreeAdapter subItemThreeAdapter = new SubItemThreeAdapter(subItems3);
        items.add(new Item(3, subItemThreeAdapter));

        //setAdapter cho recyclerView
        ItemRecyclerViewAdapter adapter = new ItemRecyclerViewAdapter(items, this);
        binding.recyclerView.setAdapter(adapter);
    }
}
