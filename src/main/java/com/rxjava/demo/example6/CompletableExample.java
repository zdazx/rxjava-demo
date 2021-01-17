package com.rxjava.demo.example6;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.disposables.Disposable;

public class CompletableExample {
    public static void main(String[] args) {
        Completable.create(new CompletableOnSubscribe() {
            public void subscribe(CompletableEmitter completableEmitter) throws Exception {
                completableEmitter.onComplete();
            }
        }).subscribe(new CompletableObserver() {
            public void onSubscribe(Disposable disposable) {

            }

            public void onComplete() {
                System.out.println("complete");
            }

            public void onError(Throwable throwable) {

            }
        });
    }
}
