package gq.noxiuam.mongofucker.impl;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import gq.noxiuam.mongofucker.data.StringUtil;

import org.bson.Document;

public class MongoFucker {

    private final StringUtil stringUtil = new StringUtil();

    public MongoFucker(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase db = mongoClient.getDatabase(stringUtil.getRandomizedString());
        
        new Thread(() -> {

            for (int i = 0; i < 2; i++) {
                try {
                    Document document = new Document(stringUtil.getRandomizedString(), stringUtil.getRandomizedString());

                    for (int j = 0; j < 69; j++) {
                        document.append(stringUtil.getRandomizedString(), stringUtil.getRandomizedString())
                                .append(stringUtil.getRandomizedString(), stringUtil.getRandomizedString())
                                .append(stringUtil.getRandomizedString(), stringUtil.getRandomizedString())
                                .append(stringUtil.getRandomizedString(), stringUtil.getRandomizedString());
                    }

                        db.getCollection(stringUtil.getRandomizedString()).insertOne(document);
                    System.out.println("Made document on db: " + document);
                } catch (NullPointerException ex) {
                    ex.printStackTrace();
                }
            }

        }).start();
    }

}
