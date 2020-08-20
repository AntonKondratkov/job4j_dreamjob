package ru.job4j.dream.store;

import ru.job4j.dream.model.Post;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {
    private static final Store INST = new Store();

    private Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "Description of Junior's work", "12.08.2020"));
        posts.put(2, new Post(2, "Middle Java Job", "Description of Middle's work", "17.08.2020"));
        posts.put(3, new Post(3, "Senior Java Job", "Description of Senior's work", "20.08.2020"));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}
