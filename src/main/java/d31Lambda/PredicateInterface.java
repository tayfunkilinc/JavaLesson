package d31Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {
        //Ornek: Verilen listteki cift sayilari yazdiran bir method olusturunuz
        //Example: Create a method that prints even numbers in the given list
        // Predicate bize filtreleme isleleri yaptigimizda yardimci olan bir interfacetir
        //veri filtrelemede kullanilir

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven = x-> x%2 ==0;

        List<Integer> evens = numbers.stream().filter(isEven).collect(Collectors.toList()); // burdaki isEven i biz yukarda tanimladik burda kullanimini yaptik
        //burda filter Predicate turunde bir deger aldigi icin isEven kullanabildik
        System.out.println(evens); // [2, 4, 6]

     }
}
