package com.futuristic.dine.out.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * aditya created on 13/04/21
 */
@Document(collection = "restaurants")
@Data
public class Restaurant {

//    {
//        "_id" : ObjectId("55f14312c7447c3da7051b2d"),
//            "URL" : "http://www.just-eat.co.uk/restaurants-042-restaurant-e11/menu",
//            "address" : "885 High Road Leytonstone",
//            "address line 2" : "London",
//            "name" : "042 Restaurant & Bar",
//            "outcode" : "E11",
//            "postcode" : "1HR",
//            "rating" : 3,
//            "type_of_food" : "African"
//    }

    @Id
    private ObjectId id;

    @BsonProperty("URL")
    private String url;
    private String address;

    @BsonProperty("address line 2")
    private String addressLine2;
    private String outcode;
    private String postcode;
    private String name;
    private String rating;

    @BsonProperty("type_of_food")
    private String typeOfFood;
}
