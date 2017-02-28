package ua.rd.map;

import java.util.List;
import java.util.Map;

/**
 * @author Sergey Mikhluk.
 */
public class ListService {

    List<String> list;

    Map<String, String> map;

    Map<String, List<String>> listMap;

    public ListService() {

    }

    public ListService(List<String> list) {
        this.list = list;
    }
//    public ListService(Map<String, String> map) {
//        this.map = map;
//    }

    public ListService(Map<String, List<String>> listMap) {
        this.listMap = listMap;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListService{" +
                "list=" + list +
                ", map=" + map +
                ", listMap=" + listMap +
                '}';
    }
}
