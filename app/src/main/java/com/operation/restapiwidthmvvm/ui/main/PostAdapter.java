package com.operation.restapiwidthmvvm.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.operation.restapiwidthmvvm.R;
import com.operation.restapiwidthmvvm.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<PostModel> postsList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTV.setText(postsList.get(position).getTitle());
        holder.bodyTV.setText(postsList.get(position).getBody());
        holder.userTV.setText(postsList.get(position).getUserId()+"");
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public void setPostsList(List<PostModel> postsList){
        this.postsList = postsList ;
        notifyDataSetChanged();
    }
    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV , bodyTV , userTV ;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.tvTitle);
            bodyTV = itemView.findViewById(R.id.tvBody);
            userTV = itemView.findViewById(R.id.tvUserId);
        }
    }
}
