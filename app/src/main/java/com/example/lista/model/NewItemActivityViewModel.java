package com.example.lista.model;
import android.net.Uri;

import androidx.lifecycle.ViewModel;

public class NewItemActivityViewModel extends ViewModel {

    Uri selectPhotoLocation = null;

    public Uri getSelectPhotoLocation() {
        return selectPhotoLocation;
    }

    public void setSelectedPhotoLocation(Uri selectedPhotoLocation) {
        this.selectPhotoLocation = selectedPhotoLocation;
    }

}
