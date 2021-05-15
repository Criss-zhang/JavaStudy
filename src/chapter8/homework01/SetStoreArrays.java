package chapter8.homework01;

import java.util.Scanner;
import java.util.TreeSet;

public class SetStoreArrays {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            if (treeSet.size() <= 20){
                treeSet.add(scanner.nextLine());
            }else break;
            System.out.println(treeSet);
        }
    }
}
