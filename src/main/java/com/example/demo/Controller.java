package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import com.example.demo.Data;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private DataRepository dataRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void add(@RequestParam String input){
        Data data = new Data();
        data.setData(input);
        dataRepository.save(data);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") String id){
        Optional<Data> data = dataRepository.findById(Long.parseLong(id));
        return data.get().getData();
    }
}
