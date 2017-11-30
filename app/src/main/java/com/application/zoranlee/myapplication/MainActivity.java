package com.application.zoranlee.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.application.zoranlee.myapplication.ui.TabFragmentActivity;

/**
 * @author xhc
 *         <p>
 *         Android底部导航栏的最佳实践：https://github.com/pinguo-zhouwei/AndroidTrainingSimples
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, TabFragmentActivity.class));
//        Rx2AndroidNetworking.get("http://api.avatardata.cn/MobilePlace/LookUp?key=ec47b85086be4dc8b5d941f5abd37a4e&mobileNumber=13021671512")
//                .build()
//                .getObjectObservable(MobileAddress.class)
//                .observeOn(AndroidSchedulers.mainThread()) // 为doOnNext() 指定在主线程，否则报错
//                .doOnNext(new Consumer<MobileAddress>() {
//                    @Override
//                    public void accept(@NonNull MobileAddress data) throws Exception {
//                        Log.e(TAG, "doOnNext:" + Thread.currentThread().getName() + "\n");
////                        mRxOperatorsText.append("\ndoOnNext:" + Thread.currentThread().getName() + "\n");
//                        Log.e(TAG, "doOnNext:" + data.toString() + "\n");
////                        mRxOperatorsText.append("doOnNext:" + data.toString() + "\n");
//                    }
//                })
//                .map(new Function<MobileAddress, ResultBean>() {
//                    @Override
//                    public ResultBean apply(@NonNull MobileAddress mobileAddress) throws Exception {
//                        Log.e(TAG, "\n");
//                        mRxOperatorsText.append("\n");
//                        Log.e(TAG, "map:" + Thread.currentThread().getName() + "\n");
//                        mRxOperatorsText.append("map:" + Thread.currentThread().getName() + "\n");
//                        return mobileAddress.getResult();
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<ResultBean>() {
//                    @Override
//                    public void accept(@NonNull ResultBean data) throws Exception {
//                        Log.e(TAG, "subscribe 成功:" + Thread.currentThread().getName() + "\n");
//                        mRxOperatorsText.append("\nsubscribe 成功:" + Thread.currentThread().getName() + "\n");
//                        Log.e(TAG, "成功:" + data.toString() + "\n");
//                        mRxOperatorsText.append("成功:" + data.toString() + "\n");
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        Log.e(TAG, "subscribe 失败:" + Thread.currentThread().getName() + "\n");
//                        mRxOperatorsText.append("\nsubscribe 失败:" + Thread.currentThread().getName() + "\n");
//                        Log.e(TAG, "失败：" + throwable.getMessage() + "\n");
//                        mRxOperatorsText.append("失败：" + throwable.getMessage() + "\n");
//                    }
//                });

    }


}
