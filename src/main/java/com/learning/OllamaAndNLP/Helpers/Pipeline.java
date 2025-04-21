package com.learning.OllamaAndNLP.Helpers;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    private static Properties properties;
    private static StanfordCoreNLP stanfordCoreNLP;
    private static String propertiesName="tokenize,ssplit";
    // Private constructor to prevent instantiation and enforce singleton pattern
    private Pipeline()
    {

    }
    static{
        properties = new Properties();
        properties.setProperty("Annotators",propertiesName);
    }
    public static StanfordCoreNLP getPipeline()
    {
        if(stanfordCoreNLP==null)
        {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }

}
