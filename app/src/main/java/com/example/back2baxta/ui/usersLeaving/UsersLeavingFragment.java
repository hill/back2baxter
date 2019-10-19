package com.example.back2baxta.ui.usersLeaving;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.back2baxta.R;
import com.example.back2baxta.User;
import com.example.back2baxta.ui.users.UserAdapter;

import java.util.ArrayList;

public class UsersLeavingFragment extends Fragment {

    private UsersLeavingViewModel usersLeavingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        usersLeavingViewModel =
                ViewModelProviders.of(this).get(UsersLeavingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_users_leaving, container, false);
        return root;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(0, "Harbour Cruise", "Leaving Now", 0));
        users.add(new User(1, "Harbour Cruise", "Leaving To McDonald's", 1));
        users.add(new User(2, "Harbour Cruise", "Leaving Now", 2));
        users.add(new User(3, "Harbour Cruise", "Leaving Soon", 3));

        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager layoutManager;

        recyclerView = view.findViewById(R.id.user_recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        mAdapter = new UserAdapter(users);
        recyclerView.setAdapter(mAdapter);
    }
}