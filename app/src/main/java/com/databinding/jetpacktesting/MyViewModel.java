package com.databinding.jetpacktesting;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by harisucici on 2020/3/11
 * Class description:
 */
public class MyViewModel extends ViewModel {
    MutableLiveData<Integer> aTeamScore;
    MutableLiveData<Integer> bTeamScore;
    private int aBack, bBack;

    public MutableLiveData<Integer> getaTeamScore() {
        if (aTeamScore == null) {
            aTeamScore = new MutableLiveData<>();
            aTeamScore.setValue(0);
        }
        return aTeamScore;
    }

    public MutableLiveData<Integer> getbTeamScore() {
        if (bTeamScore == null) {
            bTeamScore = new MutableLiveData<>();
            bTeamScore.setValue(0);
        }
        return bTeamScore;
    }

    public void addA(int m) {
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();

        aTeamScore.setValue(aTeamScore.getValue() + m);
    }

    public void addB(int m) {

        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        bTeamScore.setValue(bTeamScore.getValue() + m);
    }

    public void reset() {
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        aTeamScore.setValue(0);
        bTeamScore.setValue(0);
    }

    public void unDo() {
        aTeamScore.setValue(aBack);
        bTeamScore.setValue(bBack);
    }


}