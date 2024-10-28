package d31Lambda;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        //Ornek: Verilen listteki elemanlari ayri satirlarda konsola yazdiriniz.
        //Example: Print the elements in the given list to the console on separate lines.
        //Consumer hic bir sey dondurmez sadece islem yapar

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> printConsumer = x-> System.out.print(x);
        numbers.forEach(printConsumer); // bu yukari satirdaki printConsumer a gidip ordan cagrisini yapiyor calisma aninda accept() soyut methodu otomatik cagrildigi icin biz cagirmiyoruz
    }
}
