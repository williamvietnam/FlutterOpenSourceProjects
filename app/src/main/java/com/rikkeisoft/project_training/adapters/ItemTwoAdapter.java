package com.rikkeisoft.project_training.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.databinding.ItemTwoBinding;
import com.rikkeisoft.project_training.models.ChildModel;

import java.util.List;

public class ItemTwoAdapter extends RecyclerView.Adapter<ItemTwoAdapter.ViewHolder> {

    private List<ChildModel> listItem;

    public ItemTwoAdapter(List<ChildModel> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemTwoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
        private final ItemTwoBinding binding;

        public ViewHolder(ItemTwoBinding itemTwoBinding) {
            super(itemTwoBinding.getRoot());
            this.binding = itemTwoBinding;
        }

        void setData(ChildModel item) {
            binding.imageView.setImageResource(item.getImageRes());
            binding.tvContent.setText(item.getContent());
        }
    }
}
