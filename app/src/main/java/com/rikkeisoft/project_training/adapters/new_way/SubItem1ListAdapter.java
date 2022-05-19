package com.rikkeisoft.project_training.adapters.new_way;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.databinding.SubItem1Binding;
import com.rikkeisoft.project_training.models.SubItem;

public class SubItem1ListAdapter extends ListAdapter<SubItem, SubItem1ListAdapter.SubItem1ViewHolder> {


    protected SubItem1ListAdapter(@NonNull DiffUtil.ItemCallback<SubItem> diffCallback) {
        super(diffCallback);

    }

    /**
     * config cho task chạy ngầm để tránh giật lag
     * */
    protected SubItem1ListAdapter(@NonNull AsyncDifferConfig<SubItem> config) {
        super(config);
    }

    @NonNull
    @Override
    public SubItem1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SubItem1ViewHolder holder, int position) {

    }

    static class SubItem1ViewHolder extends RecyclerView.ViewHolder {
        private final SubItem1Binding binding;

        SubItem1ViewHolder(SubItem1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
