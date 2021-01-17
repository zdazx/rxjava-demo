package com.rxjava.demo.example4;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SingleExample {
    public static void main(String[] args) {
        Single.just(1)
                .subscribe(new SingleObserver<Integer>() {
                    public void onSubscribe(Disposable disposable) {

                    }

                    public void onSuccess(Integer integer) {
                        System.out.println(integer);
                    }

                    public void onError(Throwable throwable) {

                    }
                });
    }
}
