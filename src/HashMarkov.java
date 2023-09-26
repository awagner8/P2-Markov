import java.util.HashMap;
import java.util.List;

public class HashMarkov implements MarkovInterface {

    protected HashMap<WordGram, List<String>> myMap;
    
    public HashMarkov() {
		this(3);
	}

    public HashMarkov(int order) {
        myMap = new HashMap<>();
    } 


    @Override
    public void setTraining(String text) {
        // TODO Auto-generated method stub


        throw new UnsupportedOperationException("Unimplemented method 'setTraining'");
    }

    @Override
    public List<String> getFollows(WordGram wgram) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFollows'");
    }

    @Override
    public String getRandomText(int length) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRandomText'");
    }

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

    @Override
    public void setSeed(long seed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSeed'");
    }
    
}
