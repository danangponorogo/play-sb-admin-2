
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    """),_display_(/*5.6*/inc_head("SB Admin 2 - Login")),format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""</head>

<body class="bg-gradient-primary">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                    </div>
                                    <form class="user">
                                        <div class="form-group">
                                            <input type="email" class="form-control form-control-user"
                                                id="exampleInputEmail" aria-describedby="emailHelp"
                                                placeholder="Enter Email Address...">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user"
                                                id="exampleInputPassword" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Remember
                                                    Me</label>
                                            </div>
                                        </div>
                                        <a href="/" class="btn btn-primary btn-user btn-block">
                                            Login
                                        </a>
                                        <hr>
                                        <a href="/" class="btn btn-google btn-user btn-block">
                                            <i class="fab fa-google fa-fw"></i> Login with Google
                                        </a>
                                        <a href="/" class="btn btn-facebook btn-user btn-block">
                                            <i class="fab fa-facebook-f fa-fw"></i> Login with Facebook
                                        </a>
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <a class="small" href="/forgot">Forgot Password?</a>
                                    </div>
                                    <div class="text-center">
                                        <a class="small" href="/register">Create an Account!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*75.73*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*76.89*/("""" type="text/javascript"></script>
    
    <!-- Core plugin JavaScript-->
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("vendor/jquery-easing/jquery.easing.min.js")),format.raw/*79.87*/("""" type="text/javascript"></script>
    
    <!-- Custom scripts for all pages-->
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("js/sb-admin-2.min.js")),format.raw/*82.66*/("""" type="text/javascript"></script>    

</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T11:44:03.767
                  SOURCE: D:/playframework/projects/starter/app/views/login.scala.html
                  HASH: 9467d1899a983b900247f0cb2d9503136966b9ce
                  MATRIX: 989->0|1064->50|1114->80|1142->82|4841->3754|4856->3760|4925->3808|5006->3862|5021->3868|5106->3932|5229->4028|5244->4034|5327->4096|5456->4198|5471->4204|5533->4245
                  LINES: 32->1|36->5|36->5|37->6|106->75|106->75|106->75|107->76|107->76|107->76|110->79|110->79|110->79|113->82|113->82|113->82
                  -- GENERATED --
              */
          