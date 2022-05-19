package com.rikkeisoft.project_training.adapters.new_way;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.rikkeisoft.project_training.models.SubItem;

import java.util.List;

public class SubItemDiffUtil extends DiffUtil.Callback {

    private final List<SubItem> oldSubItemList;
    private final List<SubItem> newSubItemList;

    public SubItemDiffUtil(List<SubItem> oldSubItemList, List<SubItem> newSubItemList) {
        this.oldSubItemList = oldSubItemList;
        this.newSubItemList = newSubItemList;
    }

    @Override
    public int getOldListSize() {
        return oldSubItemList.size();
    }

    @Override
    public int getNewListSize() {
        return newSubItemList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldSubItemList.get(oldItemPosition).getId() == newSubItemList.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}
