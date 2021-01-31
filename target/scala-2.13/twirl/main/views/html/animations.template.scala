
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

object animations extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - Animations")),format.raw/*4.45*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("animations")),format.raw/*11.27*/("""

    """),format.raw/*13.5*/("""<!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

<!-- Topbar -->
"""),_display_(/*20.2*/inc_topbar()),format.raw/*20.14*/("""

"""),format.raw/*22.1*/("""<!--/ Content /-->
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-1 text-gray-800">Animation Utilities</h1>
                    <p class="mb-4">Bootstrap's default utility classes can be found on the official <a
                            href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities
                        below were created to extend this theme past the default utility classes built into Bootstrap's
                        framework.</p>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Grow In Utility -->
                        <div class="col-lg-6">

                            <div class="card position-relative">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Grow In Animation Utilty</h6>
                                </div>
                                <div class="card-body">
                                    <div class="mb-3">
                                        <code>.animated--grow-in</code>
                                    </div>
                                    <div class="small mb-1">Navbar Dropdown Example:</div>
                                    <nav class="navbar navbar-expand navbar-light bg-light mb-4">
                                        <a class="navbar-brand" href="#">Navbar</a>
                                        <ul class="navbar-nav ml-auto">
                                            <li class="nav-item dropdown">
                                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
                                                    role="button" data-toggle="dropdown" aria-haspopup="true"
                                                    aria-expanded="false">
                                                    Dropdown
                                                </a>
                                                <div class="dropdown-menu dropdown-menu-right animated--grow-in"
                                                    aria-labelledby="navbarDropdown">
                                                    <a class="dropdown-item" href="#">Action</a>
                                                    <a class="dropdown-item" href="#">Another action</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item" href="#">Something else here</a>
                                                </div>
                                            </li>
                                        </ul>
                                    </nav>
                                    <p class="mb-0 small">Note: This utility animates the CSS transform property,
                                        meaning it will override any existing transforms on an element being animated!
                                        In this theme, the grow in animation is only being used on dropdowns within the
                                        navbar.</p>
                                </div>
                            </div>

                        </div>

                        <!-- Fade In Utility -->
                        <div class="col-lg-6">

                            <div class="card position-relative">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Fade In Animation Utilty</h6>
                                </div>
                                <div class="card-body">
                                    <div class="mb-3">
                                        <code>.animated--fade-in</code>
                                    </div>
                                    <div class="small mb-1">Navbar Dropdown Example:</div>
                                    <nav class="navbar navbar-expand navbar-light bg-light mb-4">
                                        <a class="navbar-brand" href="#">Navbar</a>
                                        <ul class="navbar-nav ml-auto">
                                            <li class="nav-item dropdown">
                                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
                                                    role="button" data-toggle="dropdown" aria-haspopup="true"
                                                    aria-expanded="false">
                                                    Dropdown
                                                </a>
                                                <div class="dropdown-menu dropdown-menu-right animated--fade-in"
                                                    aria-labelledby="navbarDropdown">
                                                    <a class="dropdown-item" href="#">Action</a>
                                                    <a class="dropdown-item" href="#">Another action</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item" href="#">Something else here</a>
                                                </div>
                                            </li>
                                        </ul>
                                    </nav>
                                    <div class="small mb-1">Dropdown Button Example:</div>
                                    <div class="dropdown mb-4">
                                        <button class="btn btn-primary dropdown-toggle" type="button"
                                            id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">
                                            Dropdown
                                        </button>
                                        <div class="dropdown-menu animated--fade-in"
                                            aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                    <p class="mb-0 small">Note: This utility animates the CSS opacity property, meaning
                                        it will override any existing opacity on an element being animated!</p>
                                </div>
                            </div>

                        </div>

                    </div>

                </div>
                <!-- /.container-fluid -->
<!--/ End of Content /-->

    </div>
    <!-- End of Main Content -->

    <!-- Footer -->
    """),_display_(/*138.6*/inc_footer()),format.raw/*138.18*/("""

"""),format.raw/*140.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*151.6*/inc_bottom()),format.raw/*151.18*/("""

"""),format.raw/*153.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T10:25:22.812
                  SOURCE: D:/playframework/projects/starter/app/views/animations.scala.html
                  HASH: 4a48fa9a85dfc5818c76fd2b8dd5f650b7d8daf5
                  MATRIX: 994->0|1073->53|1128->88|1159->93|1278->186|1324->211|1357->217|1542->376|1575->388|1604->390|8908->7667|8942->7679|8972->7681|9265->7947|9299->7959|9329->7961
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|169->138|169->138|171->140|182->151|182->151|184->153
                  -- GENERATED --
              */
          