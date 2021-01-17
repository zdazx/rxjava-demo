package com.rxjava.demo.example5;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;

public class MaybeExample {
    public static void main(String[] args) {
        Maybe.just(1)
                .subscribe(new MaybeObserver<Integer>() {
                    public void onSubscribe(Disposable disposable) {

                    }

                    public void onSuccess(Integer integer) {
                        System.out.println(integer);
                    }

                    public void onError(Throwable throwable) {

                    }

                    public void onComplete() {

                    }
                });

        Maybe.empty()
                .subscribe(new MaybeObserver<Object>() {
                    public void onSubscribe(Disposable disposable) {


                    }

                    public void onSuccess(Object o) {
                        System.out.println("***" + o);
                    }

                    public void onError(Throwable throwable) {

                    }

                    public void onComplete() {
                        System.out.println("222");
                    }
                });
    }
}
