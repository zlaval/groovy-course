package com.zlrx.groovy

class Closures {


    static void main(String[] args) {
        def closures = new Closures()
        closures.sayHello('Zalan')

        List l = [0, 1, 4, 6, 74, 1, 12, 43, 21]
        l.each { println it }

        closures.timesTen(2, { println it })
        closures.timesTen(10) {
            println it
        }

        10.times {
            println it
        }

        closures.noparams()
        closures.sayHelloTo("Zalan", "Toth")
        closures.sayHelloTo("Joe")
        println closures.concat("asdf", "dfgh", "ghjk")
    }

    def sayHello = { name ->
        println "Hello $name"
    }

    def sayHelloTo = { String first, String last = "Doe" ->
        println "Hello $first $last"
    }


    def timesTen(num, closure) {
        closure(num * 10)
    }

    def noparams = { ->
        println "Noparam pls"
    }

    def concat = { String... args ->
        args.join(" ")
    }


}
