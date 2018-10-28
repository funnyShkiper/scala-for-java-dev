def wrap(prefix: String, html: String, suffix: String): String = {
  prefix + html + suffix
}

val wrapWithDiv = wrap("<div>", _: String, "</div>")
wrapWithDiv("<p>Hello world</p>")
wrapWithDiv("""<img src="/images/foo.png"></img>""")