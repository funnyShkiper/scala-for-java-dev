package cook_book.chapter_8_traits._5_limiting_which_classes_can_use_a_trait_by_inheretance

object Demo extends App {

}


class StarfleetComponent
trait StarfleetWarpCore extends StarfleetComponent
class Starship extends StarfleetComponent with StarfleetWarpCore


class RomulanStuff

// won't compile
class Warbird extends RomulanStuff with StarfleetWarpCore


