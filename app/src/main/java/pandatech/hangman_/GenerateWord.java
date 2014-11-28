package pandatech.hangman_;
import java.util.Random;

/**
 * Created by fernando on 11/13/14.
 */
public class GenerateWord {

    public static String generate()
    {
        // TODO: this words shouldn't be hardcoded here. API or local DB should be used.
        String[] words = { "acres", "adult", "advice", "arrangement", "attempt", "August", "Autumn", "border", "breeze", "brick", "calm", "canal", "Casey", "cast", "chose", "claws", "coach", "constantly", "contrast", "cookies", "customs", "damage", "Danny", "deeply", "depth", "discussion", "doll", "donkey", "Egypt", "Ellen", "essential", "exchange", "exist", "explanation", "facing", "film", "finest", "fireplace", "floating", "folks", "fort", "garage", "grabbed", "grandmother", "habit", "happily", "Harry", "heading", "hunter", "Illinois", "image", "independent", "instant", "January", "kids", "label", "Lee", "lungs", "manufacturing", "Martin", "mathematics", "melted", "memory", "mill", "mission", "monkey", "Mount", "mysterious", "neighborhood", "Norway", "nuts", "occasionally", "official", "ourselves", "palace", "Pennsylvania", "Philadelphia", "plates", "poetry", "policeman", "positive", "possibly", "practical", "pride", "promised", "recall", "relationship", "remarkable", "require", "rhyme", "rocky", "rubbed", "rush", "sale", "satellites", "satisfied", "scared", "selection", "shake", "shaking", "shallow", "shout", "silly", "simplest", "slight", "slip", "slope", "soap", "solar", "species", "spin", "stiff", "swung", "tales", "thumb", "tobacco", "toy", "trap", "treated", "tune", "University", "vapor", "vessels", "wealth", "wolf", "zoo"};
        Random randomGenerator = new Random();
        randomGenerator.nextInt(words.length);
        return words[randomGenerator.nextInt(words.length)];
    }
}
