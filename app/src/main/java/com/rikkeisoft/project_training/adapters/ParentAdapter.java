package com.rikkeisoft.project_training.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rikkeisoft.project_training.R;
import com.rikkeisoft.project_training.databinding.ItemParentBinding;
import com.rikkeisoft.project_training.models.ChildModel;
import com.rikkeisoft.project_training.models.ParentModel;

import java.util.ArrayList;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.MyViewHolder> {

    private ArrayList<ParentModel> listItemParentModel;
    private Context context;

    public ParentAdapter(ArrayList<ParentModel> listItemParentModel, Context context) {
        this.listItemParentModel = listItemParentModel;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemParentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (position == 0) {
            ArrayList<ChildModel> listItemChild = new ArrayList<>();
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));
            listItemChild.add(new ChildModel(R.drawable.ic_music_1));

            ItemOneAdapter oneAdapter = new ItemOneAdapter(listItemChild);
            holder.binding.tvTitle.setText(listItemParentModel.get(position).getTitle());
            holder.binding.verticalScroll.setVisibility(View.GONE);
            holder.binding.horizontalScroll.setVisibility(View.VISIBLE);
            holder.binding.rcvMainHorizontal.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            holder.binding.rcvMainHorizontal.setAdapter(oneAdapter);

        } else if (position == 1) {
            ArrayList<ChildModel> listItemChild = new ArrayList<>();
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 1"));
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 2"));
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 3"));
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 4"));
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 5"));
            listItemChild.add(new ChildModel(R.drawable.ic_music_2, "Bài 6"));

            ItemTwoAdapter twoAdapter = new ItemTwoAdapter(listItemChild);
            holder.binding.tvTitle.setText(listItemParentModel.get(position).getTitle());
            holder.binding.horizontalScroll.setVisibility(View.GONE);
            holder.binding.verticalScroll.setVisibility(View.VISIBLE);
            holder.binding.rcvMainVertical.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
            holder.binding.rcvMainVertical.setAdapter(twoAdapter);

        } else if (position == 2) {
            ArrayList<ChildModel> listItemChild = new ArrayList<>();
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 1"));
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 2"));
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 3"));
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 4"));
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 5"));
            listItemChild.add(new ChildModel(R.drawable.ic_album_songs, "Bài 6"));

            ItemThreeAdapter threeAdapter = new ItemThreeAdapter(listItemChild);
            holder.binding.tvTitle.setText(listItemParentModel.get(position).getTitle());
            holder.binding.horizontalScroll.setVisibility(View.GONE);
            holder.binding.verticalScroll.setVisibility(View.VISIBLE);
            holder.binding.rcvMainVertical.setLayoutManager(new GridLayoutManager(context, 2));
            holder.binding.rcvMainVertical.setAdapter(threeAdapter);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final ItemParentBinding binding;

        MyViewHolder(ItemParentBinding itemParentBinding) {
            super(itemParentBinding.getRoot());
            binding = itemParentBinding;
        }
    }
}
