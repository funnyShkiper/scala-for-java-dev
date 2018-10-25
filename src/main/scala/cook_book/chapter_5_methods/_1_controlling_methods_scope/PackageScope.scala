package cook_book.chapter_5_methods._1_controlling_methods_scope

class PackageScope {

}

package com.acme.coolapp.model {
  class FooPackageScope {
    private[model] def doX {}
    private def doY {}
  }

  class BarPackageScope {
    val f = new FooPackageScope
    f.doX

    // compile error
    // f.doY
  }
}
