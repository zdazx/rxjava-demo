package com.rxjava.demo.example2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JustExample {

    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4)
                .subscribe(new Observer<Integer>() {
                    public void onSubscribe(Disposable disposable) {
                        System.out.println("start");
                    }

                    public void onNext(Integer integer) {
                        System.out.println("This is " + integer);
                    }

                    public void onError(Throwable throwable) {
                        System.out.println("error");
                    }

                    public void onComplete() {
                        System.out.println("complete");
                    }
                });

    }
}
