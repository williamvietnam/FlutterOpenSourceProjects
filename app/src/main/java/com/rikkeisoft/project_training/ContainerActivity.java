package com.rikkeisoft.project_training;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rikkeisoft.project_training.databinding.ActivityContainerBinding;

public class ContainerActivity extends AppCompatActivity {

    private ActivityContainerBinding binding;
    private MainFragment mainFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showMainFragment();
    }

    public void showMainFragment() {
        if (mainFragment == null) {
            mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainerView, mainFragment, MainFragment.class.getName())
                    .addToBackStack(MainFragment.class.getName())
                    .show(mainFragment)
                    .commit();
        }
        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag(MainFragment.class.getName());
    }

}
