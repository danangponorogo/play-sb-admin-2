
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object inc_sidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(active: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">SB Admin <sup>2</sup></div>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="nav-item """),_display_(/*17.26*/if(active == "dashboard")/*17.51*/ {_display_(Seq[Any](format.raw/*17.53*/("""active""")))}),format.raw/*17.60*/("""">
        <a class="nav-link" href="/">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Interface
    </div>

    <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item """),_display_(/*32.26*/if(active == "buttons" || active == "cards")/*32.70*/ {_display_(Seq[Any](format.raw/*32.72*/("""active""")))}),format.raw/*32.79*/("""">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
            aria-controls="collapseTwo">
            <i class="fas fa-fw fa-cog"></i>
            <span>Components</span>
        </a>
        <div id="collapseTwo" class="collapse """),_display_(/*38.48*/if(active == "buttons" || active == "cards")/*38.92*/ {_display_(Seq[Any](format.raw/*38.94*/("""show""")))}),format.raw/*38.99*/("""" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Custom Components:</h6>
                <a class="collapse-item """),_display_(/*41.42*/if(active == "buttons")/*41.65*/ {_display_(Seq[Any](format.raw/*41.67*/("""active""")))}),format.raw/*41.74*/("""" href="/buttons">Buttons</a>
                <a class="collapse-item """),_display_(/*42.42*/if(active == "cards")/*42.63*/ {_display_(Seq[Any](format.raw/*42.65*/("""active""")))}),format.raw/*42.72*/("""" href="/cards">Cards</a>
            </div>
        </div>
    </li>

    <!-- Nav Item - Utilities Collapse Menu -->
    <li class="nav-item """),_display_(/*48.26*/if(active == "colors" || active == "borders" || active == "animations" || active == "others")/*48.119*/ {_display_(Seq[Any](format.raw/*48.121*/("""active""")))}),format.raw/*48.128*/("""">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
            aria-expanded="true" aria-controls="collapseUtilities">
            <i class="fas fa-fw fa-wrench"></i>
            <span>Utilities</span>
        </a>
        <div id="collapseUtilities" class="collapse """),_display_(/*54.54*/if(active == "colors" || active == "borders" || active == "animations" || active == "others")/*54.147*/ {_display_(Seq[Any](format.raw/*54.149*/("""show""")))}),format.raw/*54.154*/("""" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Custom Utilities:</h6>
                <a class="collapse-item """),_display_(/*57.42*/if(active == "colors")/*57.64*/ {_display_(Seq[Any](format.raw/*57.66*/("""active""")))}),format.raw/*57.73*/("""" href="/colors">Colors</a>
                <a class="collapse-item """),_display_(/*58.42*/if(active == "borders")/*58.65*/ {_display_(Seq[Any](format.raw/*58.67*/("""active""")))}),format.raw/*58.74*/("""" href="/borders">Borders</a>
                <a class="collapse-item """),_display_(/*59.42*/if(active == "animations")/*59.68*/ {_display_(Seq[Any](format.raw/*59.70*/("""active""")))}),format.raw/*59.77*/("""" href="/animations">Animations</a>
                <a class="collapse-item """),_display_(/*60.42*/if(active == "others")/*60.64*/ {_display_(Seq[Any](format.raw/*60.66*/("""active""")))}),format.raw/*60.73*/("""" href="/others">Other</a>
            </div>
        </div>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Addons
    </div>

    <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item """),_display_(/*74.26*/if(active == "error" || active == "blank")/*74.68*/ {_display_(Seq[Any](format.raw/*74.70*/("""active""")))}),format.raw/*74.77*/("""">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true"
            aria-controls="collapsePages">
            <i class="fas fa-fw fa-folder"></i>
            <span>Pages</span>
        </a>
        <div id="collapsePages" class="collapse """),_display_(/*80.50*/if(active == "error" || active == "blank")/*80.92*/ {_display_(Seq[Any](format.raw/*80.94*/("""show""")))}),format.raw/*80.99*/("""" aria-labelledby="headingPages" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Login Screens:</h6>
                <a class="collapse-item" href="/login">Login</a>
                <a class="collapse-item" href="/register">Register</a>
                <a class="collapse-item" href="/forgot">Forgot Password</a>
                <div class="collapse-divider"></div>
                <h6 class="collapse-header">Other Pages:</h6>
                <a class="collapse-item """),_display_(/*88.42*/if(active == "error")/*88.63*/ {_display_(Seq[Any](format.raw/*88.65*/("""active""")))}),format.raw/*88.72*/("""" href="/error">404 Page</a>
                <a class="collapse-item """),_display_(/*89.42*/if(active == "blank")/*89.63*/ {_display_(Seq[Any](format.raw/*89.65*/("""active""")))}),format.raw/*89.72*/("""" href="/blank">Blank Page</a>
            </div>
        </div>
    </li>

    <!-- Nav Item - Charts -->
    <li class="nav-item """),_display_(/*95.26*/if(active == "charts")/*95.48*/ {_display_(Seq[Any](format.raw/*95.50*/("""active""")))}),format.raw/*95.57*/("""">
        <a class="nav-link" href="/charts">
            <i class="fas fa-fw fa-chart-area"></i>
            <span>Charts</span></a>
    </li>

    <!-- Nav Item - Tables -->
    <li class="nav-item """),_display_(/*102.26*/if(active == "tables")/*102.48*/ {_display_(Seq[Any](format.raw/*102.50*/("""active""")))}),format.raw/*102.57*/("""">
        <a class="nav-link" href="/tables">
            <i class="fas fa-fw fa-table"></i>
            <span>Tables</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">

    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>

    <!-- Sidebar Message -->
    <div class="sidebar-card d-none">
        <img class="sidebar-card-illustration mb-2" src=""""),_display_(/*118.59*/routes/*118.65*/.Assets.versioned("img/undraw_rocket.svg")),format.raw/*118.107*/("""" alt="">
        <p class="text-center mb-2"><strong>SB Admin Pro</strong> is packed with premium features, components, and
            more!</p>
        <a class="btn btn-success btn-sm" href="https://startbootstrap.com/theme/sb-admin-pro">Upgrade to Pro!</a>
    </div>

</ul>
<!-- End of Sidebar -->"""))
      }
    }
  }

  def render(active:String): play.twirl.api.HtmlFormat.Appendable = apply(active)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (active) => apply(active)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T12:07:32.952
                  SOURCE: D:/playframework/projects/starter/app/views/inc_sidebar.scala.html
                  HASH: a44db6d1a43ce95348bdaf310420e7f1add1c326
                  MATRIX: 913->1|1024->17|1052->19|1651->591|1685->616|1725->618|1763->625|2161->996|2214->1040|2254->1042|2292->1049|2628->1358|2681->1402|2721->1404|2757->1409|3023->1648|3055->1671|3095->1673|3133->1680|3232->1752|3262->1773|3302->1775|3340->1782|3517->1932|3620->2025|3661->2027|3700->2034|4056->2363|4159->2456|4200->2458|4237->2463|4508->2707|4539->2729|4579->2731|4617->2738|4714->2808|4746->2831|4786->2833|4824->2840|4923->2912|4958->2938|4998->2940|5036->2947|5141->3025|5172->3047|5212->3049|5250->3056|5569->3348|5620->3390|5660->3392|5698->3399|6038->3712|6089->3754|6129->3756|6165->3761|6761->4330|6791->4351|6831->4353|6869->4360|6967->4431|6997->4452|7037->4454|7075->4461|7240->4599|7271->4621|7311->4623|7349->4630|7586->4839|7618->4861|7659->4863|7698->4870|8258->5402|8274->5408|8339->5450
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|48->17|63->32|63->32|63->32|63->32|69->38|69->38|69->38|69->38|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|79->48|79->48|79->48|79->48|85->54|85->54|85->54|85->54|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|105->74|105->74|105->74|105->74|111->80|111->80|111->80|111->80|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|126->95|126->95|126->95|126->95|133->102|133->102|133->102|133->102|149->118|149->118|149->118
                  -- GENERATED --
              */
          