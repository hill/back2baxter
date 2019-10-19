package com.example.back2baxta.ui.users;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.back2baxta.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private ArrayList<User> mDataset;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView header_img;
        public TextView headline;
        public TextView summary;
        public Button likeButton;
        public Button shareButton;

        public UserViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public UserAdapter(ArrayList<User> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {

        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(com.example.back2baxta.R.layout.user, parent, false);

        UserViewHolder User_vh = new UserViewHolder(view);
        return User_vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(UserViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //final User UserAtPosition = mDataset.get(position);
        //holder.header_img.setImageResource(UserAtPosition.getImageDrawableId());
        /*holder.header_img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("UserID", UserAtPosition.getUserID());
                context.startActivity(intent);
            }
        });
        holder.headline.setText(UserAtPosition.getHeadline());
        holder.summary.setText(UserAtPosition.getSummary());
        holder.likeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v.findViewById(R.id.like_btn).setBackgroundColor(Color.parseColor("#50ba32"));
            }
        });
        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = FakeDatabase.getUserById(1).getSummary();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, FakeDatabase.getUserById(1).getHeadline());
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                Context context = v.getContext();
                context.startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });*/

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}