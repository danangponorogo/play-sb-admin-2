
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

object buttons extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - Buttons")),format.raw/*4.42*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("buttons")),format.raw/*11.24*/("""

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
    <h1 class="h3 mb-4 text-gray-800">Buttons</h1>

    <div class="row">

        <div class="col-lg-6">

            <!-- Circle Buttons -->
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Circle Buttons</h6>
                </div>
                <div class="card-body">
                    <p>Use Font Awesome Icons (included with this theme package) along with the circle
                        buttons as shown in the examples below!</p>
                    <!-- Circle Buttons (Default) -->
                    <div class="mb-2">
                        <code>.btn-circle</code>
                    </div>
                    <a href="#" class="btn btn-primary btn-circle">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="btn btn-success btn-circle">
                        <i class="fas fa-check"></i>
                    </a>
                    <a href="#" class="btn btn-info btn-circle">
                        <i class="fas fa-info-circle"></i>
                    </a>
                    <a href="#" class="btn btn-warning btn-circle">
                        <i class="fas fa-exclamation-triangle"></i>
                    </a>
                    <a href="#" class="btn btn-danger btn-circle">
                        <i class="fas fa-trash"></i>
                    </a>
                    <!-- Circle Buttons (Small) -->
                    <div class="mt-4 mb-2">
                        <code>.btn-circle .btn-sm</code>
                    </div>
                    <a href="#" class="btn btn-primary btn-circle btn-sm">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="btn btn-success btn-circle btn-sm">
                        <i class="fas fa-check"></i>
                    </a>
                    <a href="#" class="btn btn-info btn-circle btn-sm">
                        <i class="fas fa-info-circle"></i>
                    </a>
                    <a href="#" class="btn btn-warning btn-circle btn-sm">
                        <i class="fas fa-exclamation-triangle"></i>
                    </a>
                    <a href="#" class="btn btn-danger btn-circle btn-sm">
                        <i class="fas fa-trash"></i>
                    </a>
                    <!-- Circle Buttons (Large) -->
                    <div class="mt-4 mb-2">
                        <code>.btn-circle .btn-lg</code>
                    </div>
                    <a href="#" class="btn btn-primary btn-circle btn-lg">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="btn btn-success btn-circle btn-lg">
                        <i class="fas fa-check"></i>
                    </a>
                    <a href="#" class="btn btn-info btn-circle btn-lg">
                        <i class="fas fa-info-circle"></i>
                    </a>
                    <a href="#" class="btn btn-warning btn-circle btn-lg">
                        <i class="fas fa-exclamation-triangle"></i>
                    </a>
                    <a href="#" class="btn btn-danger btn-circle btn-lg">
                        <i class="fas fa-trash"></i>
                    </a>
                </div>
            </div>

            <!-- Brand Buttons -->
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Brand Buttons</h6>
                </div>
                <div class="card-body">
                    <p>Google and Facebook buttons are available featuring each company's respective
                        brand color. They are used on the user login and registration pages.</p>
                    <p>You can create more custom buttons by adding a new color variable in the
                        <code>_variables.scss</code> file and then using the Bootstrap button variant
                        mixin to create a new style, as demonstrated in the <code>_buttons.scss</code>
                        file.</p>
                    <a href="#" class="btn btn-google btn-block"><i class="fab fa-google fa-fw"></i>
                        .btn-google</a>
                    <a href="#" class="btn btn-facebook btn-block"><i
                            class="fab fa-facebook-f fa-fw"></i> .btn-facebook</a>

                </div>
            </div>

        </div>

        <div class="col-lg-6">

            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Split Buttons with Icon</h6>
                </div>
                <div class="card-body">
                    <p>Works with any button colors, just use the <code>.btn-icon-split</code> class and
                        the markup in the examples below. The examples below also use the
                        <code>.text-white-50</code> helper class on the icons for additional styling,
                        but it is not required.</p>
                    <a href="#" class="btn btn-primary btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-flag"></i>
                        </span>
                        <span class="text">Split Button Primary</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-success btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-check"></i>
                        </span>
                        <span class="text">Split Button Success</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-info btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-info-circle"></i>
                        </span>
                        <span class="text">Split Button Info</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-warning btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-exclamation-triangle"></i>
                        </span>
                        <span class="text">Split Button Warning</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-danger btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-trash"></i>
                        </span>
                        <span class="text">Split Button Danger</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-secondary btn-icon-split">
                        <span class="icon text-white-50">
                            <i class="fas fa-arrow-right"></i>
                        </span>
                        <span class="text">Split Button Secondary</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-light btn-icon-split">
                        <span class="icon text-gray-600">
                            <i class="fas fa-arrow-right"></i>
                        </span>
                        <span class="text">Split Button Light</span>
                    </a>
                    <div class="mb-4"></div>
                    <p>Also works with small and large button classes!</p>
                    <a href="#" class="btn btn-primary btn-icon-split btn-sm">
                        <span class="icon text-white-50">
                            <i class="fas fa-flag"></i>
                        </span>
                        <span class="text">Split Button Small</span>
                    </a>
                    <div class="my-2"></div>
                    <a href="#" class="btn btn-primary btn-icon-split btn-lg">
                        <span class="icon text-white-50">
                            <i class="fas fa-flag"></i>
                        </span>
                        <span class="text">Split Button Large</span>
                    </a>
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
    """),_display_(/*212.6*/inc_footer()),format.raw/*212.18*/("""

"""),format.raw/*214.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*225.6*/inc_bottom()),format.raw/*225.18*/("""
    
    """),format.raw/*227.5*/("""</body>
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
                  DATE: 2021-01-31T09:57:17.567
                  SOURCE: D:/playframework/projects/starter/app/views/buttons.scala.html
                  HASH: c59a2455b3f6ce9c838bb7a8cd0e453e83f2b850
                  MATRIX: 991->0|1070->53|1122->85|1153->90|1272->183|1315->205|1348->211|1533->370|1566->382|1595->384|10470->9232|10504->9244|10534->9246|10827->9512|10861->9524|10899->9534
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|243->212|243->212|245->214|256->225|256->225|258->227
                  -- GENERATED --
              */
          