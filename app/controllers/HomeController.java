package controllers;

/*
import java.util.HashMap;
import javax.inject.Inject;
import play.libs.Json;
*/
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
/* 
  private final AssetsFinder assetsFinder;

  @Inject
  public HomeController(AssetsFinder assetsFinder) {
    this.assetsFinder = assetsFinder;
  }
 */
  public Result index() {
    return ok(index.render());
  }

  public Result buttons() {
    return ok(buttons.render());
  }

  public Result cards() {
    return ok(cards.render());
  }

  public Result colors() {
    return ok(colors.render());
  }

  public Result borders() {
    return ok(borders.render());
  }

  public Result animations() {
    return ok(animations.render());
  }

  public Result others() {
    return ok(others.render());
  }

  public Result login() {
    return ok(login.render());
  }

  public Result register() {
    return ok(register.render());
  }

  public Result forgot() {
    return ok(forgot.render());
  }

  public Result error() {
    return ok(error.render());
  }

  public Result blank() {
    return ok(blank.render());
  }

  public Result charts() {
    return ok(charts.render());
  }

  public Result tables() {
    return ok(tables.render());
  }
/* 
  public Result returnMap() {
    HashMap<String, Object> result = new HashMap<String, Object>() {
      {
        put("attendes", 15);
        put("when", "In a day off!!!");
      }
    };
    return ok(Json.toJson(result));
  }
 */
}
