package cook_book.chapter_8_traits._6_marking_traits_so_they_can_only_be_used_by_subclasses_of_a_certain_class

object Demo extends App {




}


trait StarfleetWarpCore {
  this: Starship =>
}
class Starship
class Enterprise extends Starship with StarfleetWarpCore


class RomulanShip
// doesn't compile
// class Warbird extends RomulanShip with StarfleetWarpCore
