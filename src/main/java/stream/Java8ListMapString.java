package stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Java8ListMapString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("anika", "sharad", "lavith", "eud", "psjss", "lavith");
        List<String> names1 = Arrays.asList("opsdd", "dfdfg", "oosffgpsk", "ceud", "xsbbjss", "zadfcvith");
        List<String> names2 = Arrays.asList("fgggds", "tsharad", "asdflavith", "ggjeud", "spsjss", "kgglavsith");
        List<String> names3 = Arrays.asList("tyhanika", "umsharad", "rwxlavith", "poheud", "uupsjss", "iiilavith");
        List<List<String>> allNames = Arrays.asList(names1, names2, names3);
        Map<String, Integer> namesAndLengths = names.stream().collect(toMap(name -> name, String::length, (k1, k2) -> k2, LinkedHashMap::new));
        System.out.println(namesAndLengths);
        System.out.println(allNames);
        Map<String,Integer> allNamesWithTheirLengths = allNames.stream().flatMap(Collection::stream).collect(toMap(name->name,name->name.length(),(k1,k2)->k1,LinkedHashMap::new));
        System.out.println(allNamesWithTheirLengths);
        System.out.println("========");
        List<Map<String,Integer>> listOfMaps = Arrays.asList(namesAndLengths,allNamesWithTheirLengths);
        System.out.println(listOfMaps); //form a new string with all keys joining

        System.out.println(listOfMaps.stream().flatMap(map->map.keySet().stream()).collect(Collectors.joining()));




    }
}
