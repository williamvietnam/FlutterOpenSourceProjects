package com.rikkeisoft.project_training.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.databinding.ItemThreeBinding;
import com.rikkeisoft.project_training.models.ChildModel;

import java.util.List;

public class ItemThreeAdapter extends RecyclerView.Adapter<ItemThreeAdapter.ViewHolder> {
    private List<ChildModel> listItem;

    public ItemThreeAdapter(List<ChildModel> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public ItemThreeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemThreeAdapter.ViewHolder(
                ItemThreeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
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
        private final ItemThreeBinding binding;

        ViewHolder(ItemThreeBinding itemThreeBinding) {
            super(itemThreeBinding.getRoot());
            binding = itemThreeBinding;
        }

        void setData(@NonNull ChildModel item) {
            binding.imageView.setImageResource(item.getImageRes());
            binding.tvContent.setText(item.getContent());
        }
    }
}
