package upo.rps.test;
import org.testng.annotations.*;
import upo.rps.model.Player;
import upo.rps.model.RPSEnum;
import upo.rps.model.Result;
import upo.rps.model.RockPaperScissors;

import static org.testng.Assert.assertEquals;

/**
 * Created by leamsiollaid on 14/09/15.
 */
public class TestRockPapersScissors {
    private RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps= new RockPaperScissors();
        /*Player p1=new Player("momo");
        Player p2=new Player("toto");*/
    }

    @AfterClass
    public void tearDown() throws Exception {
        rps=null;
    }
    /*
    //This method will provide data to any test method that declares that its Data Provider
//is named "test1"
    @DataProvider(name = "winData")
    public Object[][] createWinData() {
        return new Object[][] {
                { "PAPER", "ROCK" },
                { "SCISSORS","PAPER"},
                { "ROCK","SCISSORS"},

        };
    }


    @DataProvider(name = "lostData")
    public Object[][] createLostData() {
        return new Object[][] {
                { "SCISSORS", "ROCK" },
                { "ROCK","PAPER"},
                { "PAPER","SCISSORS"},

        };
    }*/

    @DataProvider(name = "tieData")
    public Object[][] createTieData() {
        return new Object[][] {
                { "SCISSORS", "SCISSORS" },
        };
    }

  /* // @Parameters({"Paper","Rock"})
    @Test(dataProvider="winData")
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Test(dataProvider="lostData")
    public void testLostPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }*/

    @Test(dataProvider="tieData")
    public void testTiePlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

}
