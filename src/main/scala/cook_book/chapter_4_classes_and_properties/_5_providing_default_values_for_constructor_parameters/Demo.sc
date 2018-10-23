class Socket(val timeout: Int = 10000)

val s = new Socket()
println(s.timeout)

val socket = new Socket(20000)
println(socket.timeout)



