package oop.market;

import java.util.ArrayList;
import java.util.List;

public class Market {

    private String name;
    private List<Repository> repositories = new ArrayList<>();

    public Market(String name) {
        this.name = name;
    }

    public void addRepository(Repository repository) {
        repositories.add(repository);
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        for (Repository repository : repositories) {
            for (Product product : repository.getProducts()) {
                list.add(product);
            }
        }
        return list;
    }

    public String getName() {
        return name;
    }
}
