package com.exp8;


import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

public class MongoCreateCollection {
    public static void main(String[] args) {
        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            var database = mongoClient.getDatabase("javaguides");
            MongoCollection<Document> collection = database.getCollection("users");

           
            var docs = new ArrayList<Document>();
            
            docs.add(new Document("_id", 1)
                .append("firstName", "Ramesh")
                .append("lastName", "Fadatare"));
            docs.add(new Document("_id", 2)
                .append("firstName", "Tony")
                .append("lastName", "Stark"));
            docs.add(new Document("_id", 3)
                .append("firstName", "Tom")
                .append("lastName", "Cruise"));
            docs.add(new Document("_id", 4)
                .append("firstName", "Amir")
                .append("lastName", "Khan"));
            docs.add(new Document("_id", 5)
                .append("firstName", "Umesh")
                .append("lastName", "Fadatare"));

            collection.insertMany(docs);
            System.out.println(docs.size() + " documents inserted successfully.");
            
        } catch (Exception e) {
            System.err.println("General error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
