package com.learning.OllamaAndNLP.Helpers;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Tokenizer {
    StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

    public Tokenizer()
    {}
    public List<CoreLabel> Tokenize(String input) throws Exception
    {
        if(input==null|| input.equals(""))
        {
            throw new Exception("Invalid Input");
        }
        CoreDocument coreDocument = new CoreDocument(input);
        return coreDocument.tokens();
    }
}
