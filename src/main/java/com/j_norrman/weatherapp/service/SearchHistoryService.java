package com.j_norrman.weatherapp.service;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

@Service
public class SearchHistoryService {
    private final List<String> searchHistory = new LinkedList<>();
    public void addCityToHistory(String city) {
        if (searchHistory.size() >= 10) {
            searchHistory.remove(0);
        }
        searchHistory.add(city);
    }
    public List<String> getSearchHistory() {
        return new LinkedList<>(searchHistory);
    }
}
