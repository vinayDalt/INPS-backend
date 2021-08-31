package com.example.iNPSAdhoc;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;



public class MongodbConnect {
    public static void main(String[] args){

        System.setProperty("javax.net.ssl.trustStore","SSL/cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

        final String mongoURI = "mongodb://ibm_cloud_f6d8fa38_5303_40e0_879d_ab90c68f47c8:48b64f9e7ed3a2d289c23e95709dd151b6fe52c8c7a8bd30f427b2b8e0a1d278@eb3febfe-6d7d-40a9-8ff2-10d9a215e834-0.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:31553/ibmclouddb?authSource=admin&replicaSet=replset&ssl=true";
        MongoClient mongoClient = MongoClients.create(mongoURI);

        mongoClient.close();

    }
}
