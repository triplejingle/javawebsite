package DataAccesLayerTest;

import Models.Artist;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IDAL {
 @Before
 public void test(){
  System.out.println("before test");
 }
 @Test
 public void after(){
  Artist i=mock(Artist.class);
  when(i.getLastname()).thenReturn("test");
  i.setLastname("hallo");
  assertEquals("test",i.getLastname());
  System.out.println(i.getLastname());
 }
}
