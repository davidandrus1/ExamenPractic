package org.example.Repository;

import org.example.Model.SponsorGeschenk;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SponsorGeschenkRepo<T extends SponsorGeschenk>{

    private  String filePath;
    private List<SponsorGeschenk> items;

    ObjectMapper mapper = new ObjectMapper();

    public SponsorGeschenkRepo(String filePath) {
        this.filePath = filePath;
    }

    public void readAll() {
        ObjectMapper mapper = new ObjectMapper();
        SponsorGeschenk[] tributs = mapper.readValue(new File(this.filePath), SponsorGeschenk[].class);
        this.items = new ArrayList<>(Arrays.asList(tributs));
    }

    public void add(SponsorGeschenk t){
        this.items.add(t);
    }

    public void remove(String name) {
        this.items.remove(name);
    }

//    public void update(String name, SponsorGeschenk t) {
//
//    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(this.filePath), this.items);
        System.out.println("Lista a fost salvata cu succes!");

    }
}
