package com.rxjava.demo.example3;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.Arrays;
import java.util.List;

public class FromExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, null, 5);
        Observable.fromIterable(integers)
                .subscribe(new Observer<Integer>() {
                    public void onSubscribe(Disposable disposable) {
                        System.out.println("start");
                    }

                    public void onNext(Integer integer) {
                        System.out.println(integer);
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
