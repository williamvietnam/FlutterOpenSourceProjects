package com.rikkeisoft.project_training.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.databinding.WidgetSubItem1Binding;
import com.rikkeisoft.project_training.databinding.WidgetSubItem2Binding;
import com.rikkeisoft.project_training.databinding.WidgetSubItem3Binding;
import com.rikkeisoft.project_training.databinding.WidgetSubItemTitleBinding;
import com.rikkeisoft.project_training.recyclerview.models.Item;

import java.util.List;

public class ItemRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Item> itemList;
    private final Context context;

    public static final int VIEW_TYPE_TITLE = 0;
    public static final int VIEW_TYPE_ONE = 1;
    public static final int VIEW_TYPE_TWO = 2;
    public static final int VIEW_TYPE_THREE = 3;

    public ItemRecyclerViewAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ONE) {
            return new WidgetSubItemOneHolder(
                    WidgetSubItem1Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        } else if (viewType == VIEW_TYPE_TWO) {
            return new WidgetSubItemTwoHolder(
                    WidgetSubItem2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        } else if (viewType == VIEW_TYPE_THREE) {
            return new WidgetSubItemThreeHolder(
                    WidgetSubItem3Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        } else {
            return new WidgetSubItemTitleHolder(
                    WidgetSubItemTitleBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == VIEW_TYPE_ONE) {
            ((WidgetSubItemOneHolder) holder).bindData(itemList.get(position), context);
        } else if (getItemViewType(position) == VIEW_TYPE_TWO) {
            ((WidgetSubItemTwoHolder) holder).bindData(itemList.get(position), context);
        } else if (getItemViewType(position) == VIEW_TYPE_THREE) {
            ((WidgetSubItemThreeHolder) holder).bindData(itemList.get(position), context);
        } else {
            ((WidgetSubItemTitleHolder) holder).bindData(itemList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        if (itemList == null) {
            return 0;
        } else {
            return itemList.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (itemList.get(position).getId() == VIEW_TYPE_ONE) {
            return VIEW_TYPE_ONE;
        } else if (itemList.get(position).getId() == VIEW_TYPE_TWO) {
            return VIEW_TYPE_TWO;
        } else if (itemList.get(position).getId() == VIEW_TYPE_THREE) {
            return VIEW_TYPE_THREE;
        }
        return VIEW_TYPE_TITLE;
    }

    static class WidgetSubItemTitleHolder extends RecyclerView.ViewHolder {
        WidgetSubItemTitleBinding binding;

        public WidgetSubItemTitleHolder(@NonNull WidgetSubItemTitleBinding widgetSubItemTitleBinding) {
            super(widgetSubItemTitleBinding.getRoot());
            this.binding = widgetSubItemTitleBinding;
        }

        public void bindData(@NonNull Item item) {
            binding.textViewTitle.setText(item.getTitle());
        }
    }

    static class WidgetSubItemOneHolder extends RecyclerView.ViewHolder {
        WidgetSubItem1Binding binding;

        public WidgetSubItemOneHolder(@NonNull WidgetSubItem1Binding subItemOneBinding) {
            super(subItemOneBinding.getRoot());
            this.binding = subItemOneBinding;
        }

        public void bindData(@NonNull Item item, Context context) {
            binding.rcvSubItem1.setAdapter(item.getSubItemOneAdapter());
            binding.rcvSubItem1.setLayoutManager(
                    new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        }
    }

    static class WidgetSubItemTwoHolder extends RecyclerView.ViewHolder {
        WidgetSubItem2Binding binding;

        public WidgetSubItemTwoHolder(@NonNull WidgetSubItem2Binding subItemTwoBinding) {
            super(subItemTwoBinding.getRoot());
            this.binding = subItemTwoBinding;
        }

        public void bindData(@NonNull Item item, Context context) {
            binding.rcvSubItem2.setAdapter(item.getSubItemTwoAdapter());
            binding.rcvSubItem2.setLayoutManager(
                    new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        }
    }

    static class WidgetSubItemThreeHolder extends RecyclerView.ViewHolder {
        WidgetSubItem3Binding binding;

        public WidgetSubItemThreeHolder(@NonNull WidgetSubItem3Binding subItemThreeBinding) {
            super(subItemThreeBinding.getRoot());
            this.binding = subItemThreeBinding;
        }

        public void bindData(@NonNull Item item, Context context) {
            binding.rcvSubItem3.setAdapter(item.getSubItemThreeAdapter());
            binding.rcvSubItem3.setLayoutManager(
                    new GridLayoutManager(context, 2));
        }
    }
}
