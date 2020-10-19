package stepdefs;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.math.BigDecimal;
import triangle.TriangleUtils;

public class TriangleSteps {

  private BigDecimal side1;
  private BigDecimal side2;
  private BigDecimal side3;
  private boolean actualAnswer;

  @Given("three sides {string}, {string}, {string}")
  public void three_sides(String side1, String side2, String side3) {
    this.side1 = new BigDecimal(side1);
    this.side2 = new BigDecimal(side2);
    this.side3 = new BigDecimal(side3);
  }

  @When("I ask whether the triangle is valid")
  public void i_ask_whether_the_triangle_is_valid() {
    actualAnswer = TriangleUtils.isValidTriagleSides(side1, side2, side3);
  }

  @Then("Is the triangle valid {string}")
  public void is_the_triangle_valid(String expectedAnswer) {
    assertEquals(expectedAnswer, String.valueOf(actualAnswer));
  }
}
