package org.example.Repository;

import org.example.Model.Tribut;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TributRepo<T extends Tribut>{

    private  String filePath;
    private List<Tribut> items;

    ObjectMapper mapper = new ObjectMapper();

    public TributRepo(String filePath) {
        this.filePath = filePath;
    }

    public void readAll() {
        ObjectMapper mapper = new ObjectMapper();
        Tribut[] tributs = mapper.readValue(new File(this.filePath), Tribut[].class);
        this.items = new ArrayList<>(Arrays.asList(tributs));
        System.out.println("Tributes loaded: " + items.size());
    }

    public void add(Tribut t){
        this.items.add(t);
    }

    public void remove(String name) {
        this.items.remove(name);
    }

//    public void update(String name, Tribut t) {
//
//    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(this.filePath), this.items);
        System.out.println("Lista a fost salvata cu succes!");
    }

    public void print(List<Tribut> items){
        for(Tribut item : items)
        {
            System.out.println(item);
        }
        System.out.println();
    }

    public List<Tribut> getAll()
    {
        return items;
    }
}
