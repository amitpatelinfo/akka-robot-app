import akka.actor.{Props, ActorSystem}

object ScalaBotMain extends App {
  // Create the 'helloakka' actor system
  val system = ActorSystem("helloakka")
  // Create the 'akkaBot' actor
  val akkaBot = system.actorOf(Props[ScalaAkkaBot], "akkaBot")

  akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.FORWARD)
  akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.BACKWARDS)
  akkaBot ! ScalaAkkaBot.Stop

  println("ScalaBotMain Actor System was created")  
}


