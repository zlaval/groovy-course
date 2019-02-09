package com.zlrx.groovy

class Developer {

    String firstName
    String lastName
    public def progLangs = []

    void work() {
        if (firstName && lastName)
            println "name has value"

        println "$firstName $lastName is working..."

        for (p in progLangs)
            println "$p"

        progLangs.each {
            println it
        }

    }

    void decision(number) {
        switch (number) {
            case 1:
                println "number is 1"
                break
            default:
                println "default"
        }

    }

    static void main(String[] args) {
        Developer d = new Developer()
        d.firstName = "Joe"
        d.setLastName("Doe")
        d.progLangs << "Java"
        d.progLangs << "Kotlin"
        d.progLangs << "Groovy"

        d.work()
        d.decision(10)
    }

}
