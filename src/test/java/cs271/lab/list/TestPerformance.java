package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerformance {

  // DONE run test and record running times for SIZE = 10, 100, 1000, 10000, ...
  // (choose in conjunction with REPS below up to an upper limit where the clock
  // running time is in the tens of seconds)
  // DONE refactor to DRY
  // which of the two lists performs better as the size increases?
  private final int SIZE = 10;

  // DONE choose this value in such a way that you can observe an actual effect
  // for increasing problem sizes
  private final int REPS = 10000000;

  private List<Integer> arrayList;

  private List<Integer> linkedList;

  public void addRemove(List<Integer> list ){
    for (int r = 0; r < REPS; r++) {
      list.add(0, 77);
      list.remove(0);
    }
  }
  
  public void listAccess(List<Integer> list){
     long sum = 0;
    for (int r = 0; r < REPS; r++) {
      sum += list.get(r % SIZE);
    }
  }

  @Before
  public void setUp() throws Exception {
    arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (int i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  @After
  public void tearDown() throws Exception {
    arrayList = null;
    linkedList = null;
  }


  @Test
  public void testLinkedListAddRemove() {
    addRemove(linkedList);
  }

  @Test
  public void testArrayListAddRemove() {
    addRemove(arrayList);
  }

  @Test
  public void testLinkedListAccess() {
    listAccess(linkedList);
  }

  @Test
  public void testArrayListAccess() {
    listAccess(arrayList);
  }
}