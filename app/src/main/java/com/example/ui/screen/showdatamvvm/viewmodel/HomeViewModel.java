package com.example.ui.screen.showdatamvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.ui.api.Service;

import com.example.ui.model.cosmic.Data;
import com.example.ui.model.cosmic.Datum;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<List<Datum>> listCate;

    public MutableLiveData<List<Datum>> getListCate() {
        if(listCate == null){
            listCate = new MutableLiveData<>();
            loadData();
        }
        return listCate;
    }

    private void loadData() {
        Service.getInstance().getApi().getNovelHomeData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Data>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Data data) {
                        listCate.setValue(data.getData());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
