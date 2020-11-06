import linklist.LinkList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLinkList {

    private static LinkList linkList= new LinkList();

    @BeforeAll
    @DisplayName("Link List Create Test")
    public static void testCreateList(){
        linkList.createList(5);
        linkList.insertAtEnd(6);
        linkList.insertAtEnd(8);
        linkList.inserAtStart(10);
    }

    @Test
    @DisplayName("Link List Size Test = 4")
    public void testListSize(){
        Assertions.assertEquals(4,linkList.listLength());
    }

    @Test
    @DisplayName("Insert At Start Test = 10")
    public void testInsertStart(){
        Assertions.assertEquals(10,linkList.getFirst());
    }

    @Test
    @DisplayName("Reverse List by Iteration Test = 8")
    public void reverseItrTest(){
        linkList.reverseItr(linkList.getHead());
        Assertions.assertEquals(8,linkList.getFirst());
    }

}
