import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class BearTest {

  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    human = new Human();
    salmon = new Salmon();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
    public void canEatChicken() 
    {
      bear.eat(chicken);
      assertEquals(bear.foodCount(), 1);
    }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatHuman() {
    bear.eat(human);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canThrowUpSalmon() {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    assertNotNull(food);
    Salmon original = (Salmon)food;
    assertEquals("swimming", original.swim());
  }

  @Test
  public void canThrowUpChicken() {
     bear.eat(chicken);
     Edible food = bear.throwUp();
     assertNotNull(food);
     Chicken original = (Chicken)food;
     assertEquals("swimming", original.swim());
   }

   @Test
   public void canChickenCluck() {
    assertEquals("Cluck!", chicken.cluck());
   }

   @Test
   public void nutritionValue() {
    bear.eat(salmon);
    bear.eat(human);
    bear.eat(chicken);
    assertEquals(?, bear.)
   }
 }
  