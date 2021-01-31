
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

object inc_head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Play starter with Java and Bootstrap">
<meta name="author" content="Danang Ponorogo">
    """),format.raw/*8.58*/("""
"""),format.raw/*9.1*/("""<title>"""),_display_(/*9.9*/title),format.raw/*9.14*/("""</title>
<link rel="stylesheet" type="text/css" href=""""),_display_(/*10.47*/routes/*10.53*/.Assets.versioned("vendor/fontawesome-free/css/all.min.css")),format.raw/*10.113*/("""">
<link
href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
rel="stylesheet">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.versioned("css/sb-admin-2.min.css")),format.raw/*14.80*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.51*/routes/*15.57*/.Assets.versioned("img/favicon.png")),format.raw/*15.93*/("""">
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T12:13:07.572
                  SOURCE: D:/playframework/projects/starter/app/views/inc_head.scala.html
                  HASH: 275731818e7daac8fb39d08cbe6bde8b24031fa0
                  MATRIX: 910->1|1020->16|1050->20|1370->366|1398->368|1431->376|1456->381|1539->437|1554->443|1636->503|1841->681|1856->687|1920->730|2001->784|2016->790|2073->826
                  LINES: 27->1|32->1|34->3|39->8|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|45->14|46->15|46->15|46->15
                  -- GENERATED --
              */
          