package cook_book.chapter_4_classes_and_properties._12_when_to_use_an_abstract_class

object Start extends App {

}

/**
  * Абстрактные классы стоит использовать если необходимо задать параметры в конструкторе абстрактного класса
  * Если нет необходимости задавать параметры - целесообразней использовать trait
  * */
abstract class BaseController(db: Database) {

  def save() {db.save()}
  def update() {db.update()}
  def delete() {db.delete()}

  def connect()

  def getStatus: String

  def setServerName(name: String)

}

abstract class Database {
  def save()
  def update()
  def delete()
}





