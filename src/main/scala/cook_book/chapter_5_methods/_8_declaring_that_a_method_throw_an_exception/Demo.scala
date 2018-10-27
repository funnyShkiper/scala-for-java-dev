package cook_book.chapter_5_methods._8_declaring_that_a_method_throw_an_exception

import java.io.IOException

import javax.sound.sampled.{LineUnavailableException, UnsupportedAudioFileException}

object Demo extends App {

  @throws(classOf[IOException])
  @throws(classOf[LineUnavailableException])
  @throws(classOf[UnsupportedAudioFileException])
  def playSoundWithJavaAudio(): Unit = {

  }

}



