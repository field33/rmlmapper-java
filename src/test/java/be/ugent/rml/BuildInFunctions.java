package be.ugent.rml;

import be.ugent.rml.functions.lib.IDLabFunctions;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BuildInFunctions extends TestCore {

    @Test
    public void dbpediaSpotlight() {
        List<String> entities = IDLabFunctions.dbpediaSpotlight("Barack Obama", "https://api.dbpedia-spotlight.org/en");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("http://dbpedia.org/resource/Barack_Obama");

        assertThat(entities, CoreMatchers.is(expected));

        entities = IDLabFunctions.dbpediaSpotlight("", "https://api.dbpedia-spotlight.org/en");
        expected = new ArrayList<>();

        assertThat(entities, CoreMatchers.is(expected));

        entities = IDLabFunctions.dbpediaSpotlight("a", "https://api.dbpedia-spotlight.org/en");
        expected = new ArrayList<>();

        assertThat(entities, CoreMatchers.is(expected));
    }
}
