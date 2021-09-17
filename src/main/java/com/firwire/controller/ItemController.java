package com.firwire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firwire.client.SoapClient;
import com.firwire.soap.bindings.ItemRequest;
import com.firwire.soap.bindings.ItemResponse;

@RestController
public class ItemController {
    @Autowired
    SoapClient soapClient;

    @PostMapping(value ="/item", produces=MediaType.APPLICATION_XML_VALUE)
    public ItemResponse item(@RequestBody ItemRequest itemRequest){
        return soapClient.getItemInfo(itemRequest);
    }
}
