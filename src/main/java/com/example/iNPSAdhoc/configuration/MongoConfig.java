//package com.example.iNPSAdhoc.configuration;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClient;
////import com.mongodb.MongoClient;
//import com.mongodb.MongoClientOptions;
//import com.mongodb.MongoClientURI;
////import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//    public MongoClientOptions.Builder mongoClientOptionsBuilder(){
//        String javaPath = System.getProperty("java.home");
//        System.setProperty ("javax.net.ssl.keyStore",javaPath+"/lib/security/cacerts");
//        System.setProperty ("javax.net.ssl.keyStorePassword","changeit");
//        System.out.println(javaPath);
//        System.out.println(System.getProperty("javax.net.ssl.keyStore"));
//        MongoClientOptions.Builder builder = MongoClientOptions.builder();
////        MongoClientOptions options=builder.sslEnabled(true).build();
//        return builder;
//    }
//
//      MongoClientURI uri = new MongoClientURI("mongodb://ibm_cloud_f6d8fa38_5303_40e0_879d_ab90c68f47c8:48b64f9e7ed3a2d289c23e95709dd151b6fe52c8c7a8bd30f427b2b8e0a1d278@eb3febfe-6d7d-40a9-8ff2-10d9a215e834-0.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:31553/ibmclouddb?authSource=admin&replicaSet=replset&ssl=true",
//            mongoClientOptionsBuilder().sslEnabled(true));
//
////   MongoClient mongoClient = MongoClients.create(uri);
//
//    @Bean
//    public MongoClient mongoClient() {
//
//        ConnectionString connectionString = new ConnectionString(
//                ("mongodb://ibm_cloud_f6d8fa38_5303_40e0_879d_ab90c68f47c8:48b64f9e7ed3a2d289c23e95709dd151b6fe52c8c7a8bd30f427b2b8e0a1d278@eb3febfe-6d7d-40a9-8ff2-10d9a215e834-0.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:31553/ibmclouddb?authSource=admin&replicaSet=replset&ssl=true"));
//        MongoClient mongoClient = MongoClients.create(connectionString);
//        return mongoClient;
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return "Feedback";
//    }
//
////    @Bean
////    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
////        return new MongoTemplate(mongoClient, mongoDB);
////    }
//}
//
