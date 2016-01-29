class BootStrap {

    def init = { servletContext ->
        def p = new demo.Person(name: 'Jeff')
        p.addToAddresses(town: 'St. Louis')
        p.addToAddresses(town: 'OFallon')
        p.save(failOnError: true)
    }
    def destroy = {
    }
}
