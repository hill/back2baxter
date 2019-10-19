package com.example.back2baxta.ui.usersLeaving;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UsersLeavingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UsersLeavingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}