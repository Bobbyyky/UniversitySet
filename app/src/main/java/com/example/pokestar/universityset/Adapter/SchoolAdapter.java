package com.example.pokestar.universityset.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokestar.universityset.R;
import com.example.pokestar.universityset.Data.School;

import java.util.List;

/**
 * Created by Shinelon on 2018/6/7.
 */

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder>{

    private List<School> mSchoolList;

    public SchoolAdapter(List<School> schoolList){
        mSchoolList = schoolList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View schoolView;
        ImageView schoolImage;
        TextView schoolTitle;
        TextView schoolContent;

        public ViewHolder(View view) {
            super(view);
            schoolView = view;
            schoolImage = (ImageView)view.findViewById(R.id.school_image);
            schoolTitle = (TextView)view.findViewById(R.id.school_title);
            schoolContent = (TextView)view.findViewById(R.id.school_content);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.school_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        School school = mSchoolList.get(position);
        holder.schoolImage.setImageResource(school.getImageId());
        holder.schoolTitle.setText(school.getTitle());
        holder.schoolContent.setText(school.getContent());
    }

    @Override
    public int getItemCount() {
        return mSchoolList.size();
    }

}
