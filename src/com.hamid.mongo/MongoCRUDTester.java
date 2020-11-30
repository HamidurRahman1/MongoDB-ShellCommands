package com.hamid.mongo;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.util.Arrays;

public class MongoCRUDTester
{
    public static void main(String[] args)
    {
        System.out.println(mongoClientUsingClientSettings().getDatabase("demo").getName());
    }

    protected static MongoClient mongoClientUsingClientSettings()
    {
        return MongoClients.create(MongoClientSettings
                .builder()
                .applyToClusterSettings(builder -> builder.hosts(Arrays.asList(new ServerAddress("hostOne", 27017))))
                .build());

    }

    protected static MongoClient mongoClientFromString()
    {
        return MongoClients.create("mongodb://127.0.0.1:27017");
    }
}
