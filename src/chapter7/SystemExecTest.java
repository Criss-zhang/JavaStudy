package chapter7;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class SystemExecTest {
    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec("/library/tomcat/bin/catalina.sh");
        ProcessHandle processHandle = p.toHandle();
        System.out.println("进程进行："+processHandle.isAlive());
        System.out.println("进程PID"+processHandle.pid());
        System.out.println("父进程"+processHandle.parent());
        ProcessHandle.Info info = processHandle.info();
        System.out.println("父进程命令"+info.command());
        System.out.println("进程参数"+info.arguments());
        System.out.println("进程启动时间"+info.startInstant());
        System.out.println("进程累计运行时间"+info.totalCpuDuration());
        CompletableFuture<ProcessHandle> processHandleCompletableFuture = processHandle.onExit();
        processHandleCompletableFuture.thenRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("程序退出");
            }
        });
        Thread.sleep(5000);
    }
}
