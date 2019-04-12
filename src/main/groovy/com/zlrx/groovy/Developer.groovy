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

    void pattern() {
        def text = "Hi, I'm your computer"
        def pattern = ~/your/
        def finder = text =~ pattern
        def matcher = text ==~ pattern
        println finder.size()
        println matcher
    }

    void range() {
        Range r = 1..10
        println r
        Range s = 1..<10
        println s
    }

    void lists() {
        def nums = [1, 2, 3, 4, 5, 4, 7] as LinkedList
        println nums
        def newList = nums + [8, 2]
        println newList
        nums << 10
        println nums
        nums.pop()
        println nums
        def newerList = nums - 4
        println newerList


        println nums
        println nums[0..<4]

    }

    void maps() {
        def map = [:]
        println map
        def addressKey = "Address key"
        def person = [first: "Joe", last: "Doe", email: "jdk@mail.com", (addressKey): "Bp"]
        println person
        println person.last
        person.facebook = "joedoefb"
        println person
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
        def path = $/C:\groovy\file/$
        println path
        def multiline = '''hi this
                        is multiline'''
        println multiline

        d.pattern()
        d.range()
        d.lists()
        d.maps()
    }

}
