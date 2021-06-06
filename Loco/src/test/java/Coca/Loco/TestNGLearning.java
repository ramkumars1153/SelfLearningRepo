package Coca.Loco;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGLearning {
  @Test(priority=-1)
  public void A() {
	  System.out.println("A");
  }
  
  @Test(priority=1)
  public void E() {
	  System.out.println("a");
  }
  
  @Test(priority=0)
  public void B() {
	  System.out.println("B");
  }
  
  @Test()
  public void C() {
	  System.out.println("C");
  }
  
  @Test(priority=2)
  public void D() {
	  System.out.println("D");
  }
}
