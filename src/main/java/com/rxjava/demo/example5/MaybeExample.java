package com.rxjava.demo.example5;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class MaybeExample {
    public static void main(String[] args) {
        Maybe.just(1)
                .subscribe(new MaybeObserver<Integer>() {
                    public void onSubscribe(@NonNull Disposable disposable) {

                    }

                    public void onSuccess(@NonNull Integer integer) {
                        System.out.println(integer);
                    }

                    public void onError(@NonNull Throwable throwable) {

                    }

                    public void onComplete() {

                    }
                });

        Maybe.empty()
                .subscribe(new MaybeObserver<Object>() {
                    public void onSubscribe(@NonNull Disposable disposable) {


                    }

                    public void onSuccess(@NonNull Object o) {
                        System.out.println("***" + o);
                    }

                    public void onError(@NonNull Throwable throwable) {

                    }

                    public void onComplete() {
                        System.out.println("222");
                    }
                });
    }
}
