package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.adapter.CategoryAdapter
import com.example.ui.api.Service
import com.example.ui.model.Data
import com.example.ui.model.Datum
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.disposables.DisposableContainer
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.home.*

class MainActivity : AppCompatActivity() {
    val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val homeData = Service.getInstance().api.homepageData

        homeData.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : Observer<Data>{
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable?) {
                    disposables.add(d)
                }

                override fun onNext(dataRes: Data?) {
                    if(dataRes == null){
                        return
                    }
                    handleData(dataRes.data)
                }

                override fun onError(e: Throwable?) {
                    handleError(e)
                }
            })
    }

    private fun handleError(e: Throwable?) {

    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }

    private fun handleData(data: List<Datum>) {
        val adapter = CategoryAdapter()
        listcategory_rv.adapter = adapter
        adapter.updateListDatum(data)
    }
}