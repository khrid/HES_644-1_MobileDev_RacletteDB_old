package ch.hevs.students.raclettedb.ui.fromages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FromagesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FromagesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fromage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}