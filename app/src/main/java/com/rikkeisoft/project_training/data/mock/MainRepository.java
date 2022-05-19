package com.rikkeisoft.project_training.data.mock;

import com.rikkeisoft.project_training.R;
import com.rikkeisoft.project_training.models.SubItem;

import java.util.ArrayList;

public class MainRepository {
    public ArrayList<SubItem> dataMockItemChildOne() {
        ArrayList<SubItem> listItemChildOne = new ArrayList<>();

        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));
        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));
        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));
        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));
        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));
        listItemChildOne.add(new SubItem(R.drawable.ic_music_1));

        return listItemChildOne;
    }

    public ArrayList<SubItem> dataMockItemChildTwo() {
        ArrayList<SubItem> listItemChildTwo = new ArrayList<>();

        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 1"));
        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 2"));
        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 3"));
        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 4"));
        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 5"));
        listItemChildTwo.add(new SubItem(R.drawable.ic_music_2, "Bài 6"));

        return listItemChildTwo;
    }

    public ArrayList<SubItem> dataMockItemChildThree() {
        ArrayList<SubItem> listItemChildThree = new ArrayList<>();

        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 1"));
        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 2"));
        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 3"));
        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 4"));
        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 5"));
        listItemChildThree.add(new SubItem(R.drawable.ic_album_songs, "Bài 6"));

        return listItemChildThree;
    }
}
