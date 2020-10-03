package ch.hevs.students.raclettedb.ui.alpages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlpagesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlpagesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alpage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}