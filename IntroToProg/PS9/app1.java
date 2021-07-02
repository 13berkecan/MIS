import java.security.SecureRandom;

public class app1 {
    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        System.out.println(sentenceGenerator(articles, nouns, verbs, prepositions));
    }

    public static String sentenceGenerator(String[] articles, String[] nouns, 
                                           String[] verbs, String[] prepositions) {
        SecureRandom random = new SecureRandom();  
        int randomArticleIndex = random.nextInt(articles.length);
        int randomNounIndex = random.nextInt(nouns.length);
        int randomVerbIndex = random.nextInt(verbs.length);
        int randomPrepositionIndex = random.nextInt(prepositions.length);
        int randomNounEndIndex = random.nextInt(nouns.length);
        
        String randomSentence = articles[randomArticleIndex].substring(0,1).toUpperCase() +
                                articles[randomArticleIndex].substring(1) + " ";

        return randomSentence.concat(nouns[randomNounIndex] + " ")
                             .concat(verbs[randomVerbIndex] + " ")
                             .concat(prepositions[randomPrepositionIndex] + " ")
                             .concat(nouns[randomNounEndIndex] + ".");
    }
}

/*
Write an application that uses random-number generation to create sentences. 
Use four arrays of strings called article, noun, verb and preposition. 
Create a sentence by selecting a word at random from each array in the following order: 
article, noun, verb, preposition, article and noun. As each word is picked, 
concatenate it to the previous words in the sentence. The words should be separated by spaces. 
When the final sentence is output, it should start with a capital letter and end with a period. 
The application should generate and display 20 sentences. 
The article array should contain the articles "the", "a", "one", "some" and "any"; 
the noun array should contain the nouns "boy", "girl", "dog", "town" and "car"; 
the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; 
the preposition array should contain the prepositions "to", "from", "over", "under" and "on".
*/