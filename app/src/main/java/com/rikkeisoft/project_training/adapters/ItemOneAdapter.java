package com.rikkeisoft.project_training.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.databinding.ItemOneBinding;
import com.rikkeisoft.project_training.models.ChildModel;

import java.util.List;

public class ItemOneAdapter extends RecyclerView.Adapter<ItemOneAdapter.ViewHolder> {

    private List<ChildModel> listItem;

    public ItemOneAdapter(List<ChildModel> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                ItemOneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(listItem.get(position));
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemOneBinding binding;

        ViewHolder(ItemOneBinding itemOneBinding) {
            super(itemOneBinding.getRoot());
            binding = itemOneBinding;
        }

        void setData(ChildModel item) {
            binding.imageView.setImageResource(item.getImageRes());
        }
    }
}
