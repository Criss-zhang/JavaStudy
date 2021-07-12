package chapter16;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Consumer;

public class PubSubTest {
    public static void main(String[] args) {
         SubmissionPublisher<Object> publisher = new SubmissionPublisher<>();
         MySubscriber<Object> subscriber = new MySubscriber<>();
         publisher.subscribe(subscriber);
         System.out.println("开发发布数据");
        List.of("JAVA","KOTLIN","GO","ERLANG","SWIFT","LUA").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                publisher.submit(s);
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        publisher.close();
        synchronized ("hello"){
            try {
                "hello".wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class MySubscriber<T> implements Flow.Subscriber<T>{
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        System.out.println("获取到数据："+item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
        synchronized ("hello"){
            "hello".notifyAll();
        }
    }

    @Override
    public void onComplete() {
        System.out.println("订阅结束");
        synchronized ("hello"){
            "hello".notifyAll();
        }
    }
}