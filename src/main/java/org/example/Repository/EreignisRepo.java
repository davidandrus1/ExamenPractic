package org.example.Repository;

import org.example.Model.Ereignis;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EreignisRepo<T extends Ereignis>{

    private  String filePath;
    private List<Ereignis> items;

    ObjectMapper mapper = new ObjectMapper();

    public EreignisRepo(String filePath) {
        this.filePath = filePath;
    }

    public void readAll() {
        ObjectMapper mapper = new ObjectMapper();
        Ereignis[] tributs = mapper.readValue(new File(this.filePath), Ereignis[].class);
        this.items = new ArrayList<>(Arrays.asList(tributs));
        System.out.println("Events loaded: " + items.size());

    }

    public void add(Ereignis t){
        this.items.add(t);
    }

    public void remove(String name) {
        this.items.remove(name);
    }

//    public void update(String name, Ereignis t) {
//
//    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(this.filePath), this.items);
        System.out.println("Lista a fost salvata cu succes!");

    }
}
