package chapter15;

import java.nio.file.*;

public class WatchServiceTest {
    public static void main(String[] args)throws Exception {
        final WatchService watchService = FileSystems.getDefault().newWatchService();
        Paths.get("路径").register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,StandardWatchEventKinds.ENTRY_DELETE);
        while (true){
            final WatchKey take = watchService.take();
            for (WatchEvent event : take.pollEvents()){
                System.out.println(event.context()+"文件发生了"+event.kind()+"事件");
            }
            final boolean reset = take.reset();
            if (!reset){
                break;
            }
        }
    }
}
